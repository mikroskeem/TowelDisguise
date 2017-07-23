/*
 * This file is part of project TowelDisguise, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2017 Mark Vainomaa <mikroskeem@mikroskeem.eu>
 * Copyright (c) Contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package eu.mikroskeem.toweldisguise.impl

import com.google.gson.annotations.SerializedName
import eu.mikroskeem.toweldisguise.api.disguise.Disguise
import eu.mikroskeem.toweldisguise.api.inventory.DisguiseEquipment
import org.bukkit.inventory.EquipmentSlot
import org.bukkit.inventory.ItemStack

/**
 * DisguiseEquipment implementation
 *
 * @author Mark Vainomaa
 */
class DisguiseEquipmentImpl(@Transient private val disguise: Disguise): DisguiseEquipment {
    @SerializedName("equipment")
    private val equipment = HashMap<EquipmentSlot, ItemStack?>()

    override fun setLeggings(leggings: ItemStack?) {
        equipment[EquipmentSlot.LEGS] = leggings
    }

    override fun getLeggings(): ItemStack? {
        return equipment[EquipmentSlot.LEGS]
    }

    override fun setChestplate(chestplate: ItemStack?) {
        equipment[EquipmentSlot.CHEST] = chestplate
    }

    override fun getChestplate(): ItemStack? {
        return equipment[EquipmentSlot.CHEST]
    }

    override fun getItemInOffHand(): ItemStack? {
        return equipment[EquipmentSlot.OFF_HAND]
    }

    override fun setItemInOffHand(item: ItemStack?) {
        equipment[EquipmentSlot.OFF_HAND] = item
    }

    override fun getItemInMainHand(): ItemStack? {
        return equipment[EquipmentSlot.HAND]
    }

    override fun setItemInMainHand(item: ItemStack?) {
        equipment[EquipmentSlot.HAND] = item
    }

    override fun getHelmet(): ItemStack? {
        return equipment[EquipmentSlot.HEAD]
    }

    override fun setHelmet(helmet: ItemStack?) {
        equipment[EquipmentSlot.HEAD] = helmet
    }

    override fun getArmorContents(): Array<out ItemStack?> {
        return arrayOf(boots, leggings, chestplate, helmet)
    }

    override fun setBoots(boots: ItemStack?) {
        equipment[EquipmentSlot.FEET] = boots
    }

    override fun getBoots(): ItemStack? {
        return equipment[EquipmentSlot.FEET]
    }
}