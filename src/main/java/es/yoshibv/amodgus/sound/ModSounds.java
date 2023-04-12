package es.yoshibv.amodgus.sound;

import es.yoshibv.amodgus.Amodgus;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
	public static final DeferredRegister<SoundEvent> SOUND_EVENTS = 
			DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Amodgus.MODID);
	
	public static final RegistryObject<SoundEvent> AMONGUS_DRIP = 
			registerSoundEvent("amongus_drip");
	
	private static RegistryObject<SoundEvent> registerSoundEvent(String name){
		return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(Amodgus.MODID, name)));
	}
	
	public static void register(IEventBus eventBus) {
		SOUND_EVENTS.register(eventBus);
	}
}
