/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.recursividad;

import java.util.Scanner;

/**
 *
 * @author Roberto
 */
public class Recursividad {
    /*
    public static int sumaRecursiva(int n){
        int suma = 0;
        if(n==1){
            return 1;
        }else{
            suma = n + sumaRecursiva(n-1);
        }
        return suma;
    }
    */
    /*
    public static String invertirPalabra(String palabra) {
        if(palabra.length()<=1){
            return palabra;
        }else{
            return palabra.charAt(palabra.length()-1)+(invertirPalabra(palabra.substring(0,palabra.length()-1)));
        }
    }
    */
    public static void numeroBinario(int numero) {
        if(numero<2){
            System.out.print(numero);
            return;
        }else{
            numeroBinario(numero/2);
            System.out.print(numero%2);
        }
    }
    public static int potenciaRecursiva(int a, int n){
        if(n==0){
            return 1;
        }else{
            return a*potenciaRecursiva(a, n-1);
        }
    }
    public static int sumaVector(int v[],int longitud) {
        if(longitud==0){
            return v[longitud];
        }else{
            return sumaVector(v, longitud-1)+v[longitud-1];
        }
    }
    static boolean numeroPrimo(int n, int a) {
        if(a == 1){
            return true;
        }else{
            if(n%a == 0){
                return false;
            }else{
                return numeroPrimo(n, a-1);
            }
        }
    }
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        /*
        //Suma Recursiva
        int numero;
        System.out.println("Ingrese un numero: ");
        numero = scan.nextInt();
        System.out.println("La suma es: "+sumaRecursiva(numero));
        */
        /*
        //Invertir una palabra
        String oracion;
        System.out.println("Ingrese una palabra: ");
        oracion = scan.nextLine();
        System.out.println("La palabra al reves es: " +invertirPalabra(oracion));
        */
        /*
        //De decimal a binario
        int numero;
        System.out.println("Ingrese un numero: ");
        numero = scan.nextInt();
        System.out.println("El numero binario es: ");
        numeroBinario(numero);
        */
        /*
        //Calcular numero1 elevado a numero2
        int numero, potencia;
        System.out.println("Ingrese un numero: ");
        numero = scan.nextInt();
        System.out.println("Ingrese la potencia: ");
        potencia = scan.nextInt();
        System.out.println("La potencia del numero es: "+potenciaRecursiva(numero,potencia));
        */
        /*
        //Suma recursiva de un vector
        int vector[]={1,2,3,4};
        System.out.println("La suma de los elementos del vector es: "+sumaVector(vector,vector.length));
        */
        //Identificar si un numero es primo
        int numero;
        System.out.println("Ingrese un numero: ");
        numero = scan.nextInt();
        System.out.println("¿El numero es primo? "+numeroPrimo(numero,numero-1));
    }
}
