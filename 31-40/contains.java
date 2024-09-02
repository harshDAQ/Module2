public class contains {
    public static void main(String[] args) {
        String a = "Hello there";
        String b = "there";

        boolean contains = a.contains(b);

        if(contains){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
