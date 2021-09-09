package replit;

public class Method_Array05 {
    /*
    Write a java program that calculates the average value of array elements

        input[]= {1,2,3,4,5,6,7}
        Output : 4
     */
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        int sum=0;

        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }
        double ovr= sum/arr.length;
        System.out.println(ovr);
    }


}
