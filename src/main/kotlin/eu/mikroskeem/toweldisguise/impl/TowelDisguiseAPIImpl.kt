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

import eu.mikroskeem.toweldisguise.api.TowelDisguiseAPI
import eu.mikroskeem.toweldisguise.api.disguise.AppliedDisguise
import eu.mikroskeem.toweldisguise.api.disguise.Disguise
import org.bukkit.entity.Entity

/**
 * @author Mark Vainomaa
 */
class TowelDisguiseAPIImpl: TowelDisguiseAPI {
    override fun disguiseEntity(entity: Entity, disguise: Disguise): AppliedDisguise {
        TODO("not implemented") // Implement this
    }

    override fun undisguiseEntity(entity: Entity) {
        TODO("not implemented") // Implement this
    }
}