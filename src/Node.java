/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Diego A. Vivolo/Gabriel Orozco
 */
public class Node<T> {
    private T data;
    private Node<T> pNext;
    
    /*
     * Metodo constructor parametrizado
     * @param data Objeto contenido dentro del nodo
     */

    public Node(T data) {
        this.data = data;
        this.pNext = null;
    }
        
    /**
     * @return the data
     */
    public T getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * @return the pNext
     */
    public Node<T> getpNext() {
        return pNext;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setpNext(Node<T> pNext) {
        this.pNext = pNext;
    }
    
    
}
