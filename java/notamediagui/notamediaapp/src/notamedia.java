import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class notamedia extends JFrame {
    private JPanel mainPanel;
    private JTextField tfFirstNum;
    private JTextField tfSecondNum;
    private JButton btnOK;
    private JLabel lblMedia;
    private JLabel lblResult;

    public notamedia() {
        setContentPane(mainPanel);
        setTitle("CALCULANDO SUA NOTA ESCOLAR");
        setSize(300, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(Color.black);
        setVisible(true);

        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1 = Float.parseFloat(tfFirstNum.getText());
                float num2 = Float.parseFloat(tfSecondNum.getText());
                float result = (num1 + num2) / 2;
                lblMedia.setText(String.valueOf(result));

                if (result >= 6) {
                    lblResult.setText("Aprovado");
                } else {
                    lblResult.setText("Reprovado");
                }
                }
            });
        }

        public static void main (String[]args){
            notamedia minhaTela = new notamedia();
        }
    }
