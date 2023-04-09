import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class conversor extends JFrame {
    private JButton btnOK;
    private JButton btnExit;
    private JTextField tfValor;
    private JLabel lblReal;
    private JPanel mainPanel;

    public conversor() {
        setContentPane(mainPanel);
        setTitle("Conversor Dolar");
        setSize(300, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valorEmDolares = Double.parseDouble(tfValor.getText());
                double taxaDeCambio = 5.0683; // Cotação do dia 09/04/2023
                double valorEmReais = taxaDeCambio * valorEmDolares;
                DecimalFormat df = new DecimalFormat("#.##");
                String valorEmReaisFormatado = df.format(valorEmReais);

                lblReal.setText(String.valueOf("R$ " + valorEmReaisFormatado));


            }
        });
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Container frame = btnExit.getParent();
                do frame = frame.getParent(); while (!(frame instanceof JFrame));
                ((JFrame) frame).dispose();
            }
        });
    }

    public static void main(String[] args) {
        conversor conversorReal = new conversor();
    }
}
