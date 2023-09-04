package com.oi.luminex.pages;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.plaf.FontUIResource;

import com.oi.luminex.Luminex;
import com.oi.luminex.utils.Cl;
import com.oi.luminex.pages.SignUpPanel;

public class SignUpPage extends JPanel {

  Luminex parent;

  public SignUpPage(Luminex jf) {
    parent = jf;
    setLayout(null);

    SideBarBasic sb = new SideBarBasic(jf);
    SignUpPanel sign_up_panel = new SignUpPanel();
    sign_up_panel.setBounds(300,0, 980, 800);

    add(sb);
    add(sign_up_panel);
  }
}
//
// class SignUpPane extends JPanel {
//   JLabel lb_fname, lb_lname, lb_signup, lb_uname, lb_dob, lb_gender,
//          lb_toc, lb_pass, lb_confirmpass;
//   JTextField tf_fname, tf_lname, tf_uname;
//   JRadioButton rb_gender_male, rb_gender_female;
//   JCheckBox cb_toc;
//   JPasswordField pf_pass, pf_confirmpass;
//   JButton signin;
//
//   JLabel build_label(String text,int font_size,  int x, int y, int width, int height) {
//     JLabel lb = new JLabel(text);
//     lb.setFont(new FontUIResource("Dialog", Font.ITALIC, font_size));
//     lb.setForeground(Cl.cyan1);
//     lb.setBounds(x, y, width, height);
//     return lb;
//   }
//   
//   JTextField build_text_field(int len, int x, int y, int width, int height) {
//     JTextField tf = new JTextField(len);
//     tf.setBounds(x, y, width, height);
//     return tf;
//   }
//
//   public SignUpPane() {
//     setLayout(null);
//     setBackground(Cl.darkgray1);
//     setBounds(300, 0, 980, 800);
//
//     lb_signup = build_label("Create Account", 28, 400, 100, 250, 50);
//     lb_fname = build_label("First Name", 18, 200, 150, 50, 30);
//     lb_lname = build_label("Last Name", 18, 600, 150, 50, 30);
//     lb_uname = build_label("Username", 18, 400, 100, 250, 30);
//     lb_dob = build_label("Date of Birth", 18, 400, 100, 250, 30);
//     lb_gender = build_label("Sex", 18, 400, 100, 250, 30);
//
//     tf_fname = build_text_field(40, 400, 100, 250, 30);
//     tf_lname = build_text_field(40, 400, 100, 250, 30);
//     tf_uname = build_text_field(40, 400, 100, 250, 30);
//
//
//     signin = new JButton("Sign Up");
//     signin.setBounds(450, 1600, 100, 50);
//     signin.setBackground(Cl.cyan1);
//     signin.setForeground(Cl.darkgray1);
//     signin.addActionListener(ae -> {
//       // handle_signup(tf_un.getText(), new String(pf_ps.getPassword()));
//     });
//
//     add(lb_signup);
//     // add(lb_un);
//     // add(tf_un);
//     // add(lb_ps);
//     // add(pf_ps);
//     add(signin);
//   }
//
//   // Todo: implement user varification
//   boolean handle_signup(String uname, String rawpass) {
//     return true;
//     
//   }
// }
//
