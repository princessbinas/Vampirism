package de.teamlapen.vampirism.client.render.tiles;

import de.teamlapen.vampirism.client.model.ModelCoffin;
import de.teamlapen.vampirism.tileentity.TileCoffin;
import de.teamlapen.vampirism.util.REFERENCE;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Max on 12.03.2016.
 */
public class CoffinTESR extends VampirismTESR<TileCoffin> {

    public static final String[] colors = new String[]{"black", "red", "green", "brown", "blue", "purple", "cyan", "silver", "gray", "pink", "lime", "yellow", "lightBlue", "magenta", "orange",
            "white"};
    private final int maxLidPos = 61;
    private ModelCoffin model;
    private ResourceLocation[] textures = new ResourceLocation[16];

    public CoffinTESR() {
        this.model = new ModelCoffin();
        for (int i = 0; i < colors.length; i++) {
            textures[i] = new ResourceLocation(REFERENCE.MODID, "textures/blocks/coffin/coffin_" + colors[i] + ".png");
        }
    }

    @Override
    public void renderTileEntityAt(TileCoffin te, double x, double y, double z, float partialTicks, int destroyStage) {
        TileCoffin tile = te;
        if ((te.getBlockMetadata() & (-8)) == 0)
            return;
        // Calculate lid position
        boolean occupied = (te.getBlockMetadata() & 4) != 0;
        // Logger.i("test", "%s", tile.getPrimaryTileEntity()==tile);
        if (!occupied && tile.lidPos > 0)
            tile.lidPos--;
        else if (occupied && tile.lidPos < maxLidPos)
            tile.lidPos++;
        // Logger.i("RendererCoffin", String.format("Rendering at x=%s, y=%s, z=%s, occupied=%s, lidpos=%s", te.xCoord, te.yCoord, te.zCoord, occupied, tile.lidPos));
        GlStateManager.pushMatrix();
        GlStateManager.translate((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
        int color = Math.min(tile.color, 15);
        bindTexture(textures[color]);
        GlStateManager.pushMatrix();
        adjustRotatePivotViaState(te);
        GlStateManager.rotate(180F, 0.0F, 0.0F, 1.0F);
        model.rotateLid(calcLidAngle(tile.lidPos));
        model.render(null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        GlStateManager.popMatrix();
        GlStateManager.popMatrix();
    }

    private float calcLidAngle(int pos) {
        if (pos == maxLidPos)
            return 0.0F;
        else if (pos == 0)
            return (float) (0.75F * Math.PI);
        return (float) (-Math.pow(1.02, pos) + 1 + 0.75 * Math.PI);
    }
}