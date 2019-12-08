package com.rafaelrain.statusplus.core.api

import com.rafaelrain.statusplus.core.status.StatusManager
import com.rafaelrain.statusplus.core.status.StatusType
import org.bukkit.entity.Player

object StatusAPI {

    // TODO test TP

    @JvmStatic
    fun getStatus(player: Player, type: StatusType): Int {
        return StatusManager(player).get(type.tag)
    }

    @JvmStatic
    fun setStatus(player: Player, type: StatusType, status: Int) {
        val statusManager = StatusManager(player)
        statusManager.put(type.tag, status)
        statusManager.write()
    }

    @JvmStatic
    fun addStatus(player: Player, type: StatusType, status: Int) {
        val statusManager = StatusManager(player)
        val actual = statusManager.get(type.tag)
        statusManager.put(type.tag, actual + status)
    }

    @JvmStatic
    fun removeStatus(player: Player, type: StatusType, status: Int) {
        val statusManager = StatusManager(player)
        val actual = statusManager.get(type.tag)
        statusManager.put(type.tag, actual - status)
    }

}