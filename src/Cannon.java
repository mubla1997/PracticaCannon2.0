import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Cannon extends Game.CannonGame {
    Image cannon;
    Image cannon_base;


    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {

    }
    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        int x = 25;
        int y = gameContainer.getHeight() - 150;

        cannon = ResourceManager.getImage("resources/cannon.png");
        cannon_base = ResourceManager.getImage("resources/cannon_base.png");
        graphics.drawImage(cannon,x,y);
        graphics.drawImage(cannon_base,x,y + 30);
    }
}
