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
public class Queue {

    private Person data;
    Queue next;

    public Queue(Object dt) {
        this.data = (Person) dt;
        this.next = null;
    }

    public Queue() {
    }

    public Person getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = (Person) data;
    }

    public Queue getNext() {
        return next;
    }

    public void setNext(Queue next) {
        this.next = next;
    }

    public void queueDisplay() {
        
        String name = data.getName();
        String adress = data.getAdress();
        int number = data.getNumberHouse();
        String tel =data.getTel();

        System.out.print("Name: " + name + " \n"
                + "Adress: " + adress + ", " + number + "\n"
                        + "Tel: " + tel + "\n");
    }

}
