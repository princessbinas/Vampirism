package de.teamlapen.vampirism.api.entity.convertible;

import net.minecraft.entity.EntityCreature;
import net.minecraft.util.DamageSource;

/**
 * Handles conversion of entities
 */
public interface IConvertingHandler<T extends EntityCreature> {

    /**
     * @param entity Creature to be converted
     * @return A converted creature that will replace the old entity
     */
    IConvertedCreature<T> createFrom(T entity);

    /**
     * If Vampirism's default converted creature is used, this can be used to specify some properties of the converted creature
     *
     * @param <Q>
     */
    interface IDefaultHelper<Q extends EntityCreature> {
        /**
         * Drop items on entity's death.
         * Is called in {@link EntityCreature#onDeath(DamageSource)}
         */
        void dropConvertedItems(Q entity, boolean recentlyHit, int looting);

        double getConvertedDMG(Q entity);

        double getConvertedKnockbackResistance(Q entity);

        double getConvertedMaxHealth(Q entity);

        double getConvertedSpeed(Q entity);

    }
}
