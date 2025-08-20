package Array;

public class SortingArr {
    public static void main(String[] args) {
        int arr[]={9,7,5,3,2,1,4,6,8};
        for (int i=0;i<arr.length;i++){


            for (int j=0;j<arr.length;j++){


                if (arr[i]<arr[j]) {
                    int tem = 0;
                    tem = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tem;
                }
            }
        }
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
