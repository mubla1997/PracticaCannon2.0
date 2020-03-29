import org.newdawn.slick.*;
import org.newdawn.slick.Graphics;

public class Game {
    // Ventana del juego.
    public static void main(String[] args) throws SlickException {
        CannonGame cg = new CannonGame();
        AppGameContainer app = new AppGameContainer(cg,800,600,false);
        app.setShowFPS(false);
        app.start();
    }
static class CannonGame extends BasicGame {
    // Variables que contiene el juego.
    static Cannon cannon;
    static Ball ball;
    static Target target;
    static Landscape landscape;
    int Shorts;
    int Score;

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
