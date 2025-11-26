package Intermediatory;

import java.util.ArrayList;
import java.util.List;


public class Filter1 {

	public static void main(String[] args) {
		
		List<String> li = new ArrayList<String>();
		li.add("vinyak");
		li.add("viraj");
		li.add("sahil");
		li.add("namrata");
		li.add("Raj");
		
		 //print names starts with "vi"
		li.stream().filter((i)->{return i.startsWith("vi");}).forEach((i)->{System.out.println(i);});
		
		System.out.println("************************");
		
		//print names starts with "vi" in uppercase
		li.stream().filter((i)->{return i.startsWith("vi");}).forEach((i)->{System.out.println(i.toUpperCase());});
	}

}
