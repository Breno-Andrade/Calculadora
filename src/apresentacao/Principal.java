package apresentacao;

import dominio.Calculadora;

public class Principal {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double num1, num2;
        num1 = 3;
        num2 = 8;

        System.out.print("Soma: "+num1+" + "+num2+" = ");
        System.out.println(calculadora.somar(num1, num2));

        System.out.print("Subtração: "+num1+" - "+num2+" = ");
        System.out.println(calculadora.subtrair(num1, num2));

        System.out.print("Divisão: "+num1+" % "+num2+" = ");
        System.out.println(calculadora.dividir(num1, num2));

        System.out.print("Multiplicação: "+num1+" - "+num2+" = ");
        System.out.println(calculadora.multiplicar(num1, num2));
    }
}
