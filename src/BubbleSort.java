import java.util.Scanner;

//bubble sort
public class BubbleSort {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int size = scanner.nextInt();
	int[] ar = new int[size];
	for(int i=0;i<ar.length;i++) {
		System.out.println("enter a array element:");
		ar[i] =  scanner.nextInt();
	}
	System.out.println("Given array:");
	for(int i:ar) {
		System.out.print(i+" ");
	}
	
	for(int i=0;i<ar.length;i++) {
		for(int j=1;j<ar.length-i;j++) {
			if(ar[j]<ar[j-1]) {
				int temp = ar[j];
				ar[j]=ar[j-1];
				ar[j-1]= temp;
			}
			}
		}
	System.out.println();
	System.out.println(" sorted array :");
	for(int i:ar) {
		System.out.print(i+" ");
	}
	}
}

