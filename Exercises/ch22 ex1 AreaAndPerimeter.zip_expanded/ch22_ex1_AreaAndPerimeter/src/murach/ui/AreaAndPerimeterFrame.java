package murach.ui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
//Import swing and awt items
@SuppressWarnings("serial")
public class AreaAndPerimeterFrame extends JFrame {
	int length;
	int width;
	int area;
	int perimeter;
	JButton computeButton = new JButton("compute");
	JButton resetButton = new JButton ("reset");
	// creation of variables and buttons

    public AreaAndPerimeterFrame() {
        try {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException |
                IllegalAccessException | UnsupportedLookAndFeelException e) {
            System.out.println(e);
        }
        initComponents();
        setTitle("Area and Perimeter Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setVisible(true);
        // exception catcher and look and feel creator
    }

    private void initComponents() {
    	int length = Integer.parseInt(lengthText.getText());
    	JTextField lengthText = new JTextField();
    	int width = Integer.parseInt(widthText.getText());
    	JTextField widthText = new JTextField();
    	int area = length * width;
    	JTextField areaText = new JTextField(area);
    	areaText.setEditable(false);
    	int perimeter = 2 * length + 2 * width;
    	JTextField perimeterText = new JTextField(perimeter);
    	perimeterText.setEditable(false);
    	JButton computeButton = new JButton("compute");
    	JButton resetButton = new JButton ("reset");
    	// JButton and text field creation and actions
    	
    	 try {
         } catch (NumberFormatException e) {
         	JOptionPane.showMessageDialog(this, "please enter a valid numerical digit");
         	// catching numerical errors
         }
    }

    // Helper method to return GridBagConstraints objects
    private GridBagConstraints getConstraints(int x, int y, int anchor) {
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 5, 0, 5);
        c.gridx = 3; c.gridy = 0; c.anchor = GridBagConstraints.LINE_END;
        panel.add(new JLabel("area = "), c);
        c.gridx = 4; c.gridy = 0; c.anchor = GridBagConstraints.LINE_START;
        panel.add(new JLabel("perimeter = "), c);
        // setting the grid bag constraints
        panel.setLayout(new GridBagLayout());
        c.gridx = 5; c.gridy = 0; c.anchor = GridBagConstraints.LINE_END;
        panel.add(new JLabel("compute"), c);
        return c;
        
        // setting the grid bag layout
    }

    private void computeButtonClicked() {
        this.add(computeButton);
        computeButton.addActionListener((doPressComputeButton) -> {
        	JOptionPane.showMessageDialog(computeButton, "the area is" + area + "\n" + "the perimeter is" + perimeter);
        	//computing the entered variables
        	
        });
        	
        }
        
    
    

    private void resetButtonClicked() {
        this.add(resetButton);
        resetButton.addActionListener((doPressResetButton) -> {
        	length = 0;
        	width = 0;
        	area = 0;
        	perimeter = 0;
        	//resetting all of the variables
        });
    }
}
