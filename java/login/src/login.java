import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame {
    private JPanel mainPanel;
    private JTextField tfName;
    private JPasswordField passwordInput;
    private JButton btnOK;

    public login() {
        setContentPane(mainPanel);
        setTitle("Login Validate");
        setSize(350, 500);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Username = tfName.getText();
                String Password1 = passwordInput.getText();

                if (Username.equals("lohan") && Password1.equals("123"))
                    JOptionPane.showMessageDialog(null, "Login Successful");
                else
                    JOptionPane.showMessageDialog(null, "Username or Password invalid");
            }

        });
    }

    ;

    public static void main(String[] args) {
        login meuLogin = new login();
    }
}
