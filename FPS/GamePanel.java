
import java.awt.*;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
    int x = 0;
    int y = 0;
    Thread thread;

    public GamePanel() 
    { super();
        this.setPreferredSize(new Dimension(500,500));
        this.setBackground(Color.black);
    }
    
   public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.setColor(Color.red);
    g.fillRect(x, y, 100, 100);
  }
  public void startGame(){
thread =new Thread(this);
thread.start();

  }
  public void update(){
   

  }

@Override
public void run() 
{
    double drawInterval = 1000000000/90;
    double deltaTime =0;
    long lastPassedTime = System.nanoTime();
    long currentTime = 0;
    while(thread != null){
        currentTime = System.nanoTime();
        deltaTime+= (currentTime - lastPassedTime)/drawInterval;
        lastPassedTime = currentTime;

        if(deltaTime >=1){
            x ++;
            repaint();
            deltaTime--;
        }
}
}
    
}

