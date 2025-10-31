package generic;

public class Two {

	public static void main(String[] args) {
		Addition<Integer> a1 = new Addition();
		
		a1.add(10);

	}

}

interface Iadd <T> {
	void add(T t);
}

class Addition<T> implements Iadd<T>{

	
	

	@Override
	public void add(T t) {
		System.out.println(t);
		
	}
	
}
