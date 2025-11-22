package lambda;

public class Lambda1 {

	public static void main(String args[]) {
		
		I_add<Integer> add = (i, j)-> {return i + j ;};
		
		System.out.println(add.addition(5, 10));
		
		
		I_add<Double> add1 = (i, j)-> {return (i * 10) + (j * 10);};
		
		System.out.println(add1.addition(5.00, 10.00));
		
		
		
		I_add<String> add2 = (i, j)-> (i + j);
		
		System.out.println(add2.addition("50", "200"));
		
		
		
		I_add<Integer> add3 = (i, j)-> {
		if(i>j)return i + j;
		return 0;
		};
		
		System.out.println(add3.addition(10, 50));
		
		
		
		I_add<String> add4 = (i, j)->{return i + " " + j;};
		
		System.out.println(add4.addition("Vinayak", "Kumkar"));
		
		
		
		I_add<Double> add5 = (i, j)-> {return (i + j) * 10;};
		
		System.out.println(add5.addition(10.0, 10.0));
		
		
	
		
	}

}

interface I_add<T> {
	
	public T addition(T t1, T t2);
}
