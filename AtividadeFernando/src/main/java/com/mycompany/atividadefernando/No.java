/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadefernando;

/**
 *
 * @author iagom
 */
public class No {
    double valor;
    No anterior;
    No proximo;

    public No(int valor) {
        this.valor = valor;
        this.anterior = null;
        this.proximo = null;
    }
}
