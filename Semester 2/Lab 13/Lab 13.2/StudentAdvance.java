public class StudentAdvance extends Advance
{
	public StudentAdvance(int daysleft)
	{
		super(daysleft);
	}
	
	public int getPrice()
	{
		return super.getPrice()/2;
	}
	public String toString() 
	{
        return super.toString() + 
				"\n(STUDENT ID REQUIRED)";
    }
}

