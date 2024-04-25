package JavaBasicCode;

public class RemoveSpecialChar {

    public static void main(String[] args) {
        String s = " My favorite movie is \\\"Raiders of the Lost Ark\\\".";
        s=s.replaceAll("^[a-zA-Z0-9]", " ");
        System.out.println(s);
    }

}
