package revANum;

public class Main {
	public static void main(String[] args) {
		int V=123;
		StringBuilder sb = new StringBuilder(Integer.toString(V));
		//sb.append(V);
		sb.reverse();
		V=Integer.parseInt(sb.toString());
		System.out.println(V);
	
		
//		int p=124;
//		Integer.reverse(p);
//		System.out.println(p);
//	
	
	}
	
	
	

}
