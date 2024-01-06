package String;

public class StringBuffers {
    public static void main(String[] args) {
        String str = "Deep";
        StringBuffer sb1 = new StringBuffer(str);
        System.out.println(sb1);


        StringBuffer sb2 = new StringBuffer("Deepooo");
        String str2 = sb2.toString();
        System.out.println(str2);
    }
}
