package root1;

public class _01_refresh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for문
	for(var i = 1; i < 6; i++) {
		System.out.println(i + " ");
		
	}
	System.out.println("-------------------------");
	//while문
	int num = 1;
	while(num < 6) {
		System.out.println(num + " ");
		num++;
	}
	
	System.out.println("---------------------");
	//do while문
	 int j = 1;
	 do {
		 System.out.println(j + " ");
		 j++;
		 
	 } while(j < 6);
	
	 System.out.println("-------------------------");
	 
	  
	int n = 10;
	int sum = 0;
	
		for (var i = 1; i <= n; i++) {
			//if(i % 2 == 0) {
				//sum += i;
				//System.out.println(i + "--" + sum + " ");
				
		
			//}
		//}
			if ( i % 2 == 1) {
				continue;
			}
			sum += i;
			System.out.println(i + "----" + sum + " ");
	
	
	
	
	
	}

}} 
