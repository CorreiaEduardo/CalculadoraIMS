package calculadoraims;

/**
 * @authors:
 * Eduardo Correia
 * Felipe Bastos
 * Felipe Neiva
 * Luiz Miguel Santana
 */
public class Operacao {
    public double multiplicar(double x, double y){
        double result=x*y;
        return result;
    }
    
    public double porcentagem(double x, double y){
        double result=(x/100)*y;
        return result;
    }
}
