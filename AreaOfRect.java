import java.util.Scanner;
public class AreaOfRect {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length:");
        float length=sc.nextFloat();
        System.out.print("Enter bredth:");
        float breadth=sc.nextFloat();
        sc.close();
        System.out.printf("area of rectangle="+length * breadth);
    }
}
