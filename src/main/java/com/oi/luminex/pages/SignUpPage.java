package com.oi.luminex.pages;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.plaf.FontUIResource;

import com.oi.luminex.Luminex;
import com.oi.luminex.utils.Cl;

public class SignUpPage extends JPanel {

  Luminex parent;

  public SignUpPage(Luminex jf) {
    parent = jf;
    setLayout(null);

    SideBarBasic sb = new SideBarBasic();
    SignUpPane sip = new SignUpPane();

    add(sb);
    add(sip);
  }
}

class SignUpPane extends JPanel {
  JLabel lb_un, lb_ps, lb_ln;
  JTextField tf_un;
  JPasswordField pf_ps;
  JButton signin;

  public SignUpPane() {
    setLayout(null);
    setBackground(Cl.darkgray1);
    setBounds(300, 0, 980, 800);

    lb_ln = new JLabel("Create Account");
    lb_ln.setFont(new FontUIResource("Dialog", Font.ITALIC, 28));
    lb_ln.setForeground(Cl.cyan1);
    lb_ln.setBounds(400, 100, 250, 50);
    //
    // lb_un = new JLabel("Username");
    // lb_un.setFont(new FontUIResource("Dialog", Font.PLAIN, 18));
    // lb_un.setForeground(Cl.cyan1);
    // lb_un.setBounds(300, 300, 200, 30);
    //
    // lb_ps = new JLabel("Password");
    // lb_ps.setFont(new FontUIResource("Dialog", Font.PLAIN, 18));
    // lb_ps.setForeground(Cl.cyan1);
    // lb_ps.setBounds(300, 350, 200, 30);
    //
    // tf_un = new JTextField(50);
    // tf_un.setBounds(430, 300, 300, 30);
    // pf_ps = new JPasswordField(50);
    // pf_ps.setBounds(430, 350, 300, 30);

    signin = new JButton("Sign Up");
    signin.setBounds(450, 600, 100, 50);
    signin.setBackground(Cl.cyan1);
    signin.setForeground(Cl.darkgray1);
    signin.addActionListener(ae -> {
      // handle_signup(tf_un.getText(), new String(pf_ps.getPassword()));
    });

    add(lb_ln);
    // add(lb_un);
    // add(tf_un);
    // add(lb_ps);
    // add(pf_ps);
    add(signin);
  }

  // Todo: implement user varification
  boolean handle_signup(String uname, String rawpass) {
    return true;
    
  }
}

