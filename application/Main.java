import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSlider;
import javax.swing.JTextField; 
import java.awt.Font;

public class Main {
    
    public static void main(String[] args) {    
        // Creating instance of JFrame
        JFrame frame = new JFrame("My First Swing Example");
        
        // Setting the width and height of frame
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        
        // adding panel to frame
        frame.add(panel);
       
        placeComponents(panel);

        // Setting the frame visibility to true
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {

        panel.setLayout(null);
        
        JLabel Title = new JLabel("Budget Plan");

        JLabel label = new JLabel(); // making new Jlabel
        JLabel incomeLabel = new JLabel("Yearly Income: Not set"); //set Jlabel Yearly Income
        JLabel needs = new JLabel();
        JLabel wants = new JLabel();
        JLabel savings = new JLabel();
       
        JButton budgetInfoBtn = new JButton("Show Budget Information"); //budgetiung informatio
        JButton budgetBtn = new JButton("Set Income"); //making new Jbutton and set it to Set income
        
        
        //slider
         int SML_INC = 10;
         int LAG_INC = 100;
         int MID_INC = 50;
        
        JSlider slider = new JSlider(JSlider.HORIZONTAL, SML_INC, LAG_INC, MID_INC);
        
        slider.setLocation(500, 500);
        slider.setMinorTickSpacing(5);
        slider.setMajorTickSpacing(20);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        //set title
        Title.setFont(new Font("Montserrat", Font.PLAIN, 15));
        
        //set Bounds Button
        Title.setBounds(400, 20, 165, 25);
        panel.add(Title);
        
        slider.setBounds(400, 100, 250, 50);
        panel.add(slider);

        budgetBtn.setBounds(400, 225, 165, 25);
        panel.add(budgetBtn);

        budgetInfoBtn.setBounds(400, 300, 165, 25);
        panel.add(budgetInfoBtn);

        incomeLabel.setBounds(400, 450, 340, 20);
        panel.add(incomeLabel);

        needs.setBounds(400, 600, 165, 25);
        panel.add(needs);

        wants.setBounds(400, 620, 165, 25);
        panel.add(wants);

        savings.setBounds(400, 630, 165, 25);
        panel.add(savings);

        
       
    }
}