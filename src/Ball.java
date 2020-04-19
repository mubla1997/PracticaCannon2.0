import javafx.scene.canvas.GraphicsContext;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Ball extends Game.CannonGame {
    //Variables
    double posInitX = 0;
    double posInitY = 0;
    Integer posx = 30;
    Integer posy = 465;
    double velocidad = 0;
    double gravedad = -5.8;
    double angulo = 0;
    Image balon;
    float tiempo = 0;
    float x = 30;
    float y = 465;
    //Velocidad horizontal y vertical
    double velocidadX = 0;
    double velocidadY = 0;
    boolean fire = false;


    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {

        //Guardamos la posición inicial
        if(fire){
                velocidad = cannon.Strength;
                angulo = cannon.rotation * Math.PI / 180f;
                velocidadX = velocidad * Math.cos(angulo);
                velocidadY = velocidad * Math.sin(angulo);
                tiempo += 0.2;

                x += velocidadX;
                y -= velocidadY;
                // Tiro parabolico ( No funciona )
              /*
                posx += (int) Math.floor((posInitX) + (velocidadX * tiempo));
                posy -= (int) Math.floor((posInitY) - (velocidadY * tiempo) + (tiempo * (tiempo / 2f)) * gravedad);
              */

        }

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

        if(x > gameContainer.getWidth() || y > gameContainer.getHeight()){
            setResetPosition();
            fire = false;
        }

        balon = ResourceManager.getImage("resources/ball.png");
        graphics.drawImage(balon, x, y);
        }

     void setResetPosition(){
        x = 30;
        y = 465;
    }
    void SetFire(){
        fire = true;
    }
}
