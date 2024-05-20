package org.example.evaluacion;

import org.example.Pilas.PilaLineal;

import java.util.Scanner;

public class Evaluators {

    public static void evaluador(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite la el dato a evaluar si es palindromo: ");
        System.out.println("");
        String palabra = scanner.nextLine();                                           //creamos una entrada de datos
        String palabraDepurada = Depurador.depurar(palabra);                       //mandamos el dato a la clase depurador para eliminar los signos y espacios
        String palabraInvertida = "";
        PilaLineal pila = new PilaLineal();

        for (int i = 0; i < palabraDepurada.length(); i++){
            try {
                pila.insertar(palabraDepurada.charAt(i));
            } catch (Exception ex){
                System.out.println("Problema al insertar: " + ex.getMessage());
            }
        }

        while (!pila.pilaVacia()){
            try {
                palabraInvertida += pila.quitar();
            } catch (Exception ex){
                System.out.println("Error comprobando!");
            }
        }

        if (palabraDepurada.equals(Depurador.depurar(palabraInvertida))) {
            System.out.println("La palabra '" + palabra + "' es un palíndromo.");
        } else {
            System.out.println("La palabra '" + palabra + "' no es un palíndromo.");
        }
    }



}
