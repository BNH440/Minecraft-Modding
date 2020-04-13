package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "flex";
    public static final String NAME = "Flex Paste Sword";
    public static final String VERSION = "1.0";

    public static Item.ToolMaterial swordMaterial;
    public static Item mySword;
    public static Item flexPaste;
    public static Block flexBlock;
    public static Item slimeStick;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        swordMaterial = EnumHelper.addToolMaterial("my_sword", 4, 100000, 20.0F, 100.0F, 30);
        mySword = new CustomSword();
        flexPaste = new FlexPaste();
        flexBlock = new FlexBlock();
        slimeStick = new SlimeStick();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("DIRT BLOCK >> " + Blocks.DIRT.getUnlocalizedName());
    }
    
    @EventHandler
    public void whenHurt(LivingHurtEvent event) {
    	if(event.getEntity() instanceof EntityPlayer) {
    		System.out.println("Entity is Living: " + event.getEntity().getName());
    	}
    	else {
    		System.out.println("Entity is not Living");
    	}
    }
}
