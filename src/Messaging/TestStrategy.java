package Messaging;

import java.util.Scanner;

import State.Cancellation;
import State.Context;

public class TestStrategy implements Strategy{

	@Override
	public void AlgorithmInterface() 
	{
		Context.state = new Cancellation();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
    	int choice = 0;
		while(choice != 1)
		{
			System.out.println("Wybierz 1, by zresetowaæ urz¹dzenie");
			choice = scan.nextInt();
		}
		new Cancellation().Handle();
	}

}
