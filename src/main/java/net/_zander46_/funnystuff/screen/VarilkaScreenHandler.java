package net._zander46_.funnystuff.screen;

import net._zander46_.funnystuff.FunnyStuff;
import net._zander46_.funnystuff.block.entity.VarilkaBlockEntity;
import net._zander46_.funnystuff.network.BlockPosPayload;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.ArrayPropertyDelegate;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.screen.slot.Slot;
import net.minecraft.text.Text;

public class VarilkaScreenHandler extends ScreenHandler {
    private final Inventory inventory;
    private final PropertyDelegate propertyDelegate;
    public final VarilkaBlockEntity blockEntity;

    public VarilkaScreenHandler(int syncId, PlayerInventory inventory, BlockPosPayload payload) {
        this(syncId, inventory, inventory.player.getWorld().getBlockEntity(payload.pos()),
                new ArrayPropertyDelegate(2));
    }



    public VarilkaScreenHandler(int syncId, PlayerInventory playerInventory, BlockEntity blockEntity, PropertyDelegate arrayPropertyDelegate) {
        super(ModScreenHandlers.VARILKA_SCREEN_HANDLER, syncId);
        checkSize((Inventory) blockEntity, 2);
        this.inventory = ((Inventory) blockEntity);
        inventory.onOpen(playerInventory.player);
        this.propertyDelegate = arrayPropertyDelegate;
        this.blockEntity = ((VarilkaBlockEntity) blockEntity);

        this.addSlot(new Slot(inventory, 0, 39, 17));
        this.addSlot(new Slot(inventory, 1, 79, 17));
        this.addSlot(new Slot(inventory, 2, 119, 17));
        this.addSlot(new Slot(inventory, 3, 78, 69));

        addPlayerInventory(playerInventory);
        addPlayerHotbar(playerInventory);

        addProperties(arrayPropertyDelegate);
    }



    public boolean isCrafting() {
        return propertyDelegate.get(0) > 0;
    }

    public int getScaledProgress() {
        int progress = this.propertyDelegate.get(0);
        int maxProgress = this.propertyDelegate.get(1);  // Max Progress
        int progressArrowSize = 29; // This is the width in pixels of your arrow
        if (maxProgress != 0 && progress != 0) {
            return  progress / (maxProgress / progressArrowSize);
        }
        return 0;
    }


    @Override
    public ItemStack quickMove(PlayerEntity player, int slotIndex) {
        ItemStack newStack = ItemStack.EMPTY;
        Slot slot = getSlot(slotIndex);
        if(slot != null && slot.hasStack()) {
            ItemStack inSlot = slot.getStack();
            newStack = inSlot.copy();

            if(slotIndex < 36) {
                if(!insertItem(inSlot, 36, this.slots.size(), true))
                    return ItemStack.EMPTY;
            } else if (!insertItem(inSlot, 0, 36, false))
                return ItemStack.EMPTY;

            if(inSlot.isEmpty())
                slot.setStack(ItemStack.EMPTY);
            else slot.markDirty();
        }

        return newStack;
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return this.inventory.canPlayerUse(player);
    }

    private void addPlayerInventory(Inventory playerInventory) {
        for (int i = 0; i < 3; ++i) {
            for (int l = 0; l < 9; ++l) {
                this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 7 + l * 18, 102 + i * 18));
            }
        }
    }

    private void addPlayerHotbar(Inventory playerInventory) {
        for (int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 7 + i * 18, 160));
        }
    }
}
