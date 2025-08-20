package Array;

public class HtmlSorting {
    public static void main(String[] args) {
        int arr[]={99,22,44,66,77,88,11,33,55};
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (arr[i]<arr[j]){
                    int g=arr[i];
                    arr[i]=arr[j];
                    arr[j]=g;
                }
            }

        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
