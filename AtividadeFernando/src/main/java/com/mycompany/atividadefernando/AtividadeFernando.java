/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadefernando;

/**
 *
 * @author iagom
 */
import java.util.Random;

public class AtividadeFernando {
    
public static boolean verifica(int indices[], int indice, int iterador){
    if(iterador == 0){
        return false;
    }
    for(int i = 0; i < iterador; i++){
        if(indice == indices[i]){
            return true;
        }
    }
    return false;
}

public static boolean ehPrimo(int numero) {
    if (numero <= 1) {
        return false;
    }
    if (numero == 2) {
        return true;
    }
    if (numero % 2 == 0) {
        return false;
    }
    int raiz = (int) Math.sqrt(numero);
    for (int i = 3; i <= raiz; i += 2) {
        if (numero % i == 0) {
            return false;
        }
    }
    return true;
}
    public static void main(String[] args) {
        int numeros[] = new int[1000];
        Random random = new Random();
        for(int i = 0; i < 1000; i++){
            numeros[i] = random.nextInt(19999) - 9999;
            
        }
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        int indice = 0;
        int posicaoMenor[] = new int[1000];
        int iterador = 0;
        while(iterador < 1000){
            int j = 0;
            while(verifica(posicaoMenor, j, iterador)) {
                    j++;
        
                }
            int menor = numeros[j];
            indice = j;

            for(int i = 0; i < 1000; i++){
                if(verifica(posicaoMenor, i, iterador)){
                    continue;
                }
                else{
                    if(menor >= numeros[i]){
                        menor = numeros[i];
                        indice = i;
                    }
                }
            }
            posicaoMenor[iterador] = indice;
            lista.adicionarFim(menor);
            iterador++;
        }
        System.out.print("[");
        for(int i = 0; i < 1000; i++){
            System.out.print(numeros[i] + " ");
        }
        System.out.println("]");
        lista.imprimir();
        lista.imprimirDecresc();
        
        // removendo primos
        
        lista.removerPrimos();
        lista.imprimir();
    }
}
