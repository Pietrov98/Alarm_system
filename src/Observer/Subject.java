package Observer;

import java.util.ArrayList;
import java.util.List;

import Firefighters.Firefighter;

public class Subject {
	static List<Firefighter> observerCollection = new ArrayList<Firefighter>();
	
	public void registerObserver(Firefighter observer)
	{
		observerCollection.add(observer);
	}
	
	public void unregisterObserver(Firefighter observer)
	{
		observerCollection.remove(observer);
	}
	
	public void notifyObservers()
	{
		for(int i = 0; i < observerCollection.size(); i++)
		{
			observerCollection.get(i).sendSms("Alarm");
		}
	}
}

