
public class Car
{
	// attributes
	private String Manufacturer;
	private String Model;
	
	// constructor
	public Car(String manufacturer, String model)
	{
		Manufacturer = manufacturer;
		Model = model;
	}
	
	// method for driving
	public String drive(String destination)
	{
		return "We are driving to " + destination;
	}

	// toString
	@Override
	public String toString()
	{
		return "Car [Manufacturer=" + Manufacturer + ", Model=" + Model + "]\n";
	}
	
	
	
}
