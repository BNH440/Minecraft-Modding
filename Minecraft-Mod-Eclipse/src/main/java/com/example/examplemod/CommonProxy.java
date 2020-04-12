package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.rmi.registry.Registry;

@EventBusSubscriber
public class CommonProxy {
	
    public static void registerRenderItem(Item item){
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
    

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(ExampleMod.mySword);
        event.getRegistry().registerAll(ExampleMod.flexPaste);
        event.getRegistry().registerAll(ExampleMod.slimeStick);
    }
    
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
    	  event.getRegistry().registerAll(ExampleMod.flexBlock);
	}
    
    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
      event.getRegistry().registerAll(new ItemBlock(ExampleMod.flexBlock).setRegistryName(ExampleMod.flexBlock.getRegistryName()));
    }
    
    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
    	registerRenderItem(ExampleMod.mySword);
    	registerRenderItem(ExampleMod.flexPaste);
    	registerRenderItem(Item.getItemFromBlock(ExampleMod.flexBlock));
    	registerRenderItem(ExampleMod.slimeStick);
    }
}
