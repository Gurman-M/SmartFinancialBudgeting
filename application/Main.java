import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    static JButton budgetInfoBtn = new JButton();
    static JButton budgetBtn = new JButton();
    static JLabel incomeLabel = new JLabel();
    static JSlider slider;
    static JLabel needs = new JLabel();
    static JLabel wants = new JLabel();
    static JLabel savings = new JLabel();
    
    static int buttonPress = 0;
    
    public static void main(String[] args) {    
        // Creating instance of JFrame
        JFrame frame = new JFrame("Money Budgeting");
        frame.setBackground(Color.WHITE);
        
        // Setting the width and height of frame
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        
        // adding panel to frame
        frame.add(panel);
       
        placeComponents(panel);

        // Setting the frame visibility to true
        frame.setResizable(false);
        frame.setVisible(true);
        
        
        budgetBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                incomeLabel.setText("Yearly Income: " + (int) slider.getValue() + " 000");
            }
        });
        
        budgetInfoBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	buttonPress++;
            	
            	if (buttonPress % 2 != 0) {
            		budgetInfoBtn.setText("Hide Monthly Budget Information");
	                needs.setText("Essentials: $" + Math.round(((slider.getValue() * 0.5)/12) * 1000));
	                wants.setText("Wants: $" + Math.round(((slider.getValue() * 0.3)/12) * 1000));
	                savings.setText("Investments/Savings: $" + Math.round(((slider.getValue()/12) * 0.2) * 1000));
            	} else {
            		budgetInfoBtn.setText("Show Monthly Budget Information");
            		needs.setText("");
	                wants.setText("");
	                savings.setText("");
            	}
            }
        });
    }

    private static void placeComponents(JPanel panel) {

        panel.setLayout(null);
        
        JLabel Title = new JLabel("Budget Plan");
        JLabel subTitle = new JLabel("Set your annual income (scale measured in thousands). We use the amount you");
        JLabel subTitle2 = new JLabel("set as a benchmark to determine how you should divide your expenses.");
        
        JLabel subTitle3 = new JLabel("Now what?");
        JLabel subTitle4 = new JLabel("Now, you can view how you should budget your money to take care of your");
        JLabel subTitle5 = new JLabel("monthly expenses; While also planning for the future through savings");
        JLabel subTitle6 = new JLabel("and investments.");
        JLabel label = new JLabel(); // making new Jlabel
       
        budgetInfoBtn.setText("Show Monthly Budget Information"); //budgeting information
        budgetBtn.setText("Set Income"); //making new Jbutton and set it to Set income
        incomeLabel.setText("Yearly Income: Not set"); //set Jlabel Yearly Income
        
        
        //slider
         int SML_INC = 30;
         int MID_INC = 65;
         int LAG_INC = 100;
        
        slider = new JSlider(JSlider.HORIZONTAL, SML_INC, LAG_INC, MID_INC);
        
        slider.setLocation(500, 500);
        slider.setMinorTickSpacing(5);
        slider.setMajorTickSpacing(20);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setBackground(Color.WHITE);

        //set title
        Title.setFont(new Font("Monospaced", Font.BOLD, 30));
        Title.setForeground(Color.BLACK);
        
        subTitle.setFont(new Font("Monospaced", Font.PLAIN, 15));
        subTitle.setForeground(Color.GRAY);
        subTitle2.setFont(new Font("Monospaced", Font.PLAIN, 15));
        subTitle2.setForeground(Color.GRAY);
        
        subTitle3.setFont(new Font("Monospaced", Font.BOLD, 20));
        subTitle3.setForeground(Color.BLACK);
        subTitle4.setFont(new Font("Monospaced", Font.PLAIN, 15));
        subTitle4.setForeground(Color.GRAY);
        subTitle5.setFont(new Font("Monospaced", Font.PLAIN, 15));
        subTitle5.setForeground(Color.GRAY);
        subTitle6.setFont(new Font("Monospaced", Font.PLAIN, 15));
        subTitle6.setForeground(Color.GRAY);
        
        
        //title
        Title.setBounds(385,20,500,50);
        panel.add(Title);
        
        //subtitle
        subTitle.setBounds(170,75,700,50);
        subTitle2.setBounds(200,95,700,50);
        
        subTitle3.setBounds(440,340,250,25);
        subTitle4.setBounds(170,380,700,25);
        subTitle5.setBounds(170,410,700,25);
        subTitle6.setBounds(430,440,700,25);
        
        panel.add(subTitle);
        panel.add(subTitle2);
        panel.add(subTitle3);
        panel.add(subTitle4);
        panel.add(subTitle5);
        panel.add(subTitle6);
        
        //slider
        slider.setBounds(375,175,250,50);
        panel.add(slider);

        //slider button
        budgetBtn.setBounds(375,275,100,25);
        panel.add(budgetBtn);
        
        //income button
        incomeLabel.setBounds(485,275,250,25);
        panel.add(incomeLabel);

        budgetInfoBtn.setBounds(375,480,250,25);
        panel.add(budgetInfoBtn);

        needs.setBounds(375,530,165,25);
        panel.add(needs);

        wants.setBounds(375,560,165,25);
        panel.add(wants);

        savings.setBounds(375,590,300,25);
        panel.add(savings);
       
    }
}