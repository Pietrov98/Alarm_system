/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Alarming.ResponseCode;
import Alarming.VFDUnit;
import Firefighters.Firefighter;
import Observer.Subject;
import State.Alarm;
import State.Context;
import State.State;
import State.Test;

/**
 *
 * @author retsu
 */
public class Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    	    	
    	VFDUnit firefightersUnit = new VFDUnit("Powiat przemyski", "111", "999");
    	Subject subject = new Subject();
    	Context context = new Context();
    	
    	List<Firefighter> listOfFirefighters = new ArrayList<Firefighter>();
    	listOfFirefighters.add(new Firefighter("Jan", "Kowalski", "656434323"));
    	listOfFirefighters.add(new Firefighter("Adam", "Nowak", "123154112"));
    	listOfFirefighters.add(new Firefighter("Maciej", "Kisielak", "533211323"));
    	listOfFirefighters.add(new Firefighter("Andrzej", "Krol", "644677766"));

    	for(int i = 0; i < listOfFirefighters.size(); i++)
    	{
    		subject.registerObserver(listOfFirefighters.get(i));  
    	}
    	
    	@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
    	Random generator = new Random();
    	int choice;
    	String code;
    	
    	while(true)
    	{
    		System.out.println("1.Alarm\n"
					 		 + "2.Test\n" 
					 		 + "3.Wyjscie");
    		choice = scan.nextInt();
    		if(choice == 1)
    		{
    			System.out.println("Podaj kod zgloszenia alarmu");
    			code = scan.next();
    			if(firefightersUnit.notify(code) == ResponseCode.ALARM_OK)
    			{
    				listOfFirefighters.get(generator.nextInt(listOfFirefighters.size())).notifyy();
    				System.out.println("Potwierdzenie odbioru alarmu");
    				State state = new Alarm();
    				Context.state = state;
    				context.Request();
    				
    			}
    			else if(firefightersUnit.notify(code) == ResponseCode.ERROR)
    				System.out.println("Nieprawidlowy kod");
    		}
    		else if(choice == 2)
    		{
    			System.out.println("Podaj kod zgloszenia testu");
    			code = scan.next();
    			if(firefightersUnit.notify(code) == ResponseCode.TEST_OK)
    			{
    				listOfFirefighters.get(generator.nextInt(listOfFirefighters.size())).notifyy();
    				System.out.println("Potwierdzenie odbioru testu");
	    			State state = new Test();
	    			Context.state = state;
    			}
    			else if(firefightersUnit.notify(code) == ResponseCode.ERROR)
    				System.out.println("Nieprawidlowy kod");
    		}
    		else if(choice == 3)
    		{
    			System.out.println("Wylaczenie systemu");
    			break;
    		}
    	}
    }
    
}
