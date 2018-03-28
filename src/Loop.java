
public class Loop {
	public void loop(){
		long total = 0;
	      for (int i = 0; i < 10000000; i++) {
	         total += i;
	      }
	}
	
	public void loop2(){
		int total=0;
		while(total<10000000){
			total++;
		}
	}
}
