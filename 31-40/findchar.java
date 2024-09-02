import java.util.Scanner;
class findchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Ogstring = "Java Exercises!";
        System.out.println("Enter index: ");
        int index = sc.nextInt();
        System.out.println("Character at index " + index + " is " + Ogstring.charAt(index));
        sc.close();
    }
}