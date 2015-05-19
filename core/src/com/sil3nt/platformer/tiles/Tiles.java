package com.sil3nt.platformer.tiles;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;

public enum Tiles {
    WALL(0, true, Color.OLIVE), BACKGROUND(1, false, Color.DARK_GRAY);

    private static final Tiles[] TILE_LOOKUP = new Tiles[values().length];
    private final int INDEX;
    private final boolean COLLIDABLE;
    private final Color COLOR;

    Tiles(int index, boolean collidable, Color color)
    {
        Gdx.app.log("Tile Enum", index + "");
        INDEX = index;
        COLLIDABLE = collidable;
        COLOR = color;
    }

    public int getIndex()
    {
        return INDEX;
    }

    public boolean isCollidable()
    {
        return COLLIDABLE;
    }

    public Color getColor()
    {
        return COLOR;
    }

    public static Tiles getByIndex(int index)
    {
        if(TILE_LOOKUP[index] != null)
            return TILE_LOOKUP[index];

        return null;
    }

    static
    {
        Tiles[] tileList = values();

        for(int i = 0; i < tileList.length; i++)
        {
            TILE_LOOKUP[i] = tileList[i];
        }
    }
}
