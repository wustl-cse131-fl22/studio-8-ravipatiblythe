package studio8;

import java.util.HashSet;
import java.util.Objects;

public class Appointment {
	private Date date;
	private Time time;
	
	public Appointment(Date date, Time time) {
		super();
		this.date = date;
		this.time = time;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}

	public String toString() {
		return "Your appointment is " + date + " at " + time;
	}

	public static void main(){
		Date d1 = new Date("November",16,2022,true);
		Time t2 = new Time(14,20,false);
		Time t3 = new Time(15,20,false);
		Appointment a1 = new Appointment(d1,t2);
		Appointment a2 = new Appointment(d1,t3);
		Appointment a3 = new Appointment(d1,t2);
		
		HashSet<Appointment> set = new HashSet<Appointment>();
		set.add(a1);
		set.add(a2);
		set.add(a3);
		System.out.println(set);
	}
	
	

}
