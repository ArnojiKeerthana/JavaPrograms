class TotalAverage {
static int num1, num2;
static int total;
static float average;
static void CalculateTotal() {
total = num1 + num2;
}
static void CalculateAverage() {
average = total/2.0f;
}
public static void main(String args[]) {
if (args.length<2) {
System.out.println("Error: Provide two numbers as arguments");
return;
}
num1 = Integer.parseInt(args[0]);
num2 = Integer.parseInt(args[1]);
CalculateTotal();
CalculateAverage();
System.out.println("First number:" +num1);
System.out.println("Second number:" +num2);
System.out.println("Total:" +total);
System.out.println("Average:" +average);
}
}
