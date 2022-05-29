package ray.mintcat.rayslimefunaddon

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem
import org.bukkit.inventory.ItemStack
import taboolib.library.xseries.XMaterial
import taboolib.platform.util.ItemBuilder
import taboolib.platform.util.buildItem

object AddonAPI {

    fun register(item: SlimefunItem) {
        item.register(RaySlimefunAddon)
    }

    fun buildSkullForName(name: String, lore: MutableList<String>, skullOwner: String): ItemStack {
        return buildItem(XMaterial.PLAYER_HEAD) {
            this.name = name
            this.lore.addAll(lore)
            this.skullOwner = skullOwner
        }
    }

    fun buildSkullForTexture(name: String, lore: MutableList<String>, skullTexture: String): ItemStack {
        return buildItem(XMaterial.PLAYER_HEAD) {
            this.name = name
            this.lore.addAll(lore)
            this.skullTexture = ItemBuilder.SkullTexture(skullTexture)
        }
    }

}