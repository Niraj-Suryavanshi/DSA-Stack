package stack;
import java.util.Stack;

public class nextSmaller {
	Stack <Integer>s=new Stack<>();
	
	static void nextSmallerElement(int a[],int n)
	{
		 int ar[]=new int[n];
		Stack<Integer>s=new Stack<>();
		for(int i=n-1;i>=0;i--)
		{
			while(!s.isEmpty()&&s.peek()>=a[i])
			{  
				s.pop();
			}
			
			if(s.isEmpty())
			{
				ar[i]=-1;
			}else 
			{
				
				ar[i]=s.peek();
			}
			
			s.push(a[i]);
		}
		for(int i=0;i<ar.length;i++)
			System.out.print(ar[i]+" ");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,6,4,10,2,5};
		int n=arr.length;
		nextSmallerElement(arr,n);
		

	}

}
