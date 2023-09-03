/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.oi.luminex;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.oi.luminex.pages.SignInPage;
import com.oi.luminex.pages.WelcomePage;

/**
 *
 * @author shadman saleh
 * @author raihanul hasan
 */
public class Luminex extends JFrame {

  int WINWIDTH = 1280, WINHEIGHT = 800;
  JPanel cur_page = null;

  public static void main(String[] args) {
    Luminex app = new Luminex();
    JPanel wp = new WelcomePage(app);
    app.load_page(wp);
  }

  public Luminex() {
    try {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
        | UnsupportedLookAndFeelException ex) {
      ex.printStackTrace();
    }

    setSize(WINWIDTH, WINHEIGHT);
    setLayout(null);
    setResizable(false);
    setTitle("Luminex");
    ImageIcon icon = new ImageIcon(this.getClass().getResource("/res/images/icon/icon.jpeg"));
    setIconImage(icon.getImage());
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
  }

  public void load_page(JPanel jp) {
    if (cur_page != null) remove(cur_page);
    jp.setBounds(0, 0, WINWIDTH, WINHEIGHT);
    add(jp);
    cur_page = jp;
    revalidate();
    repaint();
  }
}
