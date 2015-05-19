package com.sil3nt.platformer.levels;

import com.sil3nt.platformer.entities.Player;
import com.sil3nt.platformer.physics.PhysicsHandler;
import com.sil3nt.platformer.tiles.Tiles;

public abstract class LevelBase {
    protected int[][] tileLayout;

    protected Player player;

    protected LevelRenderer renderer;
    protected PhysicsHandler physics;

    public LevelBase()
    {
        renderer = new LevelRenderer();

        player = new Player(128, 128);

        physics = new PhysicsHandler(player);
    }

    public void update(float delta)
    {
        player.update(delta);
        physics.update(delta);
    }

    public void render()
    {
        renderer.render(tileLayout, player);
    }

    public Tiles checkTile(float x, float y)
    {
        return Tiles.getByIndex(tileLayout[(int)x / 64][(int)y / 64]);
    }

    public Player getPlayer()
    {
        return player;
    }
}
