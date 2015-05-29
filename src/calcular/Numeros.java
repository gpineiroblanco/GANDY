/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcular;

public class Numeros {
    int numero1;
    int numero2;
    int resultado;

    public Numeros() {
    }

    public Numeros(int numero1, int numero2, int resultado) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultado = resultado;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "Numeros{" + "numero1=" + numero1 + ", numero2=" + numero2 + ", resultado=" + resultado + '}';
    }

    
}
