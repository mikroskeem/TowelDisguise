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

package eu.mikroskeem.toweldisguise.api.flagwatcher;

import com.comphenix.protocol.wrappers.WrappedGameProfile;
import org.bukkit.block.BlockFace;
import org.bukkit.inventory.MainHand;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


/**
 * {@link org.bukkit.entity.Player} watcher
 *
 * @author Mark Vainomaa
 */
public interface PlayerWatcher extends LivingEntityWatcher {
    float getAdditionalHearts();
    void setAdditionalHearts(float additionalHearts);

    int getScore();
    void setScore(int score);

    MainHand getMainHand();
    void setMainHand(MainHand mainHand);

    boolean isHandActive();
    void setHandActive(boolean active);

    int getSkinFlags();

    boolean isDisplayedInTab();
    void setDisplayedInTab(boolean displayedInTab);

    WrappedGameProfile getGameProfile();
    void setGameProfile(@NotNull WrappedGameProfile gameProfile);

    boolean isSleeping();
    void setSleeping(boolean sleeping, @Nullable BlockFace direction);

    // TODO: Shoulders data
}
