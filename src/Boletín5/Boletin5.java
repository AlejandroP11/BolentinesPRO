/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin5;

import java.util.Scanner;

/**
 *
 * @author Alejandro Pereiro G
 */
public class Boletin5 {

    public static void main(String[] args) {
        Consumo objCon=new Consumo();
        objCon.setLitros(80);
        objCon.setpGas(1.57f);
        Consumo objCon2=new Consumo(1,2,3,4);
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de kilómetros recorridos");
        float km= sc.nextFloat();
        objCon2.setKms(km);
        System.out.println("Ingrese la cantidad de litros consumidos");
        float l= sc.nextFloat();
        objCon2.setLitros(l);
        System.out.println("Ingrese la velocidad media");
        float vM= sc.nextFloat();
        objCon2.setvMed(vM);
        System.out.println("Ingrese el precio de la gasolina");
        float pG= sc.nextFloat();
        objCon2.setpGas(pG);
        float cm=objCon2.consumoMedio();
        System.out.println("El consumo medio es: "+cm);
        objCon2.setLitros(54);
        System.out.println("La velocidad media es: "+objCon2.getvMed());
    }
    
}
