package lambda;

public class Lamda2 {

	public static void main(String[] args) {
		
		I_Name<String> nam1 = (i, j)->{return "Hello! " + i + j ;};
		System.out.println(nam1.name("Vinayak", "kumkar"));
		
		
		
		I_Name<String> nam2 = (i, j)->{return i + "is my name and " + j + " is my family name";};
		System.out.println(nam2.name("Vinayak", "Kumkar"));
		
		
		
		I_Name<Integer> nam3 = (i, j)->{
			if(i % 2 == 0)return 1;
			return 0;
		};
		
		System.out.println(nam3.name(11, null));
		
		
		
		I_Name<Integer> nam4 = (i, j)->{
			if(i % 2 == 0 && j % 2 == 0)return  1; 
			return 0;
		};
		
		System.out.println(nam4.name(12, 24));
		
		
		
		I_Name<String> nam5 = (i, j)->{
			if(i.length() > 2)return "length is greater than 2";
			return "length is less than 2";
		};
		
		System.out.println(nam5.name("vinayak", null));
		
		
		
		I_Name<String> nam6 = (i, j)->{
			if(i.length() == j.length()) {
				return "both strings has equal length";
			}
			return "not equal length";
		};
		
		System.out.println(nam6.name("naman", "bsdim"));
   } 

}



interface I_Name<T> {
	
	public T name(T t1, T t2);
	
}