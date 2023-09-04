package com.oi.luminex.pages;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.oi.luminex.utils.Cl;


public class SideBarBasic extends JPanel {
  Image bgimg;
  JButton back;

  public SideBarBasic() {
    setLayout(null);
    setBackground(Cl.cyan1);
    setBounds(0, 0, 300, 800);


    back = new JButton(new ImageIcon(this.getClass().getResource("/res/images/icon/back_icon.png")));
    back.setContentAreaFilled(false);
    back.setBounds(0, 0, 50, 50);
    
    JLabel logo = new JLabel(new ImageIcon(this.getClass().getResource("/res/images/icon/icon_transparent_200x100.png")));

    logo.setBounds(50, 300, 200, 100);
    add(back);
    add(logo);
  }
}

