package EX051_ARRAYTEST1;

public class ArrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []	s	=	new int[10];
		
		for (int i=0;i<s.length;i++) {
			s[i]	=	i;
		}
		
		for (int i=0;i<s.length;i++) {
			System.out.print(s[i]+" ");
		}
		
	}

}
