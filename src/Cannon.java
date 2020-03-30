import org.newdawn.slick.*;

public class Cannon extends Game.CannonGame {
    Image cannon;
    Image cannon_base;
    double rotation = 5;
    double Strength = 0;

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        Input input = gameContainer.getInput();

    }
    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        int x = 25;
        int y = gameContainer.getHeight() - 150;

        cannon = ResourceManager.getImage("resources/cannon.png");
        cannon_base = ResourceManager.getImage("resources/cannon_base.png");
        graphics.drawImage(cannon,x,y);
        graphics.drawImage(cannon_base,x,y + 30);
    }
}
