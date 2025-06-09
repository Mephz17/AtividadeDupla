/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadefernando;

/**
 *
 * @author iagom
 */
public class ListaDuplamenteEncadeada {
    private No inicio;
    private No fim;
    private int tamanho;

    public ListaDuplamenteEncadeada() {
        inicio = null;
        fim = null;
        tamanho = 0;
    }

    public void adicionarFim(int valor) {
        No novo = new No(valor);
        if (inicio == null) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
        tamanho++;
    }

    public void adicionarInicio(int valor) {
        No novo = new No(valor);
        if (inicio == null) {
            inicio = fim = novo;
        } else {
            novo.proximo = inicio;
            inicio.anterior = novo;
            inicio = novo;
        }
        tamanho++;
    }

    public void adicionarPosicao(int pos, int valor) {
        if (pos <= 0) {
            adicionarInicio(valor);
        } else if (pos >= tamanho) {
            adicionarFim(valor);
        } else {
            No atual = inicio;
            for (int i = 0; i < pos; i++) {
                atual = atual.proximo;
            }
            No novo = new No(valor);
            No anterior = atual.anterior;
            anterior.proximo = novo;
            novo.anterior = anterior;
            novo.proximo = atual;
            atual.anterior = novo;
            tamanho++;
        }
    }

    public void removerInicio() {
        if (inicio != null) {
            if (inicio == fim) {
                inicio = fim = null;
            } else {
                inicio = inicio.proximo;
                inicio.anterior = null;
            }
            tamanho--;
        }
    }

    public void removerFim() {
        if (fim != null) {
            if (inicio == fim) {
                inicio = fim = null;
            } else {
                fim = fim.anterior;
                fim.proximo = null;
            }
            tamanho--;
        }
    }

    public void removerPosicao(int pos) {
        if (pos < 0 || pos >= tamanho) return;

        if (pos == 0) {
            removerInicio();
        } else if (pos == tamanho - 1) {
            removerFim();
        } else {
            No atual = inicio;
            for (int i = 0; i < pos; i++) {
                atual = atual.proximo;
            }
            No anterior = atual.anterior;
            No proximo = atual.proximo;
            anterior.proximo = proximo;
            proximo.anterior = anterior;
            tamanho--;
        }
    }

    public boolean contem(double valor) {
        No atual = inicio;
        while (atual != null) {
            if (atual.valor == (valor)) return true;
            atual = atual.proximo;
        }
        return false;
    }

    public void limpar() {
        inicio = fim = null;
        tamanho = 0;
    }

    public int tamanho() {
        return tamanho;
    }

    public void imprimir() {
        No atual = inicio;
        System.out.print("[ ");
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println("]");
    }
    
    public void imprimirDecresc(){
        No atual = fim;
        System.out.print("[ ");
        while(atual != null){
            System.out.print(atual.valor + " ");
            atual = atual.anterior;
        }
        System.out.println(" ]");
    }
}
