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
    Image InitBackground;
    Font font20;
    Font font50;

    // Declaramos el nombre del juego en el constructor
    public CannonGame() {
        super("Cannon Game");
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
    // Capamos los Fps a 60 para una mejor fluidez del juego.
        gameContainer.setTargetFrameRate(59);

    // Declaramos los componentes de nuestro juego.
        cannon = new Cannon();
        ball = new Ball();
        target = new Target();
        landscape = new Landscape();
        InitBackground = ResourceManager.getImage("resources/FirstLandscape.png");
        font20 = ResourceManager.getFont("resources/WHITRABT.ttf", 20);
        font50 = ResourceManager.getFont("resources/WHITRABT.ttf", 50);

        //Declaramos el número de tiros y la puntuación.
        Shorts = 5;
        Score = 0;
    }
    // Aquí debemos actualizar el juego.
    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {

        Input input = gameContainer.getInput();

        if (input.isKeyDown(Input.KEY_ENTER)) {
            InsideGame = true;
        }

        if (input.isKeyDown(Input.KEY_ESCAPE)) {
            gameContainer.exit();
        }
        if(InsideGame){
            cannon.update(gameContainer, i);
            target.update(gameContainer, i);
        }

    }
    // Cargamos las imagenes del juego.
    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

    if (InsideGame){

        landscape.render(gameContainer,graphics);
        cannon.render(gameContainer,graphics);
        target.render(gameContainer, graphics);

    }else{

        InitBackground = InitBackground.getScaledCopy(gameContainer.getWidth(), gameContainer.getHeight());
        graphics.drawImage(InitBackground, 0, 0);
        font50.drawString(gameContainer.getWidth() /2 -290,
                gameContainer.getHeight()/2,"PRESS");
        font50.drawString(gameContainer.getWidth() /2 -80,
                gameContainer.getHeight()/2,"ENTER");
        font50.drawString(gameContainer.getWidth() /2 + 120,
                gameContainer.getHeight()/2,"TO PLAY");

    }
    }
}

}
