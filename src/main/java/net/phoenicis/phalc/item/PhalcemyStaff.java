package net.phoenicis.phalc.item;

import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.phoenicis.phalc.registery.PhalcItems;

public class PhalcemyStaff extends Item {
    public PhalcemyStaff(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(context.getWorld().isClient()){
            BlockPos positionClicked = context.getBlockPos();
            Block targetBlock = context.getWorld().getBlockState(positionClicked).getBlock();
            PlayerEntity player = context.getPlayer();
            // Get block position

            // Do change
            player.sendMessage(new TranslatableText("item.test.message"), true);



        }
        // Damage Staff
        context.getStack().damage(1, context.getPlayer(),
                (player) -> player.sendToolBreakStatus(player.getActiveHand()));
        // Return Statement
        return super.useOnBlock(context);

    }
}
