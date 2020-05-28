package ui_control;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model_pokemon.PokeDex;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class FoodMenu extends JFrame
{
	public FoodMenu() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pokemn Food Menu\r\n");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(197, 13, 244, 50);
		getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 76, 160, 350);
		getContentPane().add(panel);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Normal-----\r\n");
		panel.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Fire-----\r\n\r\n");
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Water-----");
		panel.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Grass------\r\n");
		panel.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Fighting-----");
		panel.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("Ground-------");
		panel.add(chckbxNewCheckBox_6);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Ice----------");
		panel.add(chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("Dragon-----");
		panel.add(chckbxNewCheckBox_7);
		
		JCheckBox chckbxNewCheckBox_8 = new JCheckBox("Fairy-----");
		panel.add(chckbxNewCheckBox_8);
		
		JCheckBox chckbxNewCheckBox_9 = new JCheckBox("Poison----------");
		panel.add(chckbxNewCheckBox_9);
		
		JCheckBox chckbxNewCheckBox_10 = new JCheckBox("Bug----------");
		panel.add(chckbxNewCheckBox_10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(177, 76, 463, 350);
		getContentPane().add(panel_1);
	}
}
