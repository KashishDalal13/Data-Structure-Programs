package Main;

public class k11 {
    public static void main(String[] args){
        String str1 = "Python";
        String str2="";
        int len = str2.length();
        String r=" ";
        r+= (str1.length() >= 1) ? str1.charAt(0) : '#';
        r+= (len >= 1) ? str2.charAt(len-1) : '#';
        System.out.println(r);
    }

}
