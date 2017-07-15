package org.golde.java.rmwfcsvmg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.nio.file.Paths;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import org.golde.java.rmwfcsvmg.windows.PanelMain;


public class Main {

	public static File FILE_MAIN = new File(Paths.get(".").toAbsolutePath().normalize().toString());
	public static File FILE_CODE = new File(FILE_MAIN, "code");
	public static File FILE_DATA = new File(FILE_MAIN, "data");
	public static File FILE_DATA_TEMP = new File(FILE_DATA, "temp");
	public static File FILE_DATA_MAPPINGS = new File(FILE_DATA, "mappings");
	public static File FILE_DATA_MAPPINGS_STABLE = new File(FILE_DATA_MAPPINGS, "stable");
	public static File FILE_DATA_MAPPINGS_SNAPSHOT = new File(FILE_DATA_MAPPINGS, "snapshot");
	
	public static void main(String[] args) {
		
		//Folder stuff
		FILE_CODE.mkdir();
		
		
		FILE_DATA.mkdir();
		FILE_DATA_TEMP.mkdir();
		FILE_DATA_MAPPINGS.mkdir();
		FILE_DATA_MAPPINGS_STABLE.mkdir();
		FILE_DATA_MAPPINGS_SNAPSHOT.mkdir();
		
		//JFrame GUI Stuff
		JFrame frame = new JFrame("Mod CSV Replacer v1.0");
		JMenuBar menubar = new JMenuBar();

        JMenu menu1 = new JMenu("Program");
        
        
        JMenuItem menuItemAbout = new JMenuItem("About");
        menuItemAbout.setToolTipText("About application");
        menuItemAbout.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
        	
        });
        menu1.add(menuItemAbout);
        
        JMenuItem menuItemOptions = new JMenuItem("Options");
        menuItemOptions.setToolTipText("Application properties");
        menuItemOptions.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
        	
        });
        menu1.add(menuItemOptions);
        
        JMenuItem menuItemExit = new JMenuItem("Exit");
        menuItemExit.setToolTipText("Exit application");
        menuItemExit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
        	
        });
        menu1.add(menuItemExit);
        
        menubar.add(menu1);
        
        frame.add(new PanelMain());
        frame.setJMenuBar(menubar);
		frame.setSize(400, 300);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		
	}
	
}
