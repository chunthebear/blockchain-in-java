import java.util.*;

public class Data{
	private String[] conditions;
	private int date;
	
	public Data (String[] conditions, int date){
		this.conditions = conditions;
		this.date = date;
	}
	
	public String[] getConditions(){
		return conditions;
	}
	
	public int getDate(){
		return date;
	}
	
	public String toString(){
		return "Conditions: " + Arrays.toString(conditions) + " Date: " + date;
	}
}