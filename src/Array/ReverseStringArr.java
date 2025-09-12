package Array;

public class ReverseStringArr {
    public static void main(String[] args) {
        String arr[]={"a","b","c","d","e","f"};
        args=arr;
        for (int i= arr.length-1;i>=0;i--){
            System.out.print(" " +arr[i]);
        }
    }
}
