import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;


public class Target extends Game.CannonGame {
    Image target;

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        target = ResourceManager.getImage("resources/target.png");


    }
}