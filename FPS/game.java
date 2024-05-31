import javax.swing.*;


class FPS
{
    public static void main(String[] args) {
        JFrame frame = new JFrame("FPS Control Loop");
        frame.setResizable (false);
        GamePanel game = new GamePanel();
        frame.add(game);
        game.startGame();
      //  frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500 );
        frame.setVisible(true);

    }

}