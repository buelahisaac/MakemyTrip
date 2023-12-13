package String;

public class String_Concepts {
	public static void main(String[] args) {
		System.out.println("=======Immutable=======");
		String s="API";
		String s1="API";
		String s2="Testing";
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		s=s+s2;
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
		
		System.out.println("=======Mutable=======");
		StringBuffer sb=new StringBuffer("API");
		StringBuffer sb1=new StringBuffer("API");
		StringBuffer sb2=new StringBuffer("Testing");
		
		System.out.println(System.identityHashCode(sb));
		System.out.println(System.identityHashCode(sb1));
		System.out.println(System.identityHashCode(sb2));
		
		sb=sb.append(sb2);
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		
		//Mutable-string builder
		
		StringBuilder sbb=new StringBuilder("API");
		
		//Non-literal
		String str=new String("API");
		
		int i=10;
		
		int[] l=new int[5];
		l[0]=10;
		l[1]=20;
		l[2]=30;
		l[3]=40;
		l[4]=50;
		
		
		
		
		}
}
