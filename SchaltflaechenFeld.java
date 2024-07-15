package zuErledigenListeV2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class SchaltflaechenFeld extends JPanel{

	private JButton neueAufgabe;
	private JButton listeLoeschen;

	Border rahmenAußen = BorderFactory.createLoweredSoftBevelBorder();
	Border rahmenSchaltFl = BorderFactory.createRaisedBevelBorder();


	//Konstruktor
	public SchaltflaechenFeld () {

		setPreferredSize(new Dimension (400, 50));
		setBackground(Color.ORANGE);
		setVisible(true);
		setBorder(rahmenAußen);

		neueAufgabe = new JButton("neue Aufgabe");
		neueAufgabe.setFont(new Font("Times New Roman", Font.BOLD, 15));
		neueAufgabe.setBorder(rahmenSchaltFl);

		listeLoeschen = new JButton("Liste löschen");
		listeLoeschen.setFont(new Font("Times New Roman", Font.BOLD, 15));
		listeLoeschen.setBorder(rahmenSchaltFl);

		add(neueAufgabe);
		add(Box.createHorizontalStrut(20));//horizontaler Abstand
		add(listeLoeschen);
	}

	//Methode gibt Schaltfläche zurück
	public JButton getNeueAufgabe() {
		return neueAufgabe;
	}

	//Methode gibt Schaltfläche zurück	
	public JButton getListeLoeschen() {
		return listeLoeschen;
	}
}
