package DSA150JAVA;

public class Rotatearray {
    // 10.Rotate array by K positions
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8,9};
     int k=4;
int n =arr.length;
int temp[]=new int[n];
for(int i=0; i<n; i++){
    temp[(i+k)%n]=arr[i];

}
for (int i : temp) {
    System.out.print(i+" ");
    
}


    }
    
}
