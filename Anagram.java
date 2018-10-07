import java.util.*;
class Anagram
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String c=sc.nextLine();
String b=sc.nextLine();
if(c.length()==b.length())
{
char[] t=c.toCharArray();
Arrays.sort(t);
char[] g=b.toCharArray();
Arrays.sort(g);
if(Arrays.equals(t,g))
{
	System.out.println("it is a anagram");
}
else
{
	System.out.println("it is not a  angram");
}
}
else{
	System.out.println("it is not anagram");
}
}
}
