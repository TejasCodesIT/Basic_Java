package Numbers;

public class BubbleSort {
	
	
	public static void main(String[] args) {
		
		
		int[] array = {5,6,1,3};
		
		for(int i=0;i<array.length-1;i++) {
			
			for(int j= 0;j<array.length-1-i;j++) {
				
				if(array[j]>array[j+1]) {
					int num = array[j+1];
					array[j+1]=array[j];
					array[j]=num;
					
				}
						
				
			}
			
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			
		}
		
	}

}
