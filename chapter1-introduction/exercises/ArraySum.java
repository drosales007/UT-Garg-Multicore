import java.util.concurrent.*;

public class ArraySum {

	static ExecutorService exec = Executors.newCachedThreadPool();
	static int sum(int[] a) throws InterruptedException, ExecutionException {
		// TODO
	}
	static class SumTask implements Callable<Integer> {
		int[] a; int start; int size;
		public SumTask(int[] a, int start, int size) {
		// TODO
			
		}
		public Integer call() throws InterruptedException, ExecutionException {
		// TODO
		}
	}
	public static void main(String[] args){
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		
		try {
			int answer = ArraySum.sum(a);
			System.out.println("The sum is " + answer);
		}
		catch (Exception e) { System.err.println(e);}

	}
}
