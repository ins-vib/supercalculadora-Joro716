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
            
            int opcio = mostrarMenuConsola();

            if(opcio == 1){

                //crida per al mètode sumaPrimersNumeros
                System.out.println("Introdueix un nombre enter: ");
                int nombre = teclat.nextInt();
                System.out.println("Suma dels primers 5 números: " + sumaPrimersNumeros(nombre));
                
            }else  if(opcio == 2){

                //crida per al mètode calcularFactorial
                System.out.println("Introdueix un nombre enter: ");
                int nombre = teclat.nextInt();
                System.out.println("Factorial de " + nombre + ": " + calcularFactorial(nombre));
            }else if(opcio == 3){

                //crida per al mètode sumaQuadrats
                System.out.println("Introdueix un nombre enter:");
                int nombre = teclat.nextInt();
                System.out.println("Suma dels quadrats dels primers 3 números: " + sumaQuadrats(nombre));

            }else if(opcio == 4){

                //crida per al mètode calcularPotencia
                System.out.println("Introdueix una base enter:");
                int base = teclat.nextInt();
                System.out.println("Introdueix un exponent enter:");
                int exponent = teclat.nextInt();
                System.out.println("2 elevat a la potència 3: " + calcularPotencia(base, exponent));

            }else if(opcio == 5){

                // Crida per al mètode nombreDigits
                System.out.println("Introdueix un nombre enter: ");
                int nombre = teclat.nextInt();
                System.out.println("Nombre de dígits de " + nombre + ": " + nombreDigits(nombre));

            }else if(opcio == 0){
                System.out.println("Adéu!");
            }
            //int cara = MonedaCara(50);
            //int creu = 50 - cara;
            //System.out.println("50 monedes tirades");
            //System.out.println("Caras: " + cara);
            //System.out.println("Creus: " + creu);

            //Funció preu Entrada cinema

            //System.out.println("Es dia laborable (L) o de cap de setmana (C)?" );
            //char dia = teclat.next().charAt(0);
            //boolean dial = (dia == 'L' || dia == 'l');

            //System.out.println("Tens el Carnet Jove? S/N" );
            //char jove = teclat.next().charAt(0);
            //boolean Cjove = (jove == 'S' || jove == 's');

            //System.out.println("El preu de la entrada es: " + Cinema(5, Cjove, dial) + "€");

            // Exemples de crida per al mètode sumaPrimersNumeros
            //System.out.println("Suma dels primers 5 números: " + sumaPrimersNumeros(5));
            //System.out.println("Suma dels primers 10 números: " + sumaPrimersNumeros(10));
            //System.out.println("Suma dels primers 15 números: " + sumaPrimersNumeros(15));

            // Exemples de crida per al mètode calcularFactorial
            //System.out.println("Factorial de 5: " + calcularFactorial(5));
            //System.out.println("Factorial de 7: " + calcularFactorial(7));
            //System.out.println("Factorial de 10: " + calcularFactorial(10));

            // Exemples de crida per al mètode sumaQuadrats
            //System.out.println("Suma dels quadrats dels primers 3 números: " + sumaQuadrats(3));
            //System.out.println("Suma dels quadrats dels primers 5 números: " + sumaQuadrats(5));
            //System.out.println("Suma dels quadrats dels primers 7 números: " + sumaQuadrats(7));

            // Exemples de crida per al mètode calcularPotencia
            //System.out.println("2 elevat a la potència 3: " + calcularPotencia(2, 3));
            //System.out.println("5 elevat a la potència 4: " + calcularPotencia(5, 4));
            //System.out.println("3 elevat a la potència 5: " + calcularPotencia(3, 5));

        
        }
    }

    public static int mostrarMenuConsola(){
        try(Scanner teclat = new Scanner(System.in);){
            int opcio;
            System.out.println("1 - Suma dels primers n números");
            System.out.println("2 - Factorial d'un nombre");
            System.out.println("3 - Suma dels quadrats dels primers n números");
            System.out.println("4 - Potència d'un nombre");
            System.out.println("5 - Nombre de dígits d'un nombre");
            System.out.println("0 - Sortir");
            opcio = teclat.nextInt();
            return opcio;
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

    public static int calcularPotencia(int base, int exponent) {

        int b1 = exponent;
        int b2 = base;
        int b3 = base;
        int b4 = base;

        //Logica x^z = ((x+x+x+... x veces)+(x+x+x+... x veces)+(x+x+x+... x veces)... x veces)
        //i el (((x+x+... x veces) +... x veces) +... x veces) son z veces

        //Ejemplo 5^3 = ((5+5+5... 5 veces)+(5+5+5... 5 veces)+(5+5+5... 5 veces)... 5 veces)
        // ((5+5+5+5+5)+(5+5+5+5+5)+(5+5+5+5+5)+(5+5+5+5+5)+(5+5+5+5+5)) = 125
         
        //Bucle para (((x+x+... x veces) +... x veces) +... x veces) son z veces
        while (b1 > 1) {
            //Bucle para ((x+x+x+... x veces)+(x+x+x+... x veces)+(x+x+x+... x veces)... x veces)
            while (b4 > 1) { 
                b2 = b2 + b3;
                b4--;
            }
            b3 = b2;
            b4 = base;

            b1--;
        }

        return b2;
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
