import java.util.Scanner;
public class text{
	public static void main(String[] args){
		int[] arr ;
		Scanner sc = new Scanner(System.in);
		System.out.println("how many element will you add ");
		int a = sc.nextInt();
		System.out.println("enter the element");
		for(int i =0 ; i<a;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("display the element");
		for(int i =0 ; i<a;i++){
			System.out.println(arr[i]);
		}
	}
}