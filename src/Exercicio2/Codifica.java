/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;

/**
 *
 * @author Utilizador
 */
public class Codifica {

    private CircularArrayQueue<String> mensageDesco;
    private CircularArrayQueue<Integer> key;
    private CircularArrayQueue<String> mensageCodi;

    public Codifica(CircularArrayQueue<String> mensageCod, CircularArrayQueue<Integer> key) {
        this.mensageDesco = mensageCod;
        this.key = key;
        this.mensageCodi = new CircularArrayQueue<>(mensageCod.size());
    }

    public void traduzMessage() throws EmptyCollectionException {

        while (!mensageCodi.isEmpty()) {
            

            char c = mensageCodi.dequeue().charAt(0);
            int k = key.dequeue();

            int ch = (int) c;
            ch = ch - k;

            c = (char) ch;
            String add = "" + c;
            mensageDesco.enqueue(add);
            
        }
    }

    public void codifica() throws EmptyCollectionException {

        while (!mensageDesco.isEmpty()) {

            char c = mensageDesco.dequeue().charAt(0);
            int k = key.dequeue();

            int ch = (int) c;
            ch = ch + k;

            c = (char) ch;
            String add = "" + c;
            mensageCodi.enqueue(add);
        }
    }

    public CircularArrayQueue<String> getMensageDesco() {
        return mensageDesco;
    }

    public CircularArrayQueue<Integer> getKey() {
        return key;
    }

    public CircularArrayQueue<String> getMensageCodi() {
        return mensageCodi;
    }

}
