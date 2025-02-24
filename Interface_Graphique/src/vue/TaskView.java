package vue;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import model.Task;
import frames.Awt_constructeur;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class TaskView extends JFrame {
    private JTextField taskInput;
    private JButton addButton, removeButton;
    private JCheckBox completeCheckBox;
    private JTable taskTable;
    private DefaultTableModel tableModel;
    private JPanel panel;


    public TaskView() {
    	 setTitle("Gestionnaire de tâches");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        taskInput = new JTextField(20);
        addButton = new JButton("Ajouter Tâche");
        removeButton = new JButton("Supprimer");
        completeCheckBox = new JCheckBox("Terminée");
        
        
        tableModel = new DefaultTableModel(new Object[]{"Description", "Terminée"}, 0);
        taskTable = new JTable(tableModel);
        
        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(taskInput);
        panel.add(addButton);
        panel.add(removeButton);
        panel.add(completeCheckBox);
       
        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(taskTable), BorderLayout.CENTER);

        addButton.addActionListener(new ActionListener() {
        	
            public void actionPerformed(ActionEvent e) {
            }
        });
        removeButton.addActionListener(new ActionListener() {
        	
            public void actionPerformed(ActionEvent e) {
                
            }
        });
       
        
        setVisible(true);
        
    }


	public void updateTaskList(List<Task> taskList) {
		// TODO Auto-generated method stub
		
	}
   
	
}
