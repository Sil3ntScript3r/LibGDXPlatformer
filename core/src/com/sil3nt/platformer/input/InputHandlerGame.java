package com.sil3nt.platformer.input;

import com.badlogic.gdx.InputProcessor;
import com.sil3nt.platformer.entities.Player;

public class InputHandlerGame implements InputProcessor {
    private Player player;

    public InputHandlerGame(Player player)
    {
        this.player = player;
    }

    @Override
    public boolean keyDown(int keycode)
    {
        if(player.keyDown(keycode))
            return true;

        return false;
    }

    @Override
    public boolean keyUp(int keycode)
    {
        return false;
    }

    @Override
    public boolean keyTyped(char character)
    {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button)
    {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button)
    {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer)
    {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY)
    {
        return false;
    }

    @Override
    public boolean scrolled(int amount)
    {
        return false;
    }
}
