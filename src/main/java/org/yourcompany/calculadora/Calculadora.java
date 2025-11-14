package org.yourcompany.calculadora;

//import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Joel
 */


public class Calculadora {
    /**
     * Punt d'entrada principal de l'aplicació "Supercalculadora".
     * <p>
     * Aquest mètode imprimeix un títol de benvinguda a la consola
     * i després crida a {@code mostrarMenuConsola()} per iniciar
     * el bucle interactiu amb l'usuari.
     *
     * @param args Arguments de la línia de comandes (no s'utilitzen).
     */
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Supercalculadora");
        System.out.println("");

        mostrarMenuConsola();
        
        //try(Scanner teclat = new Scanner(System.in)){
            
            


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

        
        //}
    }
    /**
     * Mostra un menú interactiu per consola per executar les diferents funcions
     * de càlcul (suma, factorial, potència, etc.).
     * <p>
     * L'usuari pot escollir una opció (1-5) per realitzar un càlcul o 0
     * per sortir del programa. El menú es repetirà fins que l'usuari
     * decideixi sortir.
     */
    public static void mostrarMenuConsola(){
        try(Scanner teclat = new Scanner(System.in)){
            int opcio;
            System.out.println("1 - Suma dels primers n números");
            System.out.println("2 - Factorial d'un nombre");
            System.out.println("3 - Suma dels quadrats dels primers n números");
            System.out.println("4 - Potència d'un nombre");
            System.out.println("5 - Nombre de dígits d'un nombre");
            System.out.println("0 - Sortir");
            System.out.println("");
            System.out.print("Escull una opció: ");
            opcio = teclat.nextInt();
            System.out.println("");

            while(opcio != 0){

                switch (opcio) {
                    case 1 -> {
                        //crida per al mètode sumaPrimersNumeros
                        System.out.print("Introdueix un nombre enter: ");
                        int nombre = teclat.nextInt();
                        System.out.println("Suma dels primers 5 números: " + sumaPrimersNumeros(nombre));
                    }
                    case 2 -> {
                        //crida per al mètode calcularFactorial
                        System.out.print("Introdueix un nombre enter: ");
                        int nombre = teclat.nextInt();
                        System.out.println("Factorial de " + nombre + ": " + calcularFactorial(nombre));
                    }
                    case 3 -> {
                        //crida per al mètode sumaQuadrats
                        System.out.print("Introdueix un nombre enter:");
                        int nombre = teclat.nextInt();
                        System.out.println("Suma dels quadrats dels primers 3 números: " + sumaQuadrats(nombre));
                    }
                    case 4 -> {
                        //crida per al mètode calcularPotencia
                        System.out.print("Introdueix una base enter:");
                        int base = teclat.nextInt();
                        System.out.print("Introdueix un exponent enter:");
                        int exponent = teclat.nextInt();
                        System.out.println(base +" elevat a la potència " + exponent + ": " + calcularPotencia(base, exponent));
                    }
                    case 5 -> {
                        // Crida per al mètode nombreDigits
                        System.out.print("Introdueix un nombre enter: ");
                        int nombre = teclat.nextInt();
                        System.out.println("Nombre de dígits de " + nombre + ": " + nombreDigits(nombre));
                    }
                    case 0 -> System.out.println("Adéu!");
                    default -> {
                        System.out.println("Opció no vàlida");
                    }
                }
                System.out.println("");
                System.out.print("Escull una opció: ");
                opcio = teclat.nextInt();
                System.out.println("");
            }

            if(opcio == 0){
                System.out.println("Adéu!");
            }
        }
    }
/*
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
        //}
        //return 0;
    }
 */
    /**
     * Calcula la suma dels primers 'n' nombres enters positius (suma gaussiana).
     * Per exemple, si n=4, calcula 4 + 3 + 2 + 1 = 10.
     * Si n és 0, la suma és 0.
     *
     * @param n El nombre enter positiu fins al qual es vol sumar.
     * @return La suma total (1 + 2 + ... + n).
     */
    public static int sumaPrimersNumeros(int n) {
        int suma = 0;
        while (n != 0 && n > 0) {
            suma = suma + n;
            n--;
        }
        return suma;
    }

    /**
     * Calcula el factorial d'un nombre enter 'n' (n!).
     * El factorial és el producte de tots els enters positius des d'1 fins a 'n'.
     * Per exemple, si n=4, calcula 4 * 3 * 2 * 1 = 24.
     * Per definició, el factorial de 0 (0!) és 1, la qual cosa aquest mètode gestiona correctament.
     *
     * @param n El nombre enter (no negatiu) del qual es vol calcular el factorial.
     * @return El factorial de {@code n}.
     */
    public static int calcularFactorial(int n) {
        int fact = 1;
        while (n != 0 && n > 0) {
            fact = fact * n;
            n--;
        }
        return fact;
    }
    /**
     * Calcula la suma dels quadrats dels primers 'n' nombres enters positius.
     * Per exemple, si n=3, calcula 3*3 + 2*2 + 1*1 = 9 + 4 + 1 = 14.
     * Si n és 0, la suma és 0.
     * ATENCIÓ: El mètode no està preparat per a nombres negatius (causaria un bucle infinit).
     *
     * @param n El nombre enter positiu fins al qual es vol sumar els quadrats.
     * @return La suma total (1^2 + 2^2 + ... + n^2).
     */
    public static int sumaQuadrats(int n) {
        int quat = 0;
        while (n != 0 && n > 0) {
            quat = quat + (n * n);
            n--;
        }
        return quat;
    }
    /**
     * Calcula la potència (base elevada a l'exponent) utilitzant únicament sumes.
     * <p>
     * Aquest mètode implementa la multiplicació (necessària per a la potència)
     * com una sèrie de sumes repetides (bucle intern), i després implementa
     * la potència com una sèrie d'aquestes multiplicacions (bucle extern).
     * <p>
     * <b>ATENCIÓ:</b> Aquesta implementació té limitacions significatives:
     * <ul>
     * <li>Només funciona per a <b>exponents enters majors o iguals a 1</b>.
     * <li>No gestiona correctament el cas <b>exponent = 0</b> (hauria de retornar 1, però retorna la base).
     * <li>No funciona amb <b>bases negatives</b>.
     * <li>No funciona amb <b>exponents negatius</b>.
     * </ul>
     *
     * @param base     La base de la potència (ha de ser positiva).
     * @param exponent L'exponent de la potència (ha de ser >= 1).
     * @return El resultat de (base ^ exponent).
     */
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
