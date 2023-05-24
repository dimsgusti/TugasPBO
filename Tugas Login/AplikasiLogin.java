import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AplikasiLogin extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public AplikasiLogin() {
        setTitle("Aplikasi Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 300);
        setLayout(new GridLayout(10, 5));

        JLabel usernameLabel = new JLabel("Username :");
        JLabel passwordLabel = new JLabel("Password :");

        usernameField = new JTextField();
        passwordField = new JPasswordField();

        JButton loginButton = new JButton("Masuk");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (username.equals("user") && password.equals("password")) {
                    JOptionPane.showMessageDialog(AplikasiLogin.this, "Berhasil masuk!");
                } else {
                    JOptionPane.showMessageDialog(AplikasiLogin.this, "Username atau password salah! Silahkan coba lagi!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        add(new JLabel());
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(new JLabel());
        add(loginButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AplikasiLogin();
            }
        });
    }
}
