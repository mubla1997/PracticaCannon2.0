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
    float tiempo = 0;
    Image balon;
    //Velocidad horizontal y vertical
    double velocidadX = velocidad * Math.cos(angulo);
    double velocidadY = velocidad * Math.sin(angulo);



    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

    }
}
