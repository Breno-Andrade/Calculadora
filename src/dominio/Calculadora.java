package dominio;

public class Calculadora {
    public double somar(double numero1, double numero2){
        return(numero1 + numero2);
    }

    public double subtrair(double numero1, double numero2){
        boolean numero2EMaiorQueNumero1 = (numero2 > numero1);
        if (numero2EMaiorQueNumero1){
            return (numero2 - numero1);
        }
        return(numero1 - numero2);
    }

    public double multiplicar(double numero, double multiplicador){
        boolean multiplicadorNaoEValido = (multiplicador <= 0);
        if (multiplicadorNaoEValido){
            throw new IllegalArgumentException("O MULTIPLICADOR DEVE SER UM NUMERO POSITIVO!!");
        }
        return(numero * multiplicador);
    }

    public double dividir(double numero, double divisor){
        boolean divisorNaoEValido = (divisor <= 0);
        if (divisorNaoEValido) {
            throw new IllegalArgumentException("O DIVISOR DEVE SER UM NUMERO POSITIVO!!");
        }
        return (numero / divisor );
    }
}
