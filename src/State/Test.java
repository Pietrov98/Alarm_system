package State;

import Messaging.Strategy;
import Messaging.TestStrategy;

public class Test extends State{

	@Override
	public void Handle() 
	{
		System.out.println("Wlaczenie syreny");
		Strategy strategy = new TestStrategy();
		strategy.AlgorithmInterface();
	}

}
