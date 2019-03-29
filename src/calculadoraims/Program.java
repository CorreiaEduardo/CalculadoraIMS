package calculadoraims;

import javax.swing.JOptionPane;

/**
 * @authors:
 * Eduardo Correia
 * Felipe Bastos
 * Felipe Neiva
 */
public class Program {

    public static void main(String[] args) {
        System.out.println("Iniciando calculadora...");
        String equacao = JOptionPane.showInputDialog(null, "Insira sua equação", "Calculadora", 3);
        String[] parts=equacao.split(" ");
        double num1 = Integer.parseInt(parts[0]);
        double num2 = Integer.parseInt(parts[2]);
        if (equacao.contains("+")) {
            JOptionPane.showMessageDialog(null, "O resultado da soma é "+ new Somar().somar(num1, num2));
            
        }else if(equacao.contains("-")){
            JOptionPane.showMessageDialog(null, "O resultado da subtração é "+ new Sub().sub(num1, num2));
            
        }else if(equacao.contains("*")){
            JOptionPane.showMessageDialog(null, "O resultado da multiplicação é "+ new Multiplicar().multiplicar(num1, num2));
            
        }else if(equacao.contains("/")){
           JOptionPane.showMessageDialog(null, "O resultado da divisão é "+ new Divisao().dividir(num1, num2));
        }
    }
}