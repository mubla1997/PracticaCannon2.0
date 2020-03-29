import org.newdawn.slick.*;
import org.newdawn.slick.Graphics;

public class Game {
    public static void main(String[] args) throws SlickException {
        CannonGame cg = new CannonGame();
        AppGameContainer app = new AppGameContainer(cg,800,600,false);
        app.setShowFPS(false);
        app.start();
    }
static class CannonGame extends BasicGame {
    public CannonGame() {
        super("Cannon Game");
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

    }
}{
    }
}
