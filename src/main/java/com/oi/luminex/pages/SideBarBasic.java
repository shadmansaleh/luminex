package com.oi.luminex.pages;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.oi.luminex.Luminex;
import com.oi.luminex.utils.Cl;


public class SideBarBasic extends JPanel {
  Image bgimg;
  JButton back;
  Luminex app;

  public SideBarBasic(Luminex jf) {
    app = jf;
    setLayout(null);
    setBackground(Cl.cyan1);
    setBounds(0, 0, 300, 800);


    back = new JButton(new ImageIcon(this.getClass().getResource("/images/icon/back_icon.png")));
    back.setBorder(null);
    back.setContentAreaFilled(false);
    back.setBounds(0, 0, 50, 50);
    back.addActionListener(ae -> {
      JPanel wp = new WelcomePage(app);
      app.load_page(wp);
    });

    JLabel logo = new JLabel(new ImageIcon(this.getClass().getResource("/images/icon/icon_transparent_200x100.png")));
    bgimg = new ImageIcon(this.getClass().getResource("/images/background/astronaut.jpg")).getImage();

    logo.setBounds(50, 50, 200, 100);
    add(back);
    add(logo);
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(bgimg, 0, 0,  null);
  }
}

