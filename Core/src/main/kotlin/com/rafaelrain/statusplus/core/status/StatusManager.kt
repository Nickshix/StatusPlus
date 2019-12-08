package com.rafaelrain.statusplus.core.status

import me.dpohvar.powernbt.PowerNBT
import me.dpohvar.powernbt.api.NBTCompound
import me.dpohvar.powernbt.api.NBTManager
import org.bukkit.entity.Player

class StatusManager(private val player: Player) {

    //

    private val nbtManager: NBTManager = PowerNBT.getApi()
    private val data: NBTCompound = nbtManager.read(player)
    private val persisted: NBTCompound = data.getCompound("ForgeData")
            .getCompound("PlayerPersisted")

    fun get(tag: String) = persisted.getInt(tag)

    fun put(tag: String, status: Int) = persisted.put(tag, status)

    fun write() = nbtManager.write(player, data)
}