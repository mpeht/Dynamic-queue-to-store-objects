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
public class Person {
    
    private String name;
    private String adress;
    private int numberHouse;
    private String tel;

    public Person(String name, String adress, int numberHouse, String tel) {
        this.name = name;
        this.adress = adress;
        this.numberHouse = numberHouse;
        this.tel = tel;
    }

    Person() {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getNumberHouse() {
        return numberHouse;
    }

    public void setNumberHouse(int numberHouse) {
        this.numberHouse = numberHouse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    public String toStringPerson() {
        String obj;
        obj = "Nome: " + getName() + "\n"
              + "Adress: " + getAdress() + " nº " + getNumberHouse() + " \n"
              + "Tel: " + getTel() + "\n";
        return obj;
        
    }
}
