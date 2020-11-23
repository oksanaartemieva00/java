package ru.geekbrains.lesson_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPet extends JFrame {
    String[] action = {"Покормить", "Поиграть", "Уложить спать"};
    JButton feed = new JButton(action[0]);
    JButton play = new JButton(action[1]);
    JButton sleep = new JButton(action[2]);
    JLabel text = new JLabel("Выберите действие");
    public MyPet() {
        setTitle("Тамагочи лайт");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 500);
        setResizable(false);

        JPanel button = new JPanel(new GridLayout(1, 3));
        button.setSize(483, 200);
        button.add(feed);
        button.add(play);
        button.add(sleep);
        add(button);

        JPanel field = new JPanel();
        field.setLayout(new GridLayout());
        field.add(text, CENTER_ALIGNMENT);
        setLayout(new BorderLayout());
        add(field, BorderLayout.CENTER);

        play.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("Питомец поиграл");
            }
        });

        feed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("Питомец поел");

            }
        });

        sleep.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("Питомец поспал");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new MyPet();
    }
}
