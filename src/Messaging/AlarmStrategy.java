package Messaging;

import java.util.Scanner;

import Observer.Subject;
import State.Cancellation;

public class AlarmStrategy implements Strategy{

	@Override
	public void AlgorithmInterface() 
	{
		Subject sub = new Subject();
		sub.notifyObservers();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
    	int choice = 0;
		while(choice != 1)
		{
			System.out.println("Wybierz 1, by zresetowa� urz�dzenie");
			choice = scan.nextInt();
		}
		new Cancellation().Handle();
		
	}

}
