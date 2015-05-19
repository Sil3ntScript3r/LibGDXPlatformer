package com.sil3nt.platformer.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;

public class Player extends EntityBase {
    protected int maxJumps;
    protected int numJumps;

    public Player(float x, float y)
    {
        super(x, y, 4);
        maxJumps = 2;
        numJumps = maxJumps;
    }

    public void update(float delta)
    {
        super.update(delta);

        if(Gdx.input.isKeyPressed(Keys.A))
            moveX(true, delta);
        else if(Gdx.input.isKeyPressed(Keys.D))
            moveX(false, delta);
    }

    public boolean keyDown(int keycode)
    {
        if(keycode == Keys.SPACE || keycode == Keys.W)
        {
            jump();
            return true;
        }

        return false;
    }

    private void jump()
    {
        if(numJumps != 0)
        {
            velocityY = (speed * 64);
        }
    }
}
