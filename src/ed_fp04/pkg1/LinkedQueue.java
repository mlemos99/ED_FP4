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
public class LinkedQueue<T> implements ed_fp04.pkg1.QueueADT<T> {
    //atributos

    private LinearNode<T> head;
    private LinearNode<T> tail;
    private int size;

    public LinkedQueue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    @Override
    public boolean isEmpty(){
        return(size==0);
    }

    /**
     *
     * @param element
     */
    @Override
    public void enqueue(T element) {
        LinearNode<T> nova =new LinearNode<>(element);
        if(isEmpty()){
            this.head=nova;
            this.tail=nova;
            
        }else{
            this.tail.setNext(nova);
            this.tail=nova;
        }
        size++;
    }

    @Override
    public T dequeue() throws EmptyCollectionException {
        
        if(isEmpty())
            throw new EmptyCollectionException("Lista vazia");
        
            T aux=head.getElemento();
            head=head.getNext();
            size--;
        
        return aux;
    }

    @Override
    public T first() throws EmptyCollectionException {
        if(isEmpty())
            throw new EmptyCollectionException("Lista vazia");
                    
        return this.head.getElemento();
    }

    @Override
    public int size() {
       return this.size;
    }

    @Override
    public String toString() {
        String result = "";
        LinearNode<T> current = head;

        while (current != null) {
            result = result + (current.getElemento()).toString() + "\n";
            current = current.getNext();
        }

        return result;
    }
    
    

}
