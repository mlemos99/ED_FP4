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
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws EmptyCollectionException {
        CircularArrayQueue<String> cod = new CircularArrayQueue<>();
        CircularArrayQueue<Integer> key = new CircularArrayQueue<>();

        cod.enqueue("o");
        cod.enqueue("l");
        cod.enqueue("a");
//        cod.enqueue("w");
//        cod.enqueue("l");
//        cod.enqueue("e");
//        cod.enqueue("d");
//        cod.enqueue("g");
//        cod.enqueue("e");
//        cod.enqueue(" ");
//        cod.enqueue("i");
//        cod.enqueue("s");
//        cod.enqueue(" ");
//        cod.enqueue("p");
//        cod.enqueue("o");
//        cod.enqueue("w");
//        cod.enqueue("e");
//        cod.enqueue("r");

        key.enqueue(3);
        key.enqueue(1);
        key.enqueue(7);
//        key.enqueue(4);
//        key.enqueue(2);
//        key.enqueue(5);
//        key.enqueue(3);
//        key.enqueue(1);
//        key.enqueue(7);
//        key.enqueue(0);//key.enqueue(null);
//        key.enqueue(4);
//        key.enqueue(2);
//        key.enqueue(0);//key.enqueue(null);
//        key.enqueue(5);
//        key.enqueue(3);
//        key.enqueue(1);
//        key.enqueue(7);
//        key.enqueue(4);

        Codifica codifica = new Codifica(cod, key);

        codifica.codifica();
        System.out.println(codifica.getMensageCodi().toString());
        key.enqueue(3);
        key.enqueue(1);
        key.enqueue(7);
//        key.enqueue(4);
//        key.enqueue(2);
//        key.enqueue(5);
//        key.enqueue(3);
//        key.enqueue(1);
//        key.enqueue(7);
//        key.enqueue(0);//key.enqueue(null);
//        key.enqueue(4);
//        key.enqueue(2);
//        key.enqueue(0);//key.enqueue(null);
//        key.enqueue(5);
//        key.enqueue(3);
//        key.enqueue(1);
//        key.enqueue(7);
//        key.enqueue(4);
        codifica.traduzMessage();
        System.out.println(codifica.getMensageDesco().toString());

    }
}
