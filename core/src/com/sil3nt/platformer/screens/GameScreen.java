package com.sil3nt.platformer.screens;

import com.badlogic.gdx.Screen;
import com.sil3nt.platformer.entities.Player;
import com.sil3nt.platformer.levels.LevelBase;

public class GameScreen implements Screen {
    private LevelBase level;
    private Player player;

    public GameScreen(LevelBase level)
    {
        this.level = level;
        this.level.buildLevel();

        player = new Player(64, 64);
    }

    @Override
    public void show()
    {

    }

    @Override
    public void render(float delta)
    {
        level.update(delta);
        player.update(delta);

        level.render(player);
    }

    @Override
    public void resize(int width, int height)
    {

    }

    @Override
    public void pause()
    {

    }

    @Override
    public void resume()
    {

    }

    @Override
    public void hide()
    {

    }

    @Override
    public void dispose()
    {

    }
}
