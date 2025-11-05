package generic;

public class Three {

	public static void main(String[] args) {
			Iadd1<Integer> i1 = new Addition1();
			
			i1.add(10, 20);		
				 

	}

}

interface Iadd1<T>{
	
   public void add(T t1, T t2);
	
}

class Addition1 implements Iadd1<Integer>{

	@Override
	public void add(Integer t1, Integer t2) {
		int result = t1 + t2;
		System.out.println("addition is " + result);
		
	}
	
	
}