/*
import javax.swing.event.*;
import java.awt.*;
import javax.swing.*;

public class AnimationTwo {
    int x=70;
    int y=70;

    public static void main(String[] args) {
        AnimationTwo animationTwo=new AnimationTwo();
        animationTwo.go();

    }
    public void go(){
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel myDrawPanel=new MyDrawPanel();
        frame.getContentPane().add(myDrawPanel);

        frame.setSize(700,700);
        frame.setVisible(true);

        for(int i=0;i<130;i++){
            x++;
            y++;
            myDrawPanel.repaint();
            try {
                Thread.sleep(10);
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }

    }
    class MyDrawPanel extends JPanel{
        public  void printComponent(Graphics g){
            g.setColor(Color.green);
            g.fillOval(x,y,40,40);
        }
    }
}



 */