package abc;

public class reverse {
    public static void main(String[] args) {
        String name = "abcd";
        String rev = " ";
        for (int i = name.length() - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        System.out.println("original string is"+name);
        System.out.println("Reverse string is" + rev);
    }
}

