import javafx.scene.canvas.GraphicsContext;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Ball extends Game.CannonGame {
    //Variables
    double posInitX = 0;
    double posInitY = 0;
    Integer posx;
    Integer posy;
    double velocidad = cannon.Strength;
    double gravedad = -9.8;
    double angulo = cannon.rotation * Math.PI / 180f;
    Image balon = ResourceManager.getImage("resources/ball.png");;
    float tiempo = 0;
    float x ;
    float y ;
    //Velocidad horizontal y vertical
    double velocidadX = velocidad * Math.cos(angulo);
    double velocidadY = velocidad * Math.sin(angulo);



    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {

        //Guardamos la posición inicial
        if(!fail()){
            tiempo += 0.2;
            posx = (int) Math.floor((posInitX) + (velocidadX * tiempo));
            posy = (int) Math.floor((posInitY) + (velocidadY * tiempo) + (tiempo * (tiempo / 2f)) * gravedad );
        }else{
            setResetPosition();
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawImage(balon, posx, posy);

        }
    static boolean fail(){
        return true;
    }
     void setResetPosition(){
        x = 30;
        y = 650;
    }
}
