import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Conversor extends JFrame {
    private JPanel mainPanel;
    private JTextField tfEntrada;
    private JButton btnOK;
    private JLabel lblResult;

    public Conversor() {
        setContentPane(mainPanel);
        setTitle("Conversor");
        setSize(250, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double realDolar = 0.20;
                float valorDolar = Integer.parseInt(tfEntrada.getText());

                tfEntrada.setText(String.valueOf(valorDolar));
                valorDolar = (int) (valorDolar * 5.0682999);
                lblResult.setText(String.valueOf("R$"+valorDolar));
            }
        });
    }


    public static void main(String[] args) {
        Conversor minhaTela = new Conversor();
    }
}


