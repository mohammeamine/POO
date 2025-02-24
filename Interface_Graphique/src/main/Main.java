package main;

import controle.TaskController;
import vue.TaskView;

import javax.swing.*;

public class Main {
	public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                TaskView vue = new TaskView();
//                new TaskController(vue);
                vue.setVisible(true);
            }
        });
    }
}
