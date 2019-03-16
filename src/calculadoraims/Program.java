package calculadoraims;

import javax.swing.JOptionPane;

/**
 *
 * @authors:
 * Eduardo Correia
 * Felipe Bastos
 * Felipe Neiva
 * Luiz Miguel Santana
 */
public class Program {

    public static void main(String[] args) {
        System.out.println("Iniciando calculadora...");
        Object[] operacoes = {"Soma","Subtração","Multiplicação","Divisão"};
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro número."));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo número."));
        int operacaoEscolhida = JOptionPane.showOptionDialog(null, "EScolha a operação a ser realizada.", "Escolhendo operação...", 0, 2, null, operacoes, operacoes[0]);
        switch(operacaoEscolhida){
            case 0: // SOMA
                
                break;// FIM - SOMA
                
            case 1: // SUBTRAÇÃO
                
                break;// FIM - SUBTRAÇÃO
                
            case 2: // MULTIPLICAÇÃO
                
                break;// FIM - MULTIPLICAÇÃO
                
            case 3: // DIVISÃO
                
                break;// FIM - DIVISÃO
        }
    }
    
}
