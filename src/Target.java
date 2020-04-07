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
    Shape shape;

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {

    }

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
    Shape getShape() {
        this.shape = new Rectangle(target.getWidth(), target.getHeight());

        return shape;
    }
}