import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Digite os valores separados por vírgula:");
        String[] valores = entrada.split(",");
        String resultado = inverterValores(valores);
        JOptionPane.showMessageDialog(null, resultado);
    }

    public static String inverterValores(String[] valores) {
        StringBuilder resultado = new StringBuilder();
        for (int i = valores.length - 1; i >= 0; i--) {
            resultado.append(valores[i]);
            if (i != 0) {
                resultado.append(",");
            }
        }
        return resultado.toString();
    }
}