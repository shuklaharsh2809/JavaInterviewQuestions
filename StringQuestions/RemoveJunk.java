public class RemoveJunk {
    public static void main(String[] args) {
        String s = "This is a string with junk characters!@#$%^&*()";

        //Use Regular Expression : [^a-zA-Z0-9]
        s = s.replaceAll("[^a-zA-z0-9]", "");
        System.out.println(s);
    }
    
}
