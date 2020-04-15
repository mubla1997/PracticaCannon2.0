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
    int Shots;
    int Score;
    boolean InsideGame = false;
    Image InitBackground;
    Font font20;
    Font font50;
    int contador = 0;

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
        Shots = 5;
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

        if (input.isKeyDown(Input.KEY_R)) {
            gameContainer.reinit();
            Target.reset();
            InsideGame = false;
            Shots = 5;
            Score = 0;
        }
        if(InsideGame){
            cannon.update(gameContainer, i);
            target.update(gameContainer, i);
            ball.update(gameContainer,i);
        }
        contador ++;
    }
    // Cargamos las imagenes del juego.
    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

    if (InsideGame){

        landscape.render(gameContainer,graphics);
        cannon.render(gameContainer,graphics);

        target.render(gameContainer, graphics);
        ball.render(gameContainer, graphics);
        font20.drawString(10,20,"SHOTS: " + Shots);
        font20.drawString(10,40,"SCORE: " + Score);
        font20.drawString(10,60,"Strength: ");
        graphics.drawRect(130,50, (float) (5 + cannon.Strength),10);
        graphics.setColor(Color.red);
        font20.drawString(240,60, String.valueOf(cannon.Strength),Color.red);
        font20.drawString(gameContainer.getWidth()/2 - 390,80, "Angle: " + cannon.rotation,Color.green);

    }else{

        InitBackground = InitBackground.getScaledCopy(gameContainer.getWidth(), gameContainer.getHeight());
        graphics.drawImage(InitBackground, 0, 0);

        font50.drawString(gameContainer.getWidth() /2 -290,
                gameContainer.getHeight()/2,"PRESS");
        if(contador < 60) {
            font50.drawString(gameContainer.getWidth() / 2 - 80,
                    gameContainer.getHeight() / 2 , "ENTER",Color.cyan);
        }
        if(contador > 60){
            font50.drawString(gameContainer.getWidth() / 2 - 80,
                    gameContainer.getHeight() / 2 , "ENTER",Color.green);
        }
        if(contador > 120){
            contador = 0;
        }
        font50.drawString(gameContainer.getWidth() /2 + 120,
                gameContainer.getHeight()/2,"TO START");

        font50.drawString(gameContainer.getWidth()/2 -100,
                gameContainer.getHeight() + - 10,"Created by Pablo",Color.black);
    }
    }
}

}
