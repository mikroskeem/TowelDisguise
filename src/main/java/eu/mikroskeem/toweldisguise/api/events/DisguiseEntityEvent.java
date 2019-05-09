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

package eu.mikroskeem.toweldisguise.api.events;

import eu.mikroskeem.toweldisguise.api.disguise.Disguise;
import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityEvent;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;


/**
 * Event which will be fired when entity gets disguised
 *
 * @author Mark Vainomaa
 */
public final class DisguiseEntityEvent extends EntityEvent implements Cancellable {
    /** Global event handler list */
    private static final HandlerList handlers = new HandlerList();

    /** Disguise which will be applied to an {@link Entity} */
    private final Disguise disguise;

    /** Cancelled status */
    private boolean cancelled;

    /**
     * Constructor for {@link DisguiseEntityEvent}
     *
     * @param who Entity who will be disguised
     * @param disguise Disguise which will be applied to an {@link Entity}
     */
    public DisguiseEntityEvent(Entity who, Disguise disguise) {
        super(who);
        this.disguise = disguise;
    }

    /**
     * Gets disguise which will be applied to an {@link Entity}
     *
     * @return Disguise
     */
    @NotNull
    @Contract(pure = true)
    public Disguise getDisguise() {
        return disguise;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * Gets list of handlers for given Event
     *
     * @return Handlers list
     */
    public HandlerList getHandlers() {
        return handlers;
    }

    /**
     * Gets list of handlers for given Event
     *
     * @return Handlers list
     */
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
