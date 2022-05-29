package ray.mintcat.rayslimefunaddon

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon
import org.bukkit.plugin.java.JavaPlugin
import taboolib.common.platform.Plugin
import taboolib.module.configuration.Config
import taboolib.module.configuration.Configuration
import taboolib.platform.BukkitPlugin

object RaySlimefunAddon : Plugin(), SlimefunAddon {

    @Config(migrate = true, value = "items.yml", autoReload = true)
    lateinit var config: Configuration
        private set

    val plugin by lazy {
        BukkitPlugin.getInstance()
    }

    override fun getJavaPlugin(): JavaPlugin {
        return plugin
    }

    override fun getBugTrackerURL(): String {
        return "此物品由 RaySlimefunAddon 添加"
    }
}