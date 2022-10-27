package 서영찬2A;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Todo {
	
	
	Date dt;
	String name;
	String complete = "";
	
	Todo(Date dt, String name) {
		this.dt = dt;
		this.name = name;
		
	}
	
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		String result = String.format("[%s] %s\t%s ", sdf.format(dt), name, complete);
		
		return result;
	}



}
