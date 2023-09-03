package com.oi.luminex.pages;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import com.oi.luminex.Luminex;

public class SignUpPage extends JPanel implements ActionListener {

  JButton signup, signin;
  Luminex parent;
  Image bgimg;

  public SignUpPage(Luminex jf) {
    parent = jf;
    setLayout(null);

    Color cyan1 = new Color(0x0097b2);
    Color cyan2 = new Color(0x7ac9d6);

    setBackground(cyan1);

    signin = new JButton("Sign In");
    // signup = new JButton("Sign Up");

    signin.setBounds(290, 500, 200, 100);
    // signup.setBounds(790, 500, 200, 100);
    //
    signin.setContentAreaFilled(false);
    signin.setForeground(cyan2);
    // signup.setContentAreaFilled(false);
    // signup.setForeground(cyan2);

    add(signin);
    // add(signup);

    bgimg = new ImageIcon("res/images/icon/icon_500x312.jpeg").getImage();
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(bgimg, 400, 0, null);
  }

  @Override
  public void actionPerformed(ActionEvent ae) {
  }
  
}

