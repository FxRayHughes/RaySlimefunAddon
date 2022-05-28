package ray.mintcat.rayslimefunaddon.addon

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack
import org.bukkit.inventory.ItemStack

interface SlimeItemCreate {

    val name: String

    fun build(): SlimefunItem

    fun create(): SlimefunItemStack

    fun reprice(): Array<ItemStack?>

}