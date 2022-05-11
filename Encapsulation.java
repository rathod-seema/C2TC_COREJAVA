package SeemaRathod;

public class Encapsulation {

	private String Name;
	private String SureName;
	private int Usn;
	
	
	public String getName()
	{
		return getName();
	}
	public void setName(String Name)
	{
		this.Name = Name;
	}
	public String getSureName()
	{
		return SureName;
	}
	public void setSureName(String SureName)
	{
		this.SureName = SureName;
	}
	public int getUsn()
	{
		return Usn;
	}
	public void setUsn(int Usn)
	{
		this.Usn = Usn;
	}
}
	
class EncapsulationDemo{
	

	public static void main(String[] args) {
		
		Encapsulation e = new Encapsulation();
		e.setName("Seema");
		e.setSureName("Rathod");
		e.setUsn(1234);
		
		System.out.println(e.getName());
		System.out.println(e.getSureName());
		System.out.println(e.getUsn());
		
		

	}

}


