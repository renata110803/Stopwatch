
/* Renata Gabdrakhmanova 
	 * Pd 2 
	 * 3/17/21
	 * Stopwatch- creates the plane with buttons and using them shows the time in seconds
	 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.*;

public class GabdrakhmanovaRenata_Stopwatch extends JFrame implements ActionListener {
	private JButton start;
	private JButton stop;
	private JLabel display;

	public GabdrakhmanovaRenata_Stopwatch() {
		// sets base of the plane
		setTitle("Stopwatch");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(230, 120);

		// Initializes buttons and label
		start = new JButton("Start");
		stop = new JButton("Stop");
		display = new JLabel("Press Start to begin timing.");

		// register event handling with the buttons and this program
		start.addActionListener(this);
		stop.addActionListener(this);
		stop.setEnabled(false);

		// adds everything to the plane
		setLayout(new FlowLayout());
		add(start);
		add(stop);
		add(display);

		setVisible(true);

	}

	public void actionPerformed(ActionEvent ae) {

//if start is pressed disable start button and enable stop button
		if (ae.getActionCommand().equals("Start")) {
			display.setText("Timer is running");
			start.setEnabled(false);
			stop.setEnabled(true);

		}

		// if stop button was pressed display seconds
		else if (ae.getActionCommand().equals("Stop")) {
			start.setEnabled(true);
			stop.setEnabled(false);
			int sec = LocalDateTime.now().getSecond();
			display.setText("Time is: " + sec);

		}
	}

	public static void main(String[] args) {
		GabdrakhmanovaRenata_Stopwatch stopwatch = new GabdrakhmanovaRenata_Stopwatch();
	}
}
