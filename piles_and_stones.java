import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		int[] arr=new int[]{a,b,c};
		int[] nums=new int[]{x,y};
		Arrays.sort(arr);
		Arrays.sort(nums);
		if(arr[0]+arr[1]+arr[2]!=nums[0]+nums[1] || (arr[0]>nums[0])|| (arr[1]>nums[1])){
		    System.out.print("No");
		}
		else System.out.print("YES");
		
	}
}
