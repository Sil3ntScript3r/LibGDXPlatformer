package com.sil3nt.platformer.levels;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.sil3nt.platformer.entities.Player;
import com.sil3nt.platformer.tiles.TileBase;

import java.util.List;

public class LevelRenderer {
    private ShapeRenderer shapeRenderer;

    public LevelRenderer()
    {
        shapeRenderer = new ShapeRenderer();
    }

    public void render(List<TileBase> tiles, Player player)
    {
        shapeRenderer.begin(ShapeType.Filled);
        {
            for (TileBase tile : tiles)
            {
                shapeRenderer.setColor(tile.getColor());
                shapeRenderer.rect(tile.getX(), tile.getY(), 64, 64);
            }

            shapeRenderer.setColor(Color.WHITE);
            shapeRenderer.rect(player.getX(), player.getY(), 64, 128);
        }
        shapeRenderer.end();
    }
}
