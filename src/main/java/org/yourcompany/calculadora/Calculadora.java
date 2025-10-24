package org.yourcompany.calculadora;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Joel
 */


public class Calculadora {

    public static void main(String[] args) {
        
        try(Scanner teclat = new Scanner(System.in)){

            // Exemples de crida per al mètode nombreDigits
            System.out.println("Nombre de dígits de 1234: " + nombreDigits(1234));
            System.out.println("Nombre de dígits de 56789: " + nombreDigits(56789));
            System.out.println("Nombre de dígits de -101010: " + nombreDigits(-101010));
            System.out.println("Nombre de dígits de 0: " + nombreDigits(0));

            //Moneda caracreu
            int cara = MonedaCara(50);
            int creu = 50 - cara;
            System.out.println("50 monedes tirades");
            System.out.println("Caras: " + cara);
            System.out.println("Creus: " + creu);

            //Funció preu Entrada cinema

            System.out.println("Es dia laborable (L) o de cap de setmana (C)?" );
            char dia = teclat.next().charAt(0);
            boolean dial = (dia == 'L' || dia == 'l');

            System.out.println("Tens el Carnet Jove? S/N" );
            char jove = teclat.next().charAt(0);
            boolean Cjove = (jove == 'S' || jove == 's');

            System.out.println("El preu de la entrada es: " + Cinema(5, Cjove, dial) + "€");

            // Exemples de crida per al mètode sumaPrimersNumeros
            System.out.println("Suma dels primers 5 números: " + sumaPrimersNumeros(5));
            System.out.println("Suma dels primers 10 números: " + sumaPrimersNumeros(10));
            System.out.println("Suma dels primers 15 números: " + sumaPrimersNumeros(15));

            // Exemples de crida per al mètode calcularFactorial
            System.out.println("Factorial de 5: " + calcularFactorial(5));
            System.out.println("Factorial de 7: " + calcularFactorial(7));
            System.out.println("Factorial de 10: " + calcularFactorial(10));

            // Exemples de crida per al mètode sumaQuadrats
            System.out.println("Suma dels quadrats dels primers 3 números: " + sumaQuadrats(3));
            System.out.println("Suma dels quadrats dels primers 5 números: " + sumaQuadrats(5));
            System.out.println("Suma dels quadrats dels primers 7 números: " + sumaQuadrats(7));

            // Exemples de crida per al mètode calcularPotencia
            // System.out.println("2 elevat a la potència 3: " + calcularPotencia(2, 3));
            // System.out.println("5 elevat a la potència 4: " + calcularPotencia(5, 4));
            // System.out.println("3 elevat a la potència 5: " + calcularPotencia(3, 5));

        
        }
    }

    public static int MonedaCara(int rep) {
        Random Aleatori = new Random();
        
        //Variables
        int contadorcara = 0;
        //int contadorcruz = 0;
        
        //Bucle
        int i = 0;
        
        while(i < rep){
            //Tirar moneda
            int caracruz = Aleatori.nextInt(0,2);
           //Contar si cara o cruz
            if(caracruz == 0){
                contadorcara++;
            }//else if(caracruz == 1){
                //contadorcruz++; 
            //}
            i++;
        }
        
        //Resultat
        //System.out.println("Cruz: " + contadorcruz + " i Cara: " + contadorcara);
        return contadorcara;
    }



    public static double Cinema(int preu, boolean jove, boolean dia) {
        //Scanner teclat = new Scanner(System.in);
        //Variables

        //Preu
        //double preu = 5;
        double descap = 0;
        double desjove = 0;
        double desfinal;
        double preufinal;
        
        //Saber si Es dia laborable (L) o de cap de setmana (C)
        
        //System.out.println("Es dia laborable (L) o de cap de setmana (C)?");
        //char dia = teclat.next().charAt(0);
        
        //if (dia == 'L' || dia == 'l' || dia == 'C' || dia == 'c'){
            
            //Logica desconte cap de semana
            if (dia == false){
                descap = 0;
            }else if (dia == true){
                descap = 0.1;
            }//else if (dia != 'C' || dia != 'c' || dia != 'L' || dia != 'l'){
                //System.out.println("Resposta no valida introdueix (C/L)");
            //}
            
            //Saber si tens carnet jove

            //System.out.println("Tens el Carnet Jove? S/N");
            //char jove = teclat.next().charAt(0);
            
            //if (jove == 'S' || jove == 's' || jove == 'N' || jove == 'n'){
                
                //Logica desconte jove
                if (jove == true){
                    desjove = 0.15;
                }else if (jove == false){
                    desjove = 0;
                }//else if (dia != 'S' || dia != 's' || dia != 'N' || dia != 'n'){
                    //System.out.println("Resposta no valida introdueix (S/N)");
                //}

                //Logica Preu Final
                desfinal = desjove + descap;
                preufinal = preu - desfinal * preu;

                //Resultat

                return preufinal;
                
                //System.out.println("El preu de la entrada es: " + preufinal + "€");

            //}else{

        
    }

    public static int sumaPrimersNumeros(int n) {
        int suma = 0;
        while (n != 0) {
            suma = suma + n;
            n--;
        }
        return suma;
    }


    public static int calcularFactorial(int n) {
        int fact = 1;
        while (n != 0) {
            fact = fact * n;
            n--;
        }
        return fact;
    }

    public static int sumaQuadrats(int n) {
        int quat = 0;
        while (n != 0) {
            quat = quat + (n * n);
            n--;
        }
        return quat;
    }
    /**
     * Calcula el nombre de dígits d’un número enter.
     * Funciona tant per a nombres positius com negatius.
     * Si el nombre és 0, retorna 1.
     *
     * @param nombre Número del qual es vol saber el nombre de dígits
     * @return Quantitat de dígits que té {@code nombre}
     */
    public static int nombreDigits(int nombre) {
        if (nombre == 0) {
            return 1; // el 0 té un dígit
        }        
        int comptador = 0;
        while (nombre != 0) {
            nombre /= 10;
            comptador++;
        }
        return comptador;
    }


}
