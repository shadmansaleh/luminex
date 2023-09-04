package com.oi.luminex.pages;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.plaf.FontUIResource;

import com.oi.luminex.Luminex;
import com.oi.luminex.utils.Cl;


public class WelcomePage extends JPanel {

  JButton signup, signin;
  Luminex app;
  Image icon, bgimage;

  public WelcomePage(Luminex jf) {
    app = jf;
    setLayout(null);

    setBackground(Cl.cyan1);

    signin = new JButton("Sign In");
    signup = new JButton("Sign Up");

    signin.setBounds(290, 500, 200, 100);
    signup.setBounds(790, 500, 200, 100);

    signin.setContentAreaFilled(false);
    signin.setForeground(Cl.orange1);
    signup.setContentAreaFilled(false);
    signup.setForeground(Cl.orange1);

    signin.setFont(new FontUIResource("Dialog", Font.PLAIN, 24));
    signup.setFont(new FontUIResource("Dialog", Font.PLAIN, 24));

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

    icon = new ImageIcon(this.getClass().getResource("/res/images/icon/icon_transparent.png")).getImage();
    bgimage = new ImageIcon(this.getClass().getResource("/res/images/background/solar-syste.jpg")).getImage();
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(bgimage, 0, 0, null);
    g.drawImage(icon, 500, 0, null);
  }
}
