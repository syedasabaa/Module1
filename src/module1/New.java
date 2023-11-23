package module1;

public class New {
//BREAK AND CONTINUE
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		while(true) {
			if(i==3) {
				i=i+1;
				continue;
			}
			System.out.println(i);
			i=i+1;
			if(i>5) {
				break;
			}
		}

	}

}
