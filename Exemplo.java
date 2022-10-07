/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
public class Exemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // TODO code application logic here
        //TODO Auto-generated method stub
            Scanner sc = new Scanner(System.in)) {
            double media,nota1,nota2;
            System.out.println("Digite a nota 1:");
            nota1 = Double.parseDouble(sc.nextLine());
            System.out.println("Digite a nota 2:");
            nota2 = Double.parseDouble(sc.nextLine());
            media = (nota1+nota2)/2.0;
            System.out.println("A sua média é:"+media);
        }
    }
    
}
