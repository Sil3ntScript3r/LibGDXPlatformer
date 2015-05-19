package com.sil3nt.platformer.entities;

public abstract class EntityBase {
    protected float x;
    protected float y;
    protected float velocityY;

    protected float speed;

    public EntityBase(float x, float y, float speed)
    {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void update(float delta)
    {
        y += velocityY * delta;
    }

    protected void moveX(boolean left, float delta)
    {
        x = left ? x - ((speed * 64) * delta) : x + ((speed * 64) * delta);
    }

    public float getX()
    {
        return x;
    }

    public float getY()
    {
        return y;
    }
}
