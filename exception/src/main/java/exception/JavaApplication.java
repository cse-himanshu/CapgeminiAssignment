/**
 * 
 */
package exception;

/**
 * 
 */
public interface JavaApplication {
	public static void execution() {
		int i = 10;
		System.out.println(i);
		int j = 0;
		System.out.println(j);

		try {		
			int k = i / j;
			System.out.println(k);
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}	
