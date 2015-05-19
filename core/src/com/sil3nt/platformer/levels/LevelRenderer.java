package com.sil3nt.platformer.levels;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.sil3nt.platformer.entities.Player;
import com.sil3nt.platformer.tiles.Tiles;

public class LevelRenderer {
    private ShapeRenderer shapeRenderer;

    public LevelRenderer()
    {
        shapeRenderer = new ShapeRenderer();
    }

    public void render(int[][] tileLayout, Player player)
    {
        shapeRenderer.begin(ShapeType.Filled);
        {
            for(int y = 0; y < tileLayout.length; y++)
            {
                for(int x = 0; x < tileLayout[y].length; x++)
                {
                    Tiles tile = Tiles.getByIndex(tileLayout[y][x]);

                    shapeRenderer.setColor(tile.getColor());
                    shapeRenderer.rect(x * 64, y * 64, 64, 64);
                }
            }

            shapeRenderer.setColor(Color.WHITE);
            shapeRenderer.rect(player.getX(), player.getY(), 64, 128);
        }
        shapeRenderer.end();
    }
}
