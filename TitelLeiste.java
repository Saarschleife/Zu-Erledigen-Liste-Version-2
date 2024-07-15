package zuErledigenListeV2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class TitelLeiste extends JPanel{

	Border rahmenAußen = BorderFactory.createLoweredSoftBevelBorder();

	//Konstruktor
	public TitelLeiste(){

		setPreferredSize(new Dimension(400, 50));
		setBackground(Color.ORANGE);
		setBorder(rahmenAußen);

		JLabel titelText = new JLabel("Zu Erledigen");
		titelText.setPreferredSize(new Dimension(200, 50));
		titelText.setFont(new Font("Times New Roman", Font.BOLD, 25));
		titelText.setHorizontalAlignment(JLabel.CENTER);

		add(titelText);
	}
}
