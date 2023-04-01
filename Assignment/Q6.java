
	package Assignment;

	public class Q6 {
		
		public static void main(String[] args) {
			
			int rows = 4;
	        int number = 1;
			
			//outer loop
			for(int i = 0; i < rows; i++) {
				//inner loop
				for(int j = 0; j <= i; j++) {
					System.out.print(number + " ");
					number++;
				}
				System.out.println();
			}
		
		}
	}


