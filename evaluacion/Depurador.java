package org.example.evaluacion;

import java.text.Normalizer;
public class Depurador {




    public static String depurar(String palabra) {

        palabra = palabra.replaceAll("[^\\p{L}\\p{Nd}]+", "");// depura los signos [^\p{L}\p{Nd}]
        palabra = palabra.toLowerCase();//pasamos el string a minusculas
        palabra = palabra.replaceAll("[^a-zA-Z]", "");// quitamos los simbolos
        palabra = palabra.replaceAll("\\s+", "");// quitamos los espacios
        palabra = palabra.replaceAll("[\\d]", "");// depuramos los numeros
        palabra = Normalizer.normalize(palabra, Normalizer.Form.NFD)// y aqui le quitamos los acentos y tildes
                .replaceAll("\\p{M}", "");

        return palabra;
    }






}
