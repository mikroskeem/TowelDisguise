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

package eu.mikroskeem.toweldisguise

import eu.mikroskeem.toweldisguise.api.TowelDisguiseAPI
import eu.mikroskeem.toweldisguise.configuration.HEADER
import eu.mikroskeem.toweldisguise.configuration.TowelDisguiseConfiguration
import ninja.leaping.configurate.ConfigurationOptions
import ninja.leaping.configurate.commented.CommentedConfigurationNode
import ninja.leaping.configurate.hocon.HoconConfigurationLoader
import ninja.leaping.configurate.loader.ConfigurationLoader
import ninja.leaping.configurate.loader.HeaderMode
import ninja.leaping.configurate.objectmapping.ObjectMapper
import org.bukkit.plugin.java.JavaPlugin
import java.nio.file.Paths

/**
 * TowelDisguise plugin class
 *
 * @author Mark Vainomaa
 */
class TowelDisguise: JavaPlugin() {
    internal lateinit var api: TowelDisguiseAPI
    internal lateinit var config: TowelDisguiseConfiguration

    // Configuration loading related
    private lateinit var baseNode: CommentedConfigurationNode
    private lateinit var loader: ConfigurationLoader<CommentedConfigurationNode>
    private lateinit var objectMapper: ObjectMapper<TowelDisguiseConfiguration>.BoundInstance

    override fun onEnable() {
        // Load configuration
        initLoader()
        reloadConfig()
    }

    override fun onDisable() {

    }

    fun loadConfig() {
        baseNode = loader.load()
        config = objectMapper.populate(baseNode.getNode("toweldisguise"))
    }

    override fun saveConfig() {
        objectMapper.serialize(baseNode.getNode("toweldisguise"))
        loader.save(baseNode)
    }

    override fun reloadConfig() {
        loadConfig()
        saveConfig()
    }

    private fun initLoader() {
        val path = Paths.get(dataFolder.toString(), "config.cfg")
        loader = HoconConfigurationLoader.builder()
                .setHeaderMode(HeaderMode.PRESET)
                .setDefaultOptions(ConfigurationOptions.defaults().setHeader(HEADER).setShouldCopyDefaults(true))
                .setPath(path)
                .build()
        objectMapper = ObjectMapper.forClass(TowelDisguiseConfiguration::class.java).bindToNew()
        config = objectMapper.instance
    }
}