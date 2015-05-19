package com.sil3nt.platformer.tiles;

import com.badlogic.gdx.graphics.Color;

public abstract class TileBase {
    protected int x;
    protected int y;
    protected Color color;

    public TileBase(int x, int y, Color color)
    {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public Color getColor()
    {
        return color;
    }
}
