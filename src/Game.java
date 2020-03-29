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
    boolean InsideGame = false;

    // Declaramos el nombre del juego en el constructor
    public CannonGame() {
        super("Cannon Game");
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
    // Capamos los Fps a 60 para una mejor fluidez del juego.
        gameContainer.setTargetFrameRate(60);

    // Declaramos los componentes de nuestro juego.
        cannon = new Cannon();
        ball = new Ball();
        target = new Target();
        landscape = new Landscape();

        //Declaramos el número de tiros y la puntuación.
        Shorts = 5;
        Score = 0;
    }
    // Aquí debemos actualizar el juego.
    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {

    }
    // Cargamos las imagenes del juego.
    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
    if(InsideGame){
    }else{

    }
    }
}

}
