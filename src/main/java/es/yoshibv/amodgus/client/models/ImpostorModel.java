package es.yoshibv.amodgus.client.models;

import es.yoshibv.amodgus.Amodgus;
import es.yoshibv.amodgus.client.renderer.AmongusRenderer;
import es.yoshibv.amodgus.entities.ImpostorEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ImpostorModel extends AnimatedGeoModel<ImpostorEntity> {

	@Override
	public ResourceLocation getModelResource(ImpostorEntity object) {
		// TODO Apéndice de método generado automáticamente
		return new ResourceLocation(Amodgus.MODID, "geo/amongus.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ImpostorEntity object) {
		// TODO Apéndice de método generado automáticamente
		return AmongusRenderer.LOCATION_BY_VARIANT.get(object.getVariant());
	}
	
	@Override
	public ResourceLocation getAnimationResource(ImpostorEntity animatable) {
		// TODO Apéndice de método generado automáticamente
		return new ResourceLocation(Amodgus.MODID, "animations/amongus.animation.json");
	}
	
}