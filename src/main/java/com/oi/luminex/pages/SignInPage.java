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

public class SignInPage extends JPanel {

  Luminex parent;

  public SignInPage(Luminex jf) {
    parent = jf;
    setLayout(null);

    SideBarBasic sb = new SideBarBasic(jf);
    SignInPane sip = new SignInPane();

    add(sb);
    add(sip);
  }
}

class SignInPane extends JPanel {
  JLabel lb_un, lb_ps, lb_ln;
  JTextField tf_un;
  JPasswordField pf_ps;
  JButton signin;

  public SignInPane() {
    setLayout(null);
    setBackground(Cl.darkgray1);
    setBounds(300, 0, 980, 800);

    lb_ln = new JLabel("Login");
    lb_ln.setFont(new FontUIResource("Dialog", Font.ITALIC, 32));
    lb_ln.setForeground(Cl.cyan1);
    lb_ln.setBounds(450, 150, 200, 50);

    lb_un = new JLabel("Username");
    lb_un.setFont(new FontUIResource("Dialog", Font.PLAIN, 18));
    lb_un.setForeground(Cl.cyan1);
    lb_un.setBounds(300, 300, 200, 30);

    lb_ps = new JLabel("Password");
    lb_ps.setFont(new FontUIResource("Dialog", Font.PLAIN, 18));
    lb_ps.setForeground(Cl.cyan1);
    lb_ps.setBounds(300, 350, 200, 30);

    tf_un = new JTextField(50);
    tf_un.setBounds(430, 300, 300, 30);
    pf_ps = new JPasswordField(50);
    pf_ps.setBounds(430, 350, 300, 30);

    signin = new JButton("Sign In");
    signin.setBounds(450, 450, 100, 50);
    signin.setBackground(Cl.cyan1);
    signin.setForeground(Cl.darkgray1);
    signin.addActionListener(ae -> {
      handle_login(tf_un.getText(), new String(pf_ps.getPassword()));
    });

    add(lb_ln);
    add(lb_un);
    add(tf_un);
    add(lb_ps);
    add(pf_ps);
    add(signin);
  }

  // Todo: implement user varification
  boolean handle_login(String uname, String rawpass) {
    return true;
    
  }
}
