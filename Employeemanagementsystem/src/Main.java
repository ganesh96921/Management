import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
String username;
    public Main(String username) {
        this.username=username;
        getContentPane().setBackground(Color.BLACK);
        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(130, 30, 1050, 60);
        heading.setFont(new Font("serif", Font.PLAIN, 50));
        heading.setForeground(Color.RED);
        add(heading);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50, 100, 1000, 500);
        add(image);

        JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
        clickhere.setBounds(400, 400, 250, 60);
        clickhere.setBackground(Color.black);
        clickhere.setForeground(Color.WHITE);
        clickhere.addActionListener(this);
        image.add(clickhere);


        setBounds(200, 50, 1200, 600);
        setLayout(null);


        setVisible(true);

        while (true) {
            heading.setVisible(false);
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }

            heading.setVisible(true);
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }

        }
    }


    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login(username);

    }
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        new Main("");
    }
}