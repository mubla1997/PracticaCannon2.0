import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Landscape extends Game.CannonGame {
    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

        Image background = ResourceManager.getImage("resources/landscape.jpg");

        background = background.getScaledCopy(gameContainer.getWidth(),gameContainer.getHeight());

        graphics.drawImage(background,0,0);
    }
}


