package easy;
	
/**
 * Java program to calculate sum of two number without using addition or subtraction
 * operator in Java. This solution, use bitwise and bitshift operator instead of maths operator.
 */
public class AddTwoNumbers {    
    /*
     * Adding two number without using + or plus arithmetic operator using
     * recursion in Java. This method uses XOR and AND bitwise operator to
     * calculate sum of two numbers
     */
    public static int add(int a, int b) {
        if (b == 0) return a;
        int sum = a ^ b; // SUM of two integer is A XOR B
        int carry = (a & b) << 1;  // CARRY of two integer is A AND B
        return add(sum, carry);
    }
 
    /*
     * Adding two integers without any arithmetic operator and using recursion.
     * This solution also uses XOR and AND bitwise and << left shift bitshift
     * operator
     */
    public static int add2(int a, int b) { 
        while (b != 0) {
            int carry = (a & b) ; //  CARRY is AND of two bits
            a = a ^ b; // SUM of two bits is A XOR B          
            b = carry << 1; // shifts carry to 1 bit to calculate sum
        }
        return a;
    }
    
    public static void main(String args[]) {
        System.out.println(" Sum of 110 add 200 is : " + add(110, 200));
        System.out.println(" Sum of 0 and 0 is : " + add(0, 0));
        System.out.println(" Sum of -10 and +10 is : " + add(-10, 10));
        System.out.println(" Sum of -10 + 200 is : " + add(-10, 200));
        System.out.println(" Sum of 0 + 200 is : " + add(0, 200));
        System.out.println(" Sum of 110 add 200 is : " + add2(110, 200));
        System.out.println(" Sum of 0 and 0 is : " + add2(0, 0));
        System.out.println(" Sum of -10 and +10 is : " + add2(-10, 10));
        System.out.println(" Sum of -10 + 200 is : " + add2(-10, 200));
        System.out.println(" Sum of 0 + 200 is : " + add2(0, 200));
     }
}
