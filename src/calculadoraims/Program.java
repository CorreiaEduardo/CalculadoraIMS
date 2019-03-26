package calculadoraims;

import javax.swing.JOptionPane;

/**
 * @authors:
 * Eduardo Correia
 * Felipe Bastos
 * Felipe Neiva
 * Luiz Miguel Santana
 */
public class Program {

    public static void main(String[] args) {
        System.out.println("Iniciando calculadora...");
        String equacao = JOptionPane.showInputDialog(null, "Insira sua equação", "Calculadora", 0);
        String[] parts=equacao.split(" ");
        double num1 = Integer.parseInt(parts[0]);
        double num2 = Integer.parseInt(parts[2]);
        if (equacao.contains("+")) {
            Somar soma = new Somar();
            JOptionPane.showMessageDialog(null, "Resultado:\n"+soma.somar(num1, num2)); 
        }else if(equacao.contains("-")){
            //Lógica para a subtração
            
        }else if(equacao.contains("*")){
            //Lógica para a multiplicação
            
        }else if(equacao.contains("/")){
            //Lógica para a divisão
            
        }else if(equacao.contains("^")){
            Expo expo = new Expo();
            JOptionPane.showMessageDialog(null, "Resultado:\n"+expo.expo(num1, num2));
        }
    }
}
