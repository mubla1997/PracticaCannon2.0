import org.newdawn.slick.*;

public class Cannon extends Game.CannonGame {
    Image cannon;
    Image cannon_base;
    double rotation = 5;
    double Strength = 0;

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        Input input = gameContainer.getInput();
        // El cañon se mueve hacia abajo.
        if(input.isKeyDown(Input.KEY_DOWN)){
            if(cannon.getRotation() * -1 > 5){
                cannon.rotate(2);
                rotation = cannon.getRotation() * -1;
            }
        }
        // El cañon se mueve hacia arriba.
        if(input.isKeyDown(Input.KEY_UP)){
            if(cannon.getRotation()* -1 < 90){
                cannon.rotate(-2);
                rotation = cannon.getRotation() * -1;
            }
        }

        if(input.isKeyDown(Input.KEY_RIGHT)){
            if(Strength < 100){
                Strength ++;
            }
        }
        if(input.isKeyDown(Input.KEY_LEFT)){
            if(Strength > 0){
                Strength --;
            }
        }
        if(input.isKeyDown(Input.KEY_SPACE)){
            fire(ball);
            // Añadir si da en la diana
            //Añadir si falla
        }
    }
    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        int x = 25;
        int y = gameContainer.getHeight() - 150;

        cannon = ResourceManager.getImage("resources/cannon.png");
        cannon_base = ResourceManager.getImage("resources/cannon_base.png");
        graphics.drawImage(cannon,x,y);
        graphics.drawImage(cannon_base,x,y + 30);
        cannon.setCenterOfRotation(30,30);
    }
    void fire(Ball ball){
        ball.SetFire();
    }
    void updateRotation(double deltaRotation){}
    void updateStrenght(double deltaStrenght){}
    double getRotation(){return 0;}
    double getStrength(){return 0;}

}
