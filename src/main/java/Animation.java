
import javax.swing.event.*;
import java.awt.*;
import javax.swing.*;

public class Animation extends JFrame {
    JFrame frame;
    int x=200;
    int y=200;

    public void goAnimation() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel myDrawPanel = new MyDrawPanel();
        frame.getContentPane().add(myDrawPanel);
        frame.setSize(900, 900);
        //System.out.println(frame.getSize());
        //System.out.println(frame.getWidth());
        frame.setVisible(true);
        while ((x <= (frame.getWidth() - 200)) && (y <= (frame.getHeight() - 200))) {
            x += 50; //5
            y += 50; //5
            myDrawPanel.repaint();
            try {
                Thread.sleep(150); //50
            } catch (Exception ex) {
                ex.printStackTrace();
            }


        /*  Вариант реализации через for
        for (int i=0;i<700;i++){
            x++;
            y++;
            myDrawPanel.repaint();
            try{
                Thread.sleep(25);
            }catch (Exception ex){
                ex.printStackTrace();
            }

         */
        }
    }

    class MyDrawPanel extends JPanel {
        public void paintComponent(Graphics g) {

            //int xCoordinate=frame.getWidth();

            /*
            g.setColor(Color.white);
            g.fillOval(0,0,this.getWidth(),this.getHeight());
            g.setColor(Color.pink);



            int x = 50;
            int y = 50;


            while ((x <= (frame.getWidth() - 200)) && (y <= (frame.getHeight() - 200))) {

                g.setColor(Color.white);
                g.fillOval(0,0,this.getWidth(),this.getHeight());

               g.setColor(Color.pink);
               g.fillOval(x, y, 100, 100);
                x += 5;
                y += 5;

                repaint();


            try {
                Thread.sleep(25);
            }catch (Exception ex){
                ex.printStackTrace();
            }

            }
         */
            g.setColor(Color.white);
            g.fillRect(0,0,this.getWidth(),this.getHeight());

            g.setColor(Color.PINK);
            g.fillOval(x,y,40,40);

        }
    }

    public static void main(String[] args) {
        Animation animation = new Animation();
        animation.goAnimation();

    }
}
