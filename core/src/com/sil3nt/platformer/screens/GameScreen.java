package com.sil3nt.platformer.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.sil3nt.platformer.input.InputHandlerGame;
import com.sil3nt.platformer.levels.LevelBase;
import com.sil3nt.platformer.tiles.Tiles;

public class GameScreen implements Screen {
    private LevelBase level;

    public GameScreen(LevelBase level)
    {
        this.level = level;

        Gdx.input.setInputProcessor(new InputHandlerGame(level.getPlayer()));
    }

    @Override
    public void show()
    {

    }

    @Override
    public void render(float delta)
    {
        level.update(delta);

        level.render();
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
