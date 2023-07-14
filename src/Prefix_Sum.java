import java.util.Scanner;

public class Prefix_Sum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int array[]=new int[n];
        for (int i=0;i<n;i++){
            array[i]=scan.nextInt();
            if(i>0){
                array[i]=array[i]+array[i-1];
            }
            System.out.println(array[i]);

        }
    }
}
