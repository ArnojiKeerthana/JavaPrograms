class ArrayManipulation {
public static void main(String args[]) {
int arr[]= {10,20,30,40,50};
int sum=0;
System.out.println("Array elements:");
for(int i=0;i<arr.length;i++) {
System.out.println("arr["+i+"]="+arr[i]);
sum=sum+arr[i];
}
double average = (double)sum/arr.length;
System.out.println("\nSum of Array Elements=" +sum);
System.out.println("Average of Array Elements=" +average);
arr[2]=100;
System.out.println("\nArray After Manipulation:");
for (int i=0;i<arr.length;i++) {
System.out.println("arr["+i+"]="+arr[i]);
}
}
}  