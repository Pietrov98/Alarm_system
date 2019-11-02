package State;

public class Cancellation extends State{

	@Override
	public void Handle() 
	{
		Context.state = new Readiness();
	}

}
