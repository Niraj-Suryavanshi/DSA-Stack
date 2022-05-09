package stack;
import java.util.Stack;

public class LargestHistogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,2,1,5,6,3,2,4,2};
		int area=maxArea(a);
		System.out.println("Largest Histogram Area is:"+area);

	}

	private static int maxArea(int[] a) {
		// TODO Auto-generated method stub
		int maxAns=0;
		int ps[]=prevSmaller(a);
		int ns[]=nextSmaller(a);
		
		for(int i=0;i<a.length;i++)
		{
			int cur=(ns[i]-ps[i]-1)*a[i];
			maxAns=Math.max(maxAns, cur);
		}
		
		return maxAns;
	}
	
	private static int []prevSmaller(int a[])
	{
		int ps[]=new int[a.length];
		Stack<Integer>s=new Stack<>();
		for(int i=0;i<a.length;i++)
		{
			while(!s.isEmpty()&&a[s.peek()]>=a[i])
			{
				s.pop();
			}
			if(s.isEmpty())
			{
				ps[i]=-1;
			}
			else
			{
				ps[i]=s.peek();
			}
			s.push(i);
		}
		return ps;
	}
	
	private static int[] nextSmaller(int a[])
	{
		int ns[]=new int[a.length];
		Stack<Integer>s=new Stack<>();
		for(int i=a.length-1;i>=0;i--)
		{
			while(!s.isEmpty()&&a[s.peek()]<=a[i])
			{
				s.pop();
			}
			if(s.isEmpty())
			{
				ns[i]=-1;
			}
			else
			{
				ns[i]=s.peek();
			}
			s.push(i);
		}
		return ns;
	}

}
