import java.util.Scanner;
class Maximum {
Scanner s=new Scanner(System.in);
String n=s.next();
String m=s.next();
void largest() {
	if(Integer.parseInt(n)>Integer.parseInt(m)) {
		System.out.println(n+" is Bigger");
	}
	else {
		System.out.println(m+" is Bigger");
	}
}
}
class B{
	public static void main(String[] args) {
		System.out.println("Enter Two Numbers : ");

Maximum M=new Maximum();
M.largest();
	}
}