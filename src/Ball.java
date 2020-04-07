import javafx.scene.canvas.GraphicsContext;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Ball extends Game.CannonGame {
    //Variables
    double posInitX = 0;
    double posInitY = 0;
    double posx = 0;
    double posy = 0;
    double velocidad = cannon.Strength;
    double gravedad = -9.8;
    double angulo = cannon.rotation * Math.PI / 180f;
    Image balon;
    boolean fire = false;
    float tiempo = 0;

    //Velocidad horizontal y vertical
    double velocidadX = velocidad * Math.cos(angulo);
    double velocidadY = velocidad * Math.sin(angulo);



    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {

        //Guardamos la posición inicial
        if(fire){
        }


    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

        balon = ResourceManager.getImage("resources/ball.png");

        while(posy >= 0){
            posx =  posInitX + velocidadX*tiempo;
            posy =  posInitY + velocidadY* tiempo + gravedad * tiempo * tiempo/2f;
            float x = (float) posx;
            float y = (float) posy;
            graphics.drawImage(balon,x,y);
            tiempo += 0.2;
        }
        Fail();
    }
    static boolean Fail(){
        return true;
    }
}
