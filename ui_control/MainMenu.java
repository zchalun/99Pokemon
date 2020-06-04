package ui_control;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model_pokemon.PokeDex;
import model_products.Food;
import model_products.Menu;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.ItemCollection;
import com.amazonaws.services.dynamodbv2.document.QueryOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.spec.QuerySpec;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ScanRequest;
import com.amazonaws.services.dynamodbv2.model.ScanResult;

import Login.LoggedInUI;

import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.Image;
import java.util.*;
import model_pokemon.*;
import javax.swing.ScrollPaneConstants;

public class MainMenu extends JFrame {

	/** 
	 *  
	 */
	private static final long serialVersionUID = 1L;
	//private final Action action = new SwingAction();
	ArrayList<Pokemon> checkedPokemon = new ArrayList<Pokemon>();
	boolean[] flavors = new boolean[5];
	Menu newMenu = new Menu();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainMenu() {
		
		getContentPane().setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1200, 750);
		getContentPane().setLayout(null);
		
		//HEADERS
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		panel.setBounds(0, 0, 1200, 94);
		panel.setBackground(new Color(36,104,177));
		
		JLabel logo = new JLabel("");
		java.awt.Image logoimage = new ImageIcon("pics/99-Pok.png").getImage();
		panel.setLayout(null);
		panel.add(logo);
		logo.setIcon(new ImageIcon(logoimage));
		logo.setBounds(0, 0, 240, 94);
		
		JButton Advertisement = new JButton("");
		java.awt.Image ad = new ImageIcon("pics/Ad.png").getImage();
		Advertisement.setBounds(240, 0, 720, 94);
		panel.add(Advertisement);
		Advertisement.setBackground(new java.awt.Color(36,104,177));
		Advertisement.setIcon(new ImageIcon(ad));
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(230, 114, 931, 589);
		getContentPane().add(scrollPane);
		
		JPanel panel_menu = new JPanel();
		scrollPane.setViewportView(panel_menu);
		
		
		JButton LoginButton = new JButton("");
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.LoginPageUI.main(null);
			}
		});
		java.awt.Image login = new ImageIcon("pics/Login.png").getImage();
		LoginButton.setBounds(960, 0, 240, 94);
		panel.add(LoginButton);
		LoginButton.setBackground(new java.awt.Color(36,104,177));
		LoginButton.setIcon(new ImageIcon(login));
		
		JPanel panel_sort = new JPanel();
		panel_sort.setBounds(26, 112, 194, 591);
		getContentPane().add(panel_sort);
		panel_sort.setLayout(null);
		
		JLabel lblType = new JLabel("Select Type:");
		lblType.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblType.setBounds(10, 55, 182, 59);
		panel_sort.add(lblType);
		
		JCheckBox chckbxBug = new JCheckBox("Bug\r\n");
		chckbxBug.setBounds(20, 120, 93, 21);
		panel_sort.add(chckbxBug);
		chckbxBug.addActionListener(new ActionListener() {
			
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	Bug b = new Bug();
    			panel_menu.removeAll();
    			calculateFlavors(b);
    			displayMenu(panel_menu);
            }
        });
		
		
		
		JCheckBox chckbxDragon = new JCheckBox("Dragon");
		chckbxDragon.setBounds(20, 142, 93, 21);
		panel_sort.add(chckbxDragon);
		chckbxDragon.addActionListener(new ActionListener() {
			
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	Dragon d = new Dragon();
    			panel_menu.removeAll();
    			calculateFlavors(d);
    			displayMenu(panel_menu);
            }
        });
		
		
		JCheckBox chckbxElectric = new JCheckBox("Electric");
		chckbxElectric.setBounds(20, 165, 93, 21);
		panel_sort.add(chckbxElectric);
		chckbxElectric.addActionListener(new ActionListener() {
			
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	Electric el = new Electric();
    			panel_menu.removeAll();
    			calculateFlavors(el);
    			displayMenu(panel_menu);
            }
        });
		
		JCheckBox chckbxFighting = new JCheckBox("Fighting");
		chckbxFighting.setBounds(20, 185, 93, 21);
		panel_sort.add(chckbxFighting);
		chckbxFighting.addActionListener(new ActionListener() {
			
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	Fighting fi = new Fighting();
    			
    			if (checkedPokemon.contains(fi))
    			panel_menu.removeAll();
    			calculateFlavors(fi);
    			displayMenu(panel_menu);
            }
        });
		
		
		JCheckBox chckbxFire = new JCheckBox("Fire");
		chckbxFire.setBounds(20, 208, 93, 21);
		panel_sort.add(chckbxFire);
		chckbxFire.addActionListener(new ActionListener() {
			
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	Fire f = new Fire();
    			panel_menu.removeAll();
    			calculateFlavors(f);
    			displayMenu(panel_menu);
            }
        });
		
		JCheckBox chckbxFlying = new JCheckBox("Flying");
		chckbxFlying.setBounds(20, 231, 93, 21);
		panel_sort.add(chckbxFlying);
		chckbxFlying.addActionListener(new ActionListener() {
			
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	Flying f = new Flying();
    			panel_menu.removeAll();
    			calculateFlavors(f);
    			displayMenu(panel_menu);
            }
        });
		
		JCheckBox chckbxGhost = new JCheckBox("Ghost");
		chckbxGhost.setBounds(20, 254, 93, 21);
		panel_sort.add(chckbxGhost);
		chckbxGhost.addActionListener(new ActionListener() {
			
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	Ghost g = new Ghost();
    			panel_menu.removeAll();
    			calculateFlavors(g);
    			displayMenu(panel_menu);
            }
        });
		
		JCheckBox chckbxGrass = new JCheckBox("Grass");
		chckbxGrass.setBounds(20, 277, 93, 21);
		panel_sort.add(chckbxGrass);
		chckbxGrass.addActionListener(new ActionListener() {
			
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	Grass g = new Grass();
    			panel_menu.removeAll();
    			calculateFlavors(g);
    			displayMenu(panel_menu);
            }
        });
		
		JCheckBox chckbxGround = new JCheckBox("Ground");
		chckbxGround.setBounds(20, 300, 93, 21);
		panel_sort.add(chckbxGround);
		chckbxGround.addActionListener(new ActionListener() {
			
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	Ground g = new Ground();
    			panel_menu.removeAll();
    			calculateFlavors(g);
    			displayMenu(panel_menu);
            }
        });
		
		JCheckBox chckbxIce = new JCheckBox("Ice");
		chckbxIce.setBounds(20, 323, 93, 21);
		panel_sort.add(chckbxIce);
		chckbxIce.addActionListener(new ActionListener() {
			
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	Ice i = new Ice();
    			panel_menu.removeAll();
    			calculateFlavors(i);
    			displayMenu(panel_menu);
            }
        });
		
		JCheckBox chckbxNormal = new JCheckBox("Normal");
		chckbxNormal.setBounds(20, 346, 93, 21);
		panel_sort.add(chckbxNormal);
		chckbxNormal.addActionListener(new ActionListener() {
			
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	Normal n = new Normal();
    			panel_menu.removeAll();
    			calculateFlavors(n);
    			displayMenu(panel_menu);
            }
        });
		
		JCheckBox chckbxPoison = new JCheckBox("Poison");
		chckbxPoison.setBounds(20, 369, 93, 21);
		panel_sort.add(chckbxPoison);
		chckbxPoison.addActionListener(new ActionListener() {
			
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	Poison p = new Poison();
    			panel_menu.removeAll();
    			calculateFlavors(p);
    			displayMenu(panel_menu);
            }
        });
		
		JCheckBox chckbxPsychic = new JCheckBox("Psychic");
		chckbxPsychic.setBounds(20, 392, 93, 21);
		panel_sort.add(chckbxPsychic);
		chckbxPsychic.addActionListener(new ActionListener() {
			
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	Psychic p = new Psychic();
    			panel_menu.removeAll();
    			calculateFlavors(p);
    			displayMenu(panel_menu);
            }
        });
		
		JCheckBox chckbxRock = new JCheckBox("Rock");
		chckbxRock.setBounds(20, 415, 93, 21);
		panel_sort.add(chckbxRock);
		chckbxRock.addActionListener(new ActionListener() {
			
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	Rock r = new Rock();
    			panel_menu.removeAll();
    			calculateFlavors(r);
    			displayMenu(panel_menu);
            }
        });
		JCheckBox chckbxSteel = new JCheckBox("Steel");
		chckbxSteel.setBounds(20, 438, 93, 21);
		panel_sort.add(chckbxSteel);
		chckbxSteel.addActionListener(new ActionListener() {
			
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	Steel s = new Steel();
    			panel_menu.removeAll();
    			calculateFlavors(s);
    			displayMenu(panel_menu);
            }
        });
		
		JCheckBox chckbxWater = new JCheckBox("Water");
		chckbxWater.setBounds(20, 461, 93, 21);
		panel_sort.add(chckbxWater);
		chckbxWater.addActionListener(new ActionListener() {
			
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	Water w = new Water();
    			panel_menu.removeAll();
    			calculateFlavors(w);
    			displayMenu(panel_menu);
            }
        });
		
		
	
		//displays all 30 food options
		displayMenu(panel_menu);
		panel_menu.setLayout(null);
	}

	
	public void displayMenu(JPanel panel_menu)
	{

		int x = 30;
		int y = 10;
				
		//adds all food items in menu
		System.out.println(newMenu.MenuSelections.size());
		for (int j = 0; j < newMenu.MenuSelections.size(); j++)
		{
				Food k = newMenu.MenuSelections.get(j);
			//creates a new row when it gets too full
			if (x > 780)
			{
				x = 30;
				y += 113;
			}
					
			JButton btnNewButton = new JButton(); //ERASE THE LINE IN THE PARENTHESES WHEN RUNNING (see below)
			//newMenu.MenuSelections.get(j).getName()
			btnNewButton.setBounds(x, y, 110, 200);
			panel_menu.add(btnNewButton);
			btnNewButton.addActionListener(new ActionListener() {
				
	            public void actionPerformed(ActionEvent e) {
	            	ProductViewUI.main(k);
	            }
	        });
			//picture on buttons
			java.awt.Image foodimage = new ImageIcon("pics/" + k.getName() + ".png").getImage();
			Image newImage = foodimage.getScaledInstance(110, 110, Image.SCALE_DEFAULT);
			btnNewButton.setIcon(new ImageIcon(newImage));
			btnNewButton.setBounds(x, y, 110, 110);
			
			x+= 150; 
		}
		
		//refreshes the screen
		panel_menu.revalidate();
		panel_menu.repaint();
				
	}
	
	public void calculateFlavors(Pokemon p)
	{
		//checks if you unchecked the box or checked the box
		boolean unchecked = false;	    	
    	for (int i = 0; i < checkedPokemon.size(); i++)
    	{
    		if (checkedPokemon.get(i).getName().contentEquals(p.getName()))
    		{
    			unchecked = true;
    			checkedPokemon.remove(i);
    		}
    	}
    	
    	if (unchecked == false)
    		checkedPokemon.add(p);
    		
		//clear menu
		newMenu.MenuSelections.clear();
		System.out.println(checkedPokemon.size());
		
		//zero out flavors
		for (int i = 0; i < 5; i++)
			flavors[i] = false;
		
		//add flavors again
		for (Pokemon pokemon: checkedPokemon)
		{
			for (int f: pokemon.getFlavors())
				flavors[f] = true;
		}
		
		//for searching -- links to MenuTable in AWS
		AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().withRegion("us-east-2").build();
	    DynamoDB dynamoDB = new DynamoDB(client);
	    Table table = dynamoDB.getTable("MenuTable");
	    
	    
	    //going through flavors
	    for (int i = 0; i < 5; i++)
	    {
	    	//if our pokemon can eat this flavor
	    	if (flavors[i] == true)
	    	{
	    		//get's the string value for that flavor (real name not integer)
	    		String type = getFlavorType(i);
	    		
	    		//Scanning for the flavor it can eat
	    		//got from online
	    		Map<String, AttributeValue> expressionAttributeValues = 
	    			    new HashMap<String, AttributeValue>();
	    		expressionAttributeValues.put(":val", new AttributeValue().withS(type)); 
	    		
			    ScanRequest scanRequest = new ScanRequest()
			    		.withFilterExpression("Flavor = :val")
			    	    .withTableName("MenuTable")
			    		.withExpressionAttributeValues(expressionAttributeValues);


			    //list of foods with the flavor we asked for
			    ScanResult result = client.scan(scanRequest);
			    for (Map<String, AttributeValue> item : result.getItems()){
			    	//gets each food name and price
			    	String name = item.get("Name").getS();
			    	double price = Double.parseDouble(item.get("Price").getN());
			    	Food food = new Food(name, price);
			    	
			    	//adds food to menu
			    	newMenu.MenuSelections.add(food);
			    }

	    	}
	    }
	    
	    
	}
	
	
	public String getFlavorType(int type)
	{
		if (type == 0)
			return "bitter";
		else if (type == 1)
			return "spicy";
		else if (type == 2)
			return "sour";
		else if (type == 3)
			return "sweet";
		else 
			return "dry";
	}
}