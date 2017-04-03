
public class fibo {
	public static void main(String [] args){
		int [] fibona = new int [25];
		fibona[0] = 0;
		fibona[1] = 1;
		for(int i=0; i<fibona.length; i++){
			fibona[i] = fibona[i-1] + fibona[i-2];
			
		}
		for(int x : fibona){
			System.out.println(x);
		}
	}

}
