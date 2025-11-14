# CalculadoraJava

# 🧮 SuperCalculadora

## Objectiu
Implementar els mètodes d’una classe `SuperCalculadora` que permetin realitzar diferents operacions matemàtiques bàsiques.

---

## ✳️ Implementar els mètodes

La classe **`SuperCalculadora`** ha de contenir els següents mètodes:

- `sumaPrimersNumeros(int n)`: retorna la suma dels primers *n* números positius  
  *(exemple: 1 + 2 + ... + n)*

- `calcularFactorial(int n)`: retorna el factorial de *n*  
  *(exemple: 5! = 5 × 4 × 3 × 2 × 1)*

- `sumaQuadrats(int n)`: retorna la suma dels quadrats dels primers *n* números  
  *(exemple: 1² + 2² + ... + n²)*

- `calcularPotencia(int base, int exponent)`: retorna el resultat de la base elevada a l'exponent.  
  S'ha de resoldre **fent sumes**, no utilitzant l'operador `*` ni `Math.pow()`.  
  *(exemple: 2 + 2 + 2 = 2³)*

- `nombreDigits(int n)`: retorna el nombre de dígits de *n*  
  *(exemple: el nombre 1234 té 4 dígits)*

---

## 📋 Crear un mètode per mostrar el menú d’operacions

A la classe `SuperCalculadora`, implementa un mètode anomenat **`mostrarMenuConsola()`** que mostri les diferents operacions disponibles per a l'usuari.  
Aquest menú ha d'incloure les opcions corresponents a cada càlcul (suma, factorial, suma de quadrats, potència i nombre de dígits).
Aquest mètode excepcionalment té println's !!

---

## 🚀 Implementar el mètode `main`

Al mètode `main` de la vostra aplicació, heu de:

1. Mostrar el menú d'operacions utilitzant el mètode `mostrarMenuConsola()`.
2. Demanar a l'usuari que triï una de les opcions disponibles.
3. Demanar per teclat els valors necessaris per al càlcul segons l'opció seleccionada.
4. Mostrar el resultat de l'operació escollida.

---

## 🧭 Exemple de Menú
Menú de SuperCalculadora:

1- Suma dels primers n números

2- Factorial d'un nombre

3- Suma dels quadrats dels primers n números

4- Potència d'un nombre

5- Nombre de dígits d'un nombre

6- Sortir

Després d'escollir una opció, el programa ha de sol·licitar els valors necessaris per al càlcul i mostrar el resultat.

---

## ⚙️ Requisits addicionals


  Tots els càlculs s'han de fer dins dels mètodes.
- Utilitzeu **estructures de control** (`while`, `for`) per implementar els bucles necessaris.
- El menú ha de permetre que l'usuari **continuï executant operacions** fins que seleccioni l'opció de **Sortir**.

---

## 💡 Consell
Prova cada mètode per separat abans d’integrar-lo al menú principal per assegurar que els resultats siguin correctes.


## 📘 Generar la documentació Javadoc de tots els paquets

Per generar la documentació del projecte en format HTML per a **tots els paquets**, executa la següent comanda des de l’arrel del projecte:

```bash
javadoc -d doc -sourcepath src/main/java -subpackages .
```

```bash
javadoc -d doc -sourcepath src/main/java -subpackages org.yourcompany.calculadora
```

On:

-d doc especifica la carpeta on es desarà la documentació (es crearà si no existeix).

-sourcepath src/main/java indica la ruta on es troben els fitxers .java.

-subpackages exemple.supercalculadora genera la documentació per a tots els paquets dins d’aquest espai de noms.