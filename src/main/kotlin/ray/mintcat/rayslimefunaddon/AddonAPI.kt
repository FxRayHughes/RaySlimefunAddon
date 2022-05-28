package ray.mintcat.rayslimefunaddon

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem
import org.bukkit.inventory.ItemStack

object AddonAPI {

    fun register(item: SlimefunItem) {
        item.register(RaySlimefunAddon)
    }


}