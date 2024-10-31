import java.awt.*;
import java.awt.event.*;

public class action {
    public static void main(String[] args) {
        // Create a new Frame
        Frame frame = new Frame("Action Event Example");

        // Create a new Button
        Button button = new Button("Click Me");

        // Set the layout manager for the frame
        frame.setLayout(new FlowLayout());

        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle the button click event
                System.out.println("Button was clicked!");

                // Get the modifiers
                int modifiers = e.getModifiers();

                // Display the modifiers
                if ((modifiers & ActionEvent.SHIFT_MASK) != 0) {
                    System.out.println("Shift key is pressed.");
                }
                if ((modifiers & ActionEvent.CTRL_MASK) != 0) {
                    System.out.println("Control key is pressed.");
                }
                if ((modifiers & ActionEvent.ALT_MASK) != 0) {
                    System.out.println("Alt key is pressed.");
                }
            }
        });

        // Add the button to the frame
        frame.add(button);

        // Set the size of the frame
        frame.setSize(300, 200);

        // Add a window listener to handle window closing
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        // Set the frame's visibility to true
        frame.setVisible(true);
    }
}