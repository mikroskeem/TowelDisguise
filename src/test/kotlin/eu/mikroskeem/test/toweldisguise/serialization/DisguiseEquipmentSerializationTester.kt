/*
 * This file is part of project TowelDisguise, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2017-2019 Mark Vainomaa <mikroskeem@mikroskeem.eu>
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

package eu.mikroskeem.test.toweldisguise.serialization

import com.google.gson.GsonBuilder
import eu.mikroskeem.toweldisguise.impl.DisguiseEquipmentImpl
import eu.mikroskeem.toweldisguise.serializer.DisguiseEquipmentSerializer
import eu.mikroskeem.toweldisguise.serializer.ItemStackSerializer
import eu.mikroskeem.toweldisguise.serializer.SerializerStrategy
import org.bukkit.inventory.ItemStack

/**
 * @author Mark Vainomaa
 */
class DisguiseEquipmentSerializationTester {
    private val gson = GsonBuilder()
            .registerTypeAdapter(ItemStack::class.java, ItemStackSerializer())
            .registerTypeAdapter(DisguiseEquipmentImpl::class.java, DisguiseEquipmentSerializer())
            .addSerializationExclusionStrategy(SerializerStrategy())
            .create()

    /*
    @Test
    @Ignore("StackOverflowError")
    fun testSerialize() {
        val disguise = Mockito.mock(DisguiseImpl::class.java)
        val equipment = DisguiseEquipmentImpl(disguise)

        val helmet = Mockito.mock(ItemStack::class.java)
        Mockito.`when`(helmet.type).thenReturn(Material.IRON_HELMET)
        Mockito.`when`(helmet.amount).thenReturn(1)
        Mockito.`when`(helmet.durability).thenReturn(1)

        equipment.helmet = helmet

        val json = gson.toJson(equipment)
        println(json)
    }

    @Test
    @Ignore("StackOverflowError & not done yet")
    fun testDeserialize() {
        val disguise = Mockito.mock(DisguiseImpl::class.java)
        val equipment = gson.fromJson("{}", DisguiseEquipmentImpl::class.java)
    }
    */
}