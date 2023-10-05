package fletning;

import Opgave2.myThread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestFlettesortering {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Random r=new Random();
		for (int i=0;i<10000000;i++) {
			list.add(Math.abs(r.nextInt()%10000));
		};
		List<Integer> list1 = list.subList(0, list.size() / 2);
		List<Integer> list2 = list.subList(list.size() / 2, list.size());
		FletteSortering sort = new FletteSortering();

		//opdel listen i to dele
		myThread thread1 = new myThread(sort, list1, 0, list1.size() - 1);
		myThread thread2 = new myThread(sort, list2, 0, list2.size() - 1);

		thread1.start();
		thread2.start();

		try{
			//vent på, at begge tråde er færdige
			thread1.join();
			thread2.join();
		}                   catch (InterruptedException e) {
			e.printStackTrace();
		}


		
		//beregn og udskriv den totale køretid

		long l1,l2;
		l1 = System.nanoTime();
		
		l2 = System.nanoTime();
		System.out.println();
		System.out.println("Køretiden var " + (l2-l1)/1000000);
		System.out.println();



	}

}
