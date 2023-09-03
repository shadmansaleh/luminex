package com.oi.luminex.pages;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import com.oi.luminex.Luminex;


public class WelcomePage extends JPanel {

  JButton signup, signin;
  Luminex app;
  Image bgimg;

  public WelcomePage(Luminex jf) {
    app = jf;
    setLayout(null);

    Color cyan1 = new Color(0x0097b2);
    Color cyan2 = new Color(0x7ac9d6);

    setBackground(cyan1);

    signin = new JButton("Sign In");
    signup = new JButton("Sign Up");

    signin.setBounds(290, 500, 200, 100);
    signup.setBounds(790, 500, 200, 100);

    signin.setContentAreaFilled(false);
    signin.setForeground(cyan2);
    signup.setContentAreaFilled(false);
    signup.setForeground(cyan2);

    signin.addActionListener(ae -> {
      JPanel sp = new SignInPage(app);
      app.load_page(sp);
    });
    signup.addActionListener(ae -> {
      JPanel sp = new SignUpPage(app);
      app.load_page(sp);
    });

    add(signin);
    add(signup);

    bgimg = new ImageIcon("res/images/icon/icon_500x312.jpeg").getImage();
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(bgimg, 400, 0, null);
  }
}
