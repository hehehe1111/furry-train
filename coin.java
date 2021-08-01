
public class coin {
	
	public static String sideup;

	public static void main(String[] args) {
		int headcount=0;
		int tailcount=0;
		
		for(int i =0 ;i<20;i++) {
			toss();
			if(getsideUp().equals("Head")) {
				headcount++;
			}else if(getsideUp().equals("Tail")) {
				tailcount++;
			}
		}
		
		System.out.println("Total head :" +headcount);
		System.out.println("Total tail :" +tailcount);

	}
	public static void toss() {
		int Random = (int) (2 * Math.random() + 1);
		if (Random % 2 == 0) {
			sideup = "Head";
		} else {
			sideup = "Tail";
		}
	}
	public static String getsideUp() {
		System.out.println(sideup);
		return sideup;
		
	}
}
