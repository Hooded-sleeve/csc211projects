public class slowshuffle{

	public static void main(String[] args){
		int N=10;
		int [] shuffled = new int[N];
		boolean[] isNotPresent = new boolean[N+1];
		
		for (int i = 1; i<=N; i++){
			isNotPresent[i] = true;
			}
			
			int i = 0;
			
			while (i<N-1){
				int r = (int)(Math.random()*N) + 1;
				
				if (isNotPresent[r]){
				
					shuffled[i] = r;
					isNotPresent[r] = false;
					i++;
					
					}
					
			}
		 for (int k = 1; k <= N; k++) {
            if (isNotPresent[k]) {
                shuffled[N - 1] = k;
                break;
            }
        }

		
		

		for (int k = 0 ; k< N ;k++){
					System.out.print(shuffled[k] + " ");
			}
	}
}