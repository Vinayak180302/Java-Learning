package queueif;

import java.util.PriorityQueue;
import java.util.Queue;


/*PriorityQueue - 
 *    Storage Order
 * - does not store element in sorted order
 * - internally used heap DS which insure smallest element only at front
 * - other elements can be of any order
 * 
 *    Removal Order
 * - when you remove element, it remove in natural order(ascending)
 * 
 * 
 * 
 * */
public class Priority1 {

	public static void main(String[] args) {
		
		Queue<Integer> q1 = new PriorityQueue<Integer>();
		
		q1.add(1);
		q1.add(5);
		q1.add(4);
		q1.add(6);
		q1.add(12);
		q1.add(15);
		q1.add(45);
		
		System.out.println(q1);
		System.out.println(q1.remove());
		System.out.println(q1);
		System.out.println(q1.remove());
		System.out.println(q1);
		
		PriorityQueue<Integer> q2 = new PriorityQueue<Integer>(2);
		q2.add(1);
		q2.add(5);
		q2.add(4);
		System.out.println(q2);
	}

}
