import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonDemo extends JFrame {

    private JRadioButton birdButton, catButton, dogButton, rabbitButton, pigButton;
    private JLabel imageLabel;
    private ImageIcon birdIcon, catIcon, dogIcon, rabbitIcon, pigIcon;

    public RadioButtonDemo() {
        super("RadioButtonDemo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Load the pet images
        birdIcon = new ImageIcon("bird.jpg");
        catIcon = new ImageIcon("cat.jpg");
        dogIcon = new ImageIcon("dog.jpg");
        rabbitIcon = new ImageIcon("rabbit.jpg");
        pigIcon = new ImageIcon("pig.jpg");

        // Create radio buttons
        birdButton = new JRadioButton("Bird");
        catButton = new JRadioButton("Cat");
        dogButton = new JRadioButton("Dog");
        rabbitButton = new JRadioButton("Rabbit");
        pigButton = new JRadioButton("Pig");

        // Add radio buttons to a ButtonGroup
        ButtonGroup group = new ButtonGroup();
        group.add(birdButton);
        group.add(catButton);
        group.add(dogButton);
        group.add(rabbitButton);
        group.add(pigButton);

        // Add action listeners for each radio button
        birdButton.addActionListener(e -> imageLabel.setIcon(birdIcon));
        catButton.addActionListener(e -> imageLabel.setIcon(catIcon));
        dogButton.addActionListener(e -> imageLabel.setIcon(dogIcon));
        rabbitButton.addActionListener(e -> imageLabel.setIcon(rabbitIcon));
        pigButton.addActionListener(e -> imageLabel.setIcon(pigIcon));

        // Add radio buttons to the JFrame
        add(birdButton);
        add(catButton);
        add(dogButton);
        add(rabbitButton);
        add(pigButton);

        // Label to display pet images
        imageLabel = new JLabel();
        add(imageLabel);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new RadioButtonDemo();
            }
        });
    }
}
