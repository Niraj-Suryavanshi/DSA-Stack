package stack;
import java.util.Stack;

public class PreviousGreater {
	

	 /*static void previousGreaterElement(int[] arr, int n) {
		System.out.print("_,");
		for(int i=1;i<n;i++)
		{
			int j;
			for( j=i-1;j>=0;j--)
			{
				if(arr[j]>arr[i])
				{
					System.out.print(" "+arr[j]+",");
					break;
				}
			}
			
			if(j==-1)
			{
				System.out.print("_,");
			}
			
		}
		
		
	}*/
	
	static void previousGreaterElement(int a[],int n)
	{
		Stack<Integer>s=new Stack<>();
		for(int i=0;i<n;i++)
		{
			while(!s.isEmpty()&&s.peek()<=a[i])
			{
				s.pop();
			}
			
			if(s.isEmpty())
			{
				System.out.print("-1,");
			}else 
			{
				System.out.print(s.peek()+",");
			}
			
			s.push(a[i]);
		}
	}
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,6,4,10,2,5};
		int n=arr.length;
		previousGreaterElement(arr,n);

	}
}
