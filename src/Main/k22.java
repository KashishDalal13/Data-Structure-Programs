package Main;

public class k22 {
    public static void main(String[] args) {
        String string1 = "Python";
        int s = 3;
        if (s > string1.length()) {
            s = string1.length();
        }

        String subpart = string1.substring(string1.length() - 3);
        System.out.println(subpart + string1 + subpart);
    }
}
