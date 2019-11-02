package State;

public class Context {
	public static State state;
	public Context()
	{
		state = new Readiness();
		state.Handle();
	}
	
	public void Request()
	{
		//state = st;
		state.Handle();
	}
}
