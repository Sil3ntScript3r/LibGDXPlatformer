package com.sil3nt.platformer.entities;

public abstract class EntityBase {
    protected float x;
    protected float y;

    public EntityBase(float x, float y)
    {
        this.x = x;
        this.y = y;
    }

    public void update(float delta) {}
}
