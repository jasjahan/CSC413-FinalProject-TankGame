package edu.csc413.tankgame;

import edu.csc413.tankgame.model.Entity;
import edu.csc413.tankgame.model.GameState;
import edu.csc413.tankgame.view.RunGameView;

public class ShellShellCollisionHandler extends EntityCollisionHandler {

    @Override
    public void handleCollision(Entity shell1, Entity shell2, GameState gameState, RunGameView runGameView) {
        if (entitiesOverlap(shell1, shell2)) {
            shell1.reduceHealth(gameState);
            shell2.reduceHealth(gameState);
            runGameView.addAnimation(RunGameView.SHELL_EXPLOSION_ANIMATION,RunGameView.SHELL_EXPLOSION_FRAME_DELAY,
                    shell1.getX(), shell2.getY());
        }
    }
}
