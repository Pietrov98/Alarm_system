package State;

import Messaging.*;

public class Alarm extends State{

	@Override
	public void Handle() 
	{
		System.out.println("Wlaczenie syreny");
		Strategy strategy = new AlarmStrategy();
		strategy.AlgorithmInterface();
	}

}
