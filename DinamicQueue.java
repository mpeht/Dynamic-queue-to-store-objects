/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinamicqueue;

import java.util.Scanner;

/**
 *
 * @author mpeht
 */
public class DinamicQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner in01 = new Scanner(System.in);
           Scanner in02 = new Scanner(System.in);
           AppQueue line = new AppQueue();
           Person person;
        
        int op, num, i, num02, numberHouse = 0;
        String name, adress, tel; 
        do{
            System.out.println("Enter you option: \n"
                    + "1 - Insert data of your friend; \n"
                    + "2 - Remove a number in the line; \n"
                    + "3 - See the head of line; \n"
                    + "4 - See all numbers of line \n"
                    + "5 - Exit. \n");
            op = in02.nextInt();
            
            switch(op)  {
                case 1:
                    person = new Person();                        
                        System.out.print("Input your friend's name: ");
                        name = in01.nextLine();
                        person.setName(name);
                        System.out.print("Input your friend's adress: ");
                        adress = in01.nextLine();
                        person.setAdress(adress);
                        System.out.print("Input your friend's number house: ");
                        numberHouse = in02.nextInt();
                        person.setNumberHouse(numberHouse);
                        System.out.print("Input your friend's telephone number: ");
                        tel = in01.nextLine();
                        person.setTel(tel);
                        line.Enqueue(person);
                    break;
                case 2:
                    line.Dequeue(); 
                    break;
                case 3:
                    line.nextElement();
                    break;
                case 4:
                    line.Display();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }while(op >= 1 && op <= 5);
    }
    
}