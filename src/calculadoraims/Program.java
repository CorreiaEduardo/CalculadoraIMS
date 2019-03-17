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
        double num1;
        double num2;
        if (!equacao.contains("v")) {
            String[] parts=equacao.split(" ");
            num1 = Integer.parseInt(parts[0]);
            num2 = Integer.parseInt(parts[2]);
        }else{
            try{
                String[] parts=equacao.split("v ");
                num1 = Integer.parseInt(parts[1]);
            }
            catch(Exception ex){
                String[] parts=equacao.split("v");
                num1 = Integer.parseInt(parts[1]);
            }
        }
        if (equacao.contains("+")) {
            //Lógica para a soma
            
        }else if(equacao.contains("-")){
            //Lógica para a subtração
            
        }else if(equacao.contains("*")){
            //Lógica para a multiplicação
            
        }else if(equacao.contains("/")){
            //Lógica para a divisão
            
        }else if(equacao.contains("v")){
            JOptionPane.showMessageDialog(null, "O resultado da raiz quadrada é "+new Operacao().squareroot(num1));
        }
        
    }
}
