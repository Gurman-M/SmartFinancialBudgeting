import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.WindowConstants;

public class Main { 

    public static final int HEIGHT = 1000, WIDTH = 1000;

	public static void main(String[] args) {
        JFrame jframe = new JFrame();
        jframe.setTitle("Money Budgeter");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setSize(WIDTH, HEIGHT);
        jframe.setVisible(true);

        //slider
        
         int SML_INC = 25;
         int MID_INC = 65;
         int LAG_INC = 100;

        JSlider slider = new JSlider(JSlider.HORIZONTAL,
        SML_INC, LAG_INC, MID_INC);

        slider.setMinorTickSpacing(10);
        slider.setMajorTickSpacing(25);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        
        int income = slider.getValue();
        
        
        JPanel panel = new JPanel();
        panel.add(slider);
        jframe.add(panel);
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jframe.setSize(1000, 500);
        jframe.setVisible(true);




    }
}