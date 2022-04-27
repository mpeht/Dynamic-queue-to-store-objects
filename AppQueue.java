/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinamicqueue;

/**
 *
 * @author mpeht
 */
public class AppQueue {

    private Queue begin, end;
    private int size;

    public AppQueue() {
        this.begin = null;
        this.end = null;
        this.size = 0;
    }

    public Queue getBegin() {
        return begin;
    }

    public void setBegin(Queue begin) {
        this.begin = begin;
    }

    public Queue getEnd() {
        return end;
    }

    public void setEnd(Queue end) {
        this.end = end;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty() {
        if (getBegin() == null) {
            return true;
        } else {
            return false;
        }
    }

    public void Enqueue(Object obj) {

        Queue newQueue = new Queue(obj);
        if (begin == null) {
            begin = newQueue;
            end = begin;
        } else {
            end.setNext(newQueue);
            end = newQueue;
        }
    }

    public Person Dequeue() {
        if (isEmpty()) {
            return null;
        } else {
            Queue temp = begin;
            begin = begin.getNext();
            if (begin == null) {
                end = null;
                size--;
            }
            return temp.getData();
        }
    }

    public void nextElement() {
        Queue aux;
        if (!isEmpty()) {
            Queue top = null;
            aux = begin;
            aux.queueDisplay();
        }
    }

    public void Display() {
        if (isEmpty()) {
                System.out.print("Fila vazia.");
            } else {
               Queue actual = this.begin;
            while (actual != null) {
                actual.queueDisplay();
                actual = actual.getNext();
            }
            

        }
    }
}