/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.oi.luminex;

import javax.swing.*;
import java.awt.event.*;
import com.oi.luminex.pages.*;

/**
 *
 * @author shadman saleh
 * @author raihanul hasan
 */
public class Luminex extends JFrame {

  int WINWIDTH = 1280, WINHEIGHT = 800;
  JPanel cur_page = null;

  public static void main(String[] args) {
    Luminex lm = new Luminex();
  }

  public Luminex() {
    setSize(WINWIDTH, WINHEIGHT);
    setLayout(null);
    setResizable(false);
    setTitle("Luminex");
    ImageIcon icon = new ImageIcon("res/images/icon/icon.jpeg");
    setIconImage(icon.getImage());
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
  }

  public void load_page(JPanel jp) {
    if (cur_page != null) remove(cur_page);
    jp.setBounds(0, 0, WINWIDTH, WINHEIGHT);
    add(jp);
    cur_page = jp;
  }
}
