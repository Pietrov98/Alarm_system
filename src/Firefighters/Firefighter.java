/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Firefighters;

import Observer.Observer;

/**
 *
 * @author retsu // a tutaj chyba wzorzec observer
 * 				 // strategy pewnie do messaging
 */
public class Firefighter extends Observer implements IFirefighter {
    String name;
    String surname;
    String phoneNumber;

    public Firefighter(String name, String surname, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void sendSms(String content) {
        System.out.println("Wysylam SMS do " + this.name + " " + this.surname + " o tresci " + content);
    }

	@Override
	public void notifyy() {
		System.out.println(this.name + " " + this.surname + " odebral zgloszenie");
		
	}
    
}
