package de.teamlapen.vampirism.entity.player.vampire;

/**
 * Stores special attributes that can be activated by skills or actions.
 * One attribute should only be modified by ONE skill/action.
 */
public class VampirePlayerSpecialAttributes {
    public boolean poisonous_bite = false;
    public boolean disguised = false;
    public boolean avoided_by_creepers = false;
    private int jump_boost = 0;

    public int getJumpBoost() {
        return jump_boost;
    }

    public void setJumpBoost(int jump_boost) {
        this.jump_boost = (jump_boost >= 0 && jump_boost < 10) ? jump_boost : 0;
    }
}
