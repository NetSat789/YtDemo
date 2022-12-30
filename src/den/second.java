package den;

public class second 
{
public static void main(String[] args)
{
	int ornum=658;
	int revnum=0;
   for (int i=ornum;i>0;i=i/10)
   {
	   
	int rem=i%10; 
	revnum=(revnum*10)+rem;
	
   }
   
   System.out.println(revnum);

	
}
}
