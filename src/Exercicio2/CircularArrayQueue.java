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
public class CircularArrayQueue<T> implements QueueADT<T> {

    //atributos
    private final int DEFAULT_CAPACITY = 100;
    private T[] array;
    private int front;
    private int rear;
    private int size;

    /**
     * Cria uma fila vazia usando default_capacity
     */
    public CircularArrayQueue() {
        this.front = 0;
        this.rear = 0;
        this.size = 0;
        array = (T[]) (new Object[DEFAULT_CAPACITY]);
    }

    /**
     * Cria uma fila vazia usando a capacidade especificada.
     *
     * @param initialCapacity
     */
    public CircularArrayQueue(int initialCapacity) {
        this.front = 0;
        this.rear = 0;
        this.size = 0;
        array = ((T[]) (new Object[initialCapacity]));
    }

    /**
     * Adiciona o elemento especificado na parte traseira da fila, expandindo a
     * capacidade da matriz da fila, se necessário.
     *
     * @param element
     */
    @Override
    public void enqueue(T element) {
        if (size() == array.length) {
            expandCapacity();
        }

        array[rear] = element;

        rear = (rear + 1) % array.length;

        size++;
    }

    /**
     * Remove o elemento na frente da fila e retorna um referência a ele. Lança
     * um EmptyCollectionException se o fila está vazia.
     *
     * @return
     * @throws EmptyCollectionException
     */
    @Override
    public T dequeue() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("queue");
        }

        T result = array[front];
        array[front] = null;

        front = (front + 1) % array.length;

        size--;

        return result;
    }

    /**
     * Retorna uma referência ao elemento na frente da fila. O elemento não é
     * removido da fila. Lança um EmptyCollectionException se a fila estiver
     * vazia.
     *
     * @return
     * @throws EmptyCollectionException
     */
    @Override
    public T first() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("queue");
        }

        return array[front];
    }

    /**
     * Método para ver se LinkedStack está vazia
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    /**
     * Método para o tamanho
     *
     * @return
     */
    @Override
    public int size() {
        return this.size;
    }

    /**
     * Cria uma nova matriz para armazenar o conteúdo da fila com o dobro da
     * capacidade do antigo.
     */
    private void expandCapacity() {
        T[] larger = (T[]) (new Object[array.length * 2]);

        for (int i = 0; i < size; i++) {
            larger[i] = array[front];
            front = (front + 1) % array.length;
        }

        front = 0;
        rear = size;
        array = larger;
    }

    /**
     * Retorna uma representação de string dessa fila.
     *
     * @return
     */
       @Override
    public String toString() {
      String s="Circular array:";
      
      if(this.rear<this.front){
          for(int i=this.front;i<this.array.length;i++){
              s+=this.array[i];
              
          }
          for(int i=0;i<=this.rear;i++){
              s+=this.array[i];
          }
      }
      else{
          for(int i=this.front;i<=this.rear-1;i++){
              s+=this.array[i];
          }
      }
       
       return s;
    }

}
