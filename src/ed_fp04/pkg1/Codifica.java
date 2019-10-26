/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_fp04.pkg1;

/**
 *
 * @author Utilizador
 */
public class Codifica {
     private LinkedQueue<String> mensageDesco;
    private LinkedQueue<Integer> key;
    private LinkedQueue<String> mensageCodif;

    public Codifica(LinkedQueue<String> mensageCod, LinkedQueue<Integer> key) {
        this.mensageDesco = mensageCod;
        this.key = key;
        this.mensageCodif = new LinkedQueue<>();
    }

    public void traduzMessage() throws EmptyCollectionException {

        while (!mensageCodif.isEmpty()) {

            char c = mensageCodif.dequeue().charAt(0);
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
            mensageCodif.enqueue(add);
        }
    }

    public LinkedQueue<String> getMensageDesco() {
        return mensageDesco;
    }

    public LinkedQueue<Integer> getKey() {
        return key;
    }

    public LinkedQueue<String> getMensageCodif() {
        return mensageCodif;
    }

}
