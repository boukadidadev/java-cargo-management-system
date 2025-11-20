package com.cargaison.Cargaison;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionCargaisonsGUI {
    public static void main(String[] args) {
        // Création de la fenêtre principale
        JFrame frame = new JFrame("Gestion des Cargaisons");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        frame.add(panel);

        // Panel supérieur pour la saisie de la cargaison
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(2, 3, 5, 5));
        panel.add(topPanel, BorderLayout.NORTH);

        JLabel lblDistance = new JLabel("Distance :");
        JTextField txtDistance = new JTextField();
        JLabel lblType = new JLabel("Type :");
        JComboBox<String> cbType = new JComboBox<>(new String[]{"Routière", "Aérienne"});
        JButton btnAjouterCargaison = new JButton("Ajouter");

        topPanel.add(lblDistance);
        topPanel.add(txtDistance);
        topPanel.add(lblType);
        topPanel.add(cbType);
        topPanel.add(new JLabel()); // Espace vide
        topPanel.add(btnAjouterCargaison);

        // Panel central pour ajouter des marchandises
        JPanel middlePanel = new JPanel();
        middlePanel.setLayout(new BorderLayout());
        panel.add(middlePanel, BorderLayout.CENTER);

        JTable table = new JTable(new DefaultTableModel(new Object[]{"Num", "Poids", "Volume"}, 0));
        JScrollPane scrollPane = new JScrollPane(table);
        middlePanel.add(scrollPane, BorderLayout.CENTER);

        JPanel addPanel = new JPanel();
        addPanel.setLayout(new GridLayout(1, 4, 5, 5));
        JTextField txtNum = new JTextField();
        JTextField txtPoids = new JTextField();
        JTextField txtVolume = new JTextField();
        JButton btnAdd = new JButton("Add");
        addPanel.add(txtNum);
        addPanel.add(txtPoids);
        addPanel.add(txtVolume);
        addPanel.add(btnAdd);
        middlePanel.add(addPanel, BorderLayout.NORTH);

        // Panel inférieur pour le coût
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BorderLayout());
        panel.add(bottomPanel, BorderLayout.SOUTH);

        JLabel lblCout = new JLabel("Coût de la cargaison : ");
        JTextField txtCout = new JTextField();
        txtCout.setEditable(false);
        bottomPanel.add(lblCout, BorderLayout.WEST);
        bottomPanel.add(txtCout, BorderLayout.CENTER);

        // Actions pour les boutons
        btnAjouterCargaison.addActionListener(e -> {
            String distanceStr = txtDistance.getText();
            String type = (String) cbType.getSelectedItem();

            if (distanceStr.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Veuillez entrer la distance !");
                return;
            }

            double distance = Double.parseDouble(distanceStr);
            JOptionPane.showMessageDialog(frame, "Cargaison " + type + " ajoutée avec distance " + distance + " !");
        });

        btnAdd.addActionListener(e -> {
            String numStr = txtNum.getText();
            String poidsStr = txtPoids.getText();
            String volumeStr = txtVolume.getText();

            if (numStr.isEmpty() || poidsStr.isEmpty() || volumeStr.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Veuillez remplir tous les champs !");
                return;
            }

            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.addRow(new Object[]{numStr, poidsStr, volumeStr});

            txtNum.setText("");
            txtPoids.setText("");
            txtVolume.setText("");
        });

        // Afficher la fenêtre
        frame.setVisible(true);
    }
}

