package studio8;

import java.util.Objects;
import java.util.HashSet;
import java.util.LinkedList;

public class Date {
 		private String month;
    	private int day;
    	private int year;
    	private boolean holiday;
    	

    public Date(String mo, int d, int yr, boolean hol) {
    	month = mo;
		day = d;
		year = yr;
		holiday = hol;
	}
    
    public String toString() {
    	if (holiday ==true) {
    		return "The date is " + month + " "  + day + ", " + year + " Enjoy the holiday!";
    	}
    	else {
    	return "The date is " + month + " "  + day + ", " + year;
    	}
    }

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && Objects.equals(month, other.month) && year == other.year;
	}
	

	public static void main(String[] args) {
		LinkedList<Date> dateList = new LinkedList<Date>();
		Date d1 = new Date("November",16,2022,true);
		Date d2 = new Date("November",18,2003,true);
		Date d3 = new Date("April",18,2003,true);
		Date d4 = new Date("February",10,1965,false);
		Date d5 = new Date("November",16,2022,false);	
		dateList.add(d1);
		dateList.add(d2);
		dateList.add(d3);
		dateList.add(d4);
		dateList.add(d5);
		System.out.println(dateList);
		HashSet<Date> set = new HashSet<Date>();
		set.add(d1);
		set.add(d2);
		set.add(d1);
		System.out.println(set);
    }

}
