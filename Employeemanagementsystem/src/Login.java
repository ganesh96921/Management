import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;


public class Login extends JFrame implements ActionListener {

    JTextField tfusername,tfpassword;
    String username;
    JButton Login;
    Login(String username){
        this.username=username;

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel lblusername= new JLabel("username");
        lblusername.setBounds(40,20,100,30);
        add(lblusername);

         tfusername= new JTextField();
        tfusername.setBounds(150,20,150,30);
        add(tfusername);

        JLabel lblpassword= new JLabel("password");
        lblpassword.setBounds(40,70,100,30);
        add(lblpassword);

        tfpassword= new JTextField();
        tfpassword.setBounds(150,70,150,30);
        add(tfpassword);


         Login = new JButton("LOGIN");
        Login.setBounds(150, 140, 150, 30);
        Login.setBackground(Color.black);
        Login.setForeground(Color.WHITE);
        Login.addActionListener(this);
        add(Login);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 200, 200);
        add(image);

        setBounds(450,200,600,300);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){

        try {

            String username = tfusername.getText();
            String password = tfpassword.getText();

            Conn c = new Conn();
            String query = "select * from login where username='"+username+"' AND upassword ='"+password+"'";

            ResultSet rs = c.s.executeQuery(query);

            if (rs.next()){
                setVisible(false);
                new Home();

            }
            else {
                JOptionPane.showMessageDialog(null,"Incorect username and password");
                setVisible(false);
            }



        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new Login("");
    }

}