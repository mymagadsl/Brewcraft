package redgear.brewcraft.potions;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public abstract class PotionExtension extends Potion {

	public PotionExtension(int id, boolean isBad, int particleColor) {
		super(id, isBad, particleColor);
		
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getStatusIconIndex() {
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(
				"redgear_brewcraft:textures/potion/icons.png"));
		return super.getStatusIconIndex();
	}

	@Override
	/**
	 * Perform this potion's normal ever-tick effect. 
	 */
	public abstract void performEffect(EntityLivingBase living, int strength);

	/**
	 * Hits the provided entity with this potion's instant effect.
	 */
	@Override
	public void affectEntity(EntityLivingBase thrower, EntityLivingBase reciver, int potionStrength,
			double distanceFromSplash) {

	}
}