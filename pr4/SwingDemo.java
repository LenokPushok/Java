package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SwingDemo {
    int x = 0,y=0;
    SwingDemo() {
        // Создать новый контейнер (окна) JFrame
        JFrame jfrm = new JFrame("A Simple Swing Application");

        // Установка начального размера фрейма
        jfrm.setSize(400, 600);

        // Заершить работу прогрммы, когда пользователь закрывает приложение
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создать текстовую метку средствами Swing
        JLabel jlab = new JLabel(" ");
        JButton jbat1 = new JButton("AC Milan");
        JButton jbat2 = new JButton("Real Madrid");
        JLabel jLabel1 =new JLabel("Result: "+ x +" x "+y,SwingConstants.CENTER);
        JLabel jLabel2 =new JLabel("Last Scorer: N/A",SwingConstants.CENTER);
        JLabel jLabel3 =new JLabel("Winner: DRAW",SwingConstants.CENTER);
        // Отобразить фрейм
        jfrm.setVisible(true);
        jfrm.setLayout(new BorderLayout());

        jfrm.add(jbat1,BorderLayout.WEST);
        jfrm.add(jbat2,BorderLayout.EAST);
        jfrm.add(jLabel1,BorderLayout.SOUTH);
        jfrm.add(jLabel2,BorderLayout.NORTH);
        jfrm.add(jLabel3,BorderLayout.CENTER);
        MouseListener mouseListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                x++;
                jLabel1.setText("Result: "+ x +" x "+y);
                jLabel2.setText("Last Scorer: AC Milan");
                if (x>y) jLabel3.setText("Winner: AC Milan");
                else if(y>x) jLabel3.setText("Winner: Real Madrid");
                else jLabel3.setText("Winner: DRAW");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        jbat1.addMouseListener(mouseListener);
        MouseListener mouseListener2 = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                y++;
                jLabel1.setText("Result: "+ x +" x "+y);
                jLabel2.setText("Last Scorer: Real Madrid");
                if (x>y) jLabel3.setText("Winner: AC Milan");
                else if(y>x) jLabel3.setText("Winner: Real Madrid");
                else jLabel3.setText("Winner: DRAW");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        jbat2.addMouseListener(mouseListener2);
    }

}
