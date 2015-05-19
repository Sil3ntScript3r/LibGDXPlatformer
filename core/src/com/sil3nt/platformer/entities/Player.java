package com.sil3nt.platformer.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;

public class Player extends EntityBase {
    public Player(float x, float y)
    {
        super(x, y);
    }

    public void update(float delta)
    {
        if(Gdx.input.isKeyPressed(Keys.A))
            moveX(-256, delta);
        else if(Gdx.input.isKeyPressed(Keys.D))
            moveX(256, delta);
    }

    public void render()
    {

    }

    public void moveX(float amount, float delta)
    {
        x += amount * delta;
    }
}
