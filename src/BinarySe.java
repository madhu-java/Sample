import java.util.Scanner;

public class BinarySe {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int[] ar = {1,2,3,4,5,6,7,8,9,10};
	System.out.println("Enter te key to search:");
	int key = scanner.nextInt();
	int low =0;
	int high = ar.length-1;
	while (low<=high) {
	 int mid =(low+high)/2;
	 if(key == ar[mid]) {
		 System.out.println(key + " found at "+mid+" index");
		 break;
	 }else if(key < ar[mid]) {
		 high = mid-1;
	 }else if(key>ar[mid]) {
		 low = mid+1;
	 }
	}
	if(low>high) {
		System.out.println(key+" not found");
	}
	
	}
}
