import javax.swing.JFrame;

import brickBracker.GamePlay;

public class Main {
    public static void main(String[] args) throws Exception {
        JFrame obj=new JFrame();
        GamePlay gamePlay=new GamePlay();
        obj.setBounds(10, 10, 700, 600);
        obj.setTitle("Breakout Ball");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
    }
}
