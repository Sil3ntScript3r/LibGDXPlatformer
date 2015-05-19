package com.sil3nt.platformer.levels;

import com.sil3nt.platformer.tiles.TileBackground;
import com.sil3nt.platformer.tiles.TileBase;
import com.sil3nt.platformer.tiles.TileWall;

import java.util.ArrayList;
import java.util.List;

public abstract class LevelBase {
    protected int[][] tileLayout;
    protected List<TileBase> tiles;
    protected LevelRenderer renderer;

    public LevelBase()
    {
        renderer = new LevelRenderer();
        tiles = new ArrayList<TileBase>();
    }

    public void buildLevel()
    {
        for(int y = 0; y < tileLayout.length; y++)
        {
            for(int x = 0; x < tileLayout[y].length; x++)
            {
                switch(tileLayout[y][x])
                {
                    case 0:
                        tiles.add(new TileWall(x * 64, y * 64));
                        break;
                    case 1:
                        tiles.add(new TileBackground(x * 64, y * 64));
                        break;
                }
            }
        }
    }

    public void update(float delta)
    {}

    public void render()
    {
        renderer.render(tiles);
    }
}
