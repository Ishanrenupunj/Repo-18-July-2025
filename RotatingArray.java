public class RotatingArray {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        for(int a:arr){
            System.out.print(a+",");
           

        }
         System.out.println();
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
         for(int a:arr){
            System.out.print(a+",");

        }
    }
    
}
