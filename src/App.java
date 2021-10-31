import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

    double total;

    String dolarS =JOptionPane.showInputDialog(null, "Qual o valor atual do dolar: ");
    double dolar = Double.parseDouble(dolarS);
    String dinheiro = JOptionPane.showInputDialog(null, "Digite quanto de dolares você possui: ");
    double dinheiro1 = Double.parseDouble(dinheiro);
    total = dinheiro1 * dolar;
    JOptionPane.showMessageDialog(null, "Seu valor em reais é de: " + total, "Valor convertido", JOptionPane.INFORMATION_MESSAGE);






    }
}
