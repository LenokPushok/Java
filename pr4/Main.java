package com.company;

import javax.swing.*;

public class Main {

    public static void main(String args[]) {
        // Создать фрейм в потоке диспетчера событий (создает объект SwingDemo)
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingDemo();
            }
        });
    }
}
