// Date: 20.08.2014 19:13:24
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package de.teamlapen.vampirism.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBloodAltar extends ModelBase {
	// fields
	ModelRenderer base;
	ModelRenderer level1;
	ModelRenderer level2;
	ModelRenderer level3;
	ModelRenderer level4;
	ModelRenderer level_5;
	ModelRenderer tableTop;
	ModelRenderer cube1;
	ModelRenderer cube2;
	ModelRenderer cube3;
	ModelRenderer cube4;
	ModelRenderer swordBayFront;
	ModelRenderer swordBayBack;
	ModelRenderer swordBayTop;
	ModelRenderer swordBayRight;
	ModelRenderer swordBayLeft;

	public ModelBloodAltar() {
		textureWidth = 128;
		textureHeight = 64;

		base = new ModelRenderer(this, 0, 0);
		base.addBox(0F, 0F, 0F, 16, 2, 16);
		base.setRotationPoint(-8F, 22F, -8F);
		base.setTextureSize(128, 64);
		base.mirror = true;
		setRotation(base, 0F, 0F, 0F);
		level1 = new ModelRenderer(this, 0, 35);
		level1.addBox(0F, 0F, 0F, 12, 1, 12);
		level1.setRotationPoint(-6F, 21F, -6F);
		level1.setTextureSize(128, 64);
		level1.mirror = true;
		setRotation(level1, 0F, 0F, 0F);
		level2 = new ModelRenderer(this, 0, 8);
		level2.addBox(0F, 0F, 0F, 4, 2, 4);
		level2.setRotationPoint(-2F, 19F, -2F);
		level2.setTextureSize(128, 64);
		level2.mirror = true;
		setRotation(level2, 0F, 0F, 0F);
		level3 = new ModelRenderer(this, 48, 48);
		level3.addBox(0F, 0F, 0F, 6, 1, 6);
		level3.setRotationPoint(-3F, 18F, -3F);
		level3.setTextureSize(128, 64);
		level3.mirror = true;
		setRotation(level3, 0F, 0F, 0F);
		level4 = new ModelRenderer(this, 48, 35);
		level4.addBox(0F, 0F, 0F, 8, 1, 8);
		level4.setRotationPoint(-4F, 17F, -4F);
		level4.setTextureSize(128, 64);
		level4.mirror = true;
		setRotation(level4, 0F, 0F, 0F);
		level_5 = new ModelRenderer(this, 0, 48);
		level_5.addBox(0F, 0F, 0F, 12, 1, 12);
		level_5.setRotationPoint(-6F, 16F, -6F);
		level_5.setTextureSize(128, 64);
		level_5.mirror = true;
		setRotation(level_5, 0F, 0F, 0F);
		tableTop = new ModelRenderer(this, 0, 18);
		tableTop.addBox(0F, 0F, 0F, 16, 1, 16);
		tableTop.setRotationPoint(-8F, 15F, -8F);
		tableTop.setTextureSize(128, 64);
		tableTop.mirror = true;
		setRotation(tableTop, 0F, 0F, 0F);
		cube1 = new ModelRenderer(this, 0, 4);
		cube1.addBox(0F, 0F, 0F, 2, 2, 2);
		cube1.setRotationPoint(-8F, 13F, -8F);
		cube1.setTextureSize(128, 64);
		cube1.mirror = true;
		setRotation(cube1, 0F, 0F, 0F);
		cube2 = new ModelRenderer(this, 8, 4);
		cube2.addBox(0F, 0F, 0F, 2, 2, 2);
		cube2.setRotationPoint(6F, 13F, -8F);
		cube2.setTextureSize(128, 64);
		cube2.mirror = true;
		setRotation(cube2, 0F, 0F, 0F);
		cube3 = new ModelRenderer(this, 8, 0);
		cube3.addBox(0F, 0F, 0F, 2, 2, 2);
		cube3.setRotationPoint(6F, 13F, 6F);
		cube3.setTextureSize(128, 64);
		cube3.mirror = true;
		setRotation(cube3, 0F, 0F, 0F);
		cube4 = new ModelRenderer(this, 0, 0);
		cube4.addBox(0F, 0F, 0F, 2, 2, 2);
		cube4.setRotationPoint(-8F, 13F, 6F);
		cube4.setTextureSize(128, 64);
		cube4.mirror = true;
		setRotation(cube4, 0F, 0F, 0F);
		swordBayFront = new ModelRenderer(this, 0, 18);
		swordBayFront.addBox(0F, 0F, 0F, 6, 1, 1);
		swordBayFront.setRotationPoint(-3F, 14F, -1F);
		swordBayFront.setTextureSize(128, 64);
		swordBayFront.mirror = true;
		setRotation(swordBayFront, 0F, 0F, 0F);
		swordBayBack = new ModelRenderer(this, 0, 20);
		swordBayBack.addBox(0F, 0F, 0F, 6, 1, 1);
		swordBayBack.setRotationPoint(-3F, 14F, 1F);
		swordBayBack.setTextureSize(128, 64);
		swordBayBack.mirror = true;
		setRotation(swordBayBack, 0F, 0F, 0F);
		swordBayTop = new ModelRenderer(this, 0, 22);
		swordBayTop.addBox(0F, 0F, 0F, 4, 1, 1);
		swordBayTop.setRotationPoint(-2F, 13F, 1F);
		swordBayTop.setTextureSize(128, 64);
		swordBayTop.mirror = true;
		setRotation(swordBayTop, 0F, 0F, 0F);
		swordBayRight = new ModelRenderer(this, 4, 24);
		swordBayRight.addBox(0F, 0F, 0F, 1, 1, 1);
		swordBayRight.setRotationPoint(3F, 14F, 0F);
		swordBayRight.setTextureSize(128, 64);
		swordBayRight.mirror = true;
		setRotation(swordBayRight, 0F, 0F, 0F);
		swordBayLeft = new ModelRenderer(this, 0, 24);
		swordBayLeft.addBox(0F, 0F, 0F, 1, 1, 1);
		swordBayLeft.setRotationPoint(-4F, 14F, 0F);
		swordBayLeft.setTextureSize(128, 64);
		swordBayLeft.mirror = true;
		setRotation(swordBayLeft, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		base.render(f5);
		level1.render(f5);
		level2.render(f5);
		level3.render(f5);
		level4.render(f5);
		level_5.render(f5);
		tableTop.render(f5);
		cube1.render(f5);
		cube2.render(f5);
		cube3.render(f5);
		cube4.render(f5);
		swordBayFront.render(f5);
		swordBayBack.render(f5);
		swordBayTop.render(f5);
		swordBayRight.render(f5);
		swordBayLeft.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}
