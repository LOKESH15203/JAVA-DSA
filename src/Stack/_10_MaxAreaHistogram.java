package Stack;
import java.util.*;

public class _10_MaxAreaHistogram {

    public static double area(int arr[]){

        int l = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>l){
                l = arr[i];
            }
        }
        double area = l*1;
        System.out.println("The area is " + area + "sqr. units");
        return area;
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 2, 3};
        System.out.println(area(arr));
    }
}
