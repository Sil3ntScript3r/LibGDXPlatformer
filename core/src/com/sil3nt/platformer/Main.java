package com.sil3nt.platformer;

import com.badlogic.gdx.Game;
import com.sil3nt.platformer.levels.LevelTest;
import com.sil3nt.platformer.screens.GameScreen;

public class Main extends Game {
	@Override
	public void create()
    {
        setScreen(new GameScreen(new LevelTest()));
	}

	@Override
	public void dispose()
    {
        super.dispose();
	}
}
