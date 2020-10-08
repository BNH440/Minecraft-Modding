package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class CustomSword extends ItemSword {
    public CustomSword() {
        super(ExampleMod.swordMaterial);
        this.setRegistryName("my_sword");
        this.setUnlocalizedName("my_sword");
        this.setCreativeTab(CreativeTabs.COMBAT);
    }
}
