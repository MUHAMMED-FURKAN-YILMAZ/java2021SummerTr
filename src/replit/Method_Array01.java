package replit;

public class Method_Array01 {
    /*
    Write a return method to reverse number.
    Input : 12345
    Output : 54321
     */
    public static void main(String[] args) {
        String str="12345";
        System.out.println(terstenSayi(str));
    }

    private static String terstenSayi(String str) {
    String[] arr =str.split("");
    String terstenStr="";
        for (int i = arr.length-1 ; i >=0 ; i--) {
            terstenStr+=arr[i];
        }
return terstenStr;
    }
}
