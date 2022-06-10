package net.phoenicis.phalc.registery;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.phoenicis.phalc.PhalchemyForMinecraft;
import net.phoenicis.phalc.item.PhalcemyStaff;


public class PhalcItems {

    public static final Item PHALCHEMY_STAFF = new PhalcemyStaff(new Item.Settings()
            .fireproof()
            .maxCount(1)
            .maxDamage(512)
            .group(PhalchemyForMinecraft.PHALC_STAFFS)
    );

    public static void registerStaffs(){
        Registry.register(Registry.ITEM, new Identifier(PhalchemyForMinecraft.MOD_ID, "phalchemy_staff"), PHALCHEMY_STAFF);
    }
}
