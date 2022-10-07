/* PR1 - Aula 1.3 - Exercício 2*/
package massacorporal;

import java.util.Scanner;

public class Massacorporal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso, alt, imc;
        System.out.print("Digite o peso:");
        peso = Double.parseDouble(sc.nextLine());
        System.out.print("Digite a Altura:");
        alt = Double.parseDouble(sc.nextLine());
        imc = peso / (alt * alt);
        System.out.println("IMC:" + imc);
    }

}
