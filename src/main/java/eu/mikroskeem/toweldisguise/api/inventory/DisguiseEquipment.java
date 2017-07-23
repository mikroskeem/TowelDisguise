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

package eu.mikroskeem.toweldisguise.api.inventory;

import org.bukkit.entity.Entity;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;


/**
 * {@link eu.mikroskeem.toweldisguise.api.disguise.Disguise} equipment interface with sane default methods
 *
 * @author Mark Vainomaa
 */
public interface DisguiseEquipment extends EntityEquipment {
    @Override
    default ItemStack getItemInHand() {
        return getItemInMainHand();
    }

    @Override
    default void setItemInHand(ItemStack stack) {
        setItemInMainHand(stack);
    }

    @Override
    default void setArmorContents(ItemStack[] items) {
        setBoots(items[0]);
        setLeggings(items[1]);
        setChestplate(items[2]);
        setHelmet(items[3]);
    }

    @Override
    default void clear() {
        setBoots(null);
        setLeggings(null);
        setChestplate(null);
        setHelmet(null);
    }

    @Override
    default float getItemInHandDropChance() {
        throw new UnsupportedOperationException("Not supported on disguise!");
    }

    @Override
    default void setItemInHandDropChance(float chance) {
        throw new UnsupportedOperationException("Not supported on disguise!");
    }

    @Override
    default float getItemInMainHandDropChance() {
        throw new UnsupportedOperationException("Not supported on disguise!");
    }

    @Override
    default void setItemInMainHandDropChance(float chance) {
        throw new UnsupportedOperationException("Not supported on disguise!");
    }

    @Override
    default float getItemInOffHandDropChance() {
        throw new UnsupportedOperationException("Not supported on disguise!");
    }

    @Override
    default void setItemInOffHandDropChance(float chance) {
        throw new UnsupportedOperationException("Not supported on disguise!");
    }

    @Override
    default float getHelmetDropChance() {
        throw new UnsupportedOperationException("Not supported on disguise!");
    }

    @Override
    default void setHelmetDropChance(float chance) {
        throw new UnsupportedOperationException("Not supported on disguise!");
    }

    @Override
    default float getChestplateDropChance() {
        throw new UnsupportedOperationException("Not supported on disguise!");
    }

    @Override
    default void setChestplateDropChance(float chance) {
        throw new UnsupportedOperationException("Not supported on disguise!");
    }

    @Override
    default float getLeggingsDropChance() {
        throw new UnsupportedOperationException("Not supported on disguise!");
    }

    @Override
    default void setLeggingsDropChance(float chance) {
        throw new UnsupportedOperationException("Not supported on disguise!");
    }

    @Override
    default float getBootsDropChance() {
        throw new UnsupportedOperationException("Not supported on disguise!");
    }

    @Override
    default void setBootsDropChance(float chance) {
        throw new UnsupportedOperationException("Not supported on disguise!");
    }

    @Override
    default Entity getHolder() {
        throw new UnsupportedOperationException("Not supported on disguise!");
    }
}
