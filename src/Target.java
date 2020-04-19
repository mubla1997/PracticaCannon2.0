import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import java.awt.*;
import java.util.Random;


public class Target extends Game.CannonGame {
    Image target;
    static Random r = new Random();
    static int RandomPosition = r.nextInt(500) + 200;


    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        target = ResourceManager.getImage("resources/target.png");
        graphics.drawImage(target,RandomPosition,gameContainer.getHeight()-100);
    }

    static boolean hit(){
        return false;
    }

    static void reset(){
        RandomPosition = r.nextInt(450) + 250;
    }

    }
