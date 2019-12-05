package com.rafaelrain.statusplus.core

import org.bukkit.plugin.java.JavaPlugin

class StatusPlus : JavaPlugin() {

    override fun onLoad() {
        logger.info("Carregando plugin...")
        INSTANCE = this
    }

    override fun onEnable() {
        logger.info("Plugin iniciado com sucesso!")
    }

    companion object {
        lateinit var INSTANCE: StatusPlus
            private set
    }
}