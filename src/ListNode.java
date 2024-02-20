/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Diego A. Vivolo
 */
public class ListNode {
    private T value;
    private ListNode<T> next;
    
        /**
     * Crea un nodo
     * @param value el valor del nodo 
     */
    public ListNode(T value) {
        this.value = value;
    }

    /**
     * Crea un nodo
     * @param value el valor del nodo 
     * @param next referencia al siguiente nodo
     */
    public ListNode(T value, ListNode<T> next) {
        this.value = value;
        this.next = next;
    }

    /**
     * Retorna el valor del nodo
     * @return El valor del nodo
     */
    public T getValue() {
        return value;
    }

    /**
     * Establece el valor del nodo
     * @param value el valor del nodo
     */
    public void setValue(T value) {
        this.value = value;
    }

    /**
     * Retorna una referencia al siguiente nodo
     * @return El siguiente nodo
     */
    public ListNode<T> getNext() {
        return next;
    }

    /**
     * Establece la referencia al siguiente nodo
     * @param next el siguiente nodo
     */
    public void setNext(ListNode<T> next) {
        this.next = next;
    }   
}
    
}
