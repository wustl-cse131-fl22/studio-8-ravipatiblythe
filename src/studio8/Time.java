package studio8;

import java.util.Objects;
import java.util.HashSet;
import java.util.LinkedList;

public class Time {
	private int hour;
	private int minute;
	private boolean military;
	
	public Time(int hr, int min, boolean mili) {
		hour = hr;
		minute = min;
		military = mili;
	}
	
	public String toString() {
		if (military==true) {
			return hour + ":" + minute;
		}
		else {
			if (hour>12) {
				return (hour-12) + ":" + minute + "pm";
			}
			else {
				return hour + ":" + minute + "am";
			}
		}
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}
	
	public static void main(String[] args) {
		LinkedList<Time> timeList = new	LinkedList<Time>();
		Time t1 = new Time(8,15,false);
		Time t2 = new Time(14,20,false);
		Time t3 = new Time (6,30,true);
		Time t4 = new Time (20,50,true);
		Time t5 = new Time (6,30,false);
		timeList.add(t1);
		timeList.add(t2);
		timeList.add(t3);
		timeList.add(t4);
		timeList.add(t5);
		System.out.println(timeList);
		if (t3.equals(t5)){
			System.out.println("Time 3 is the same as Time 5");
		}
		HashSet<Time> set = new HashSet<Time>();
		set.add(t1);
		set.add(t2);
		set.add(t1);
		System.out.println(set);
    }

}