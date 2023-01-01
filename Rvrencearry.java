import java.util.Arrays;

public class Rvrencearry {

        public static void main(String[] args) {
            int x[]={11,12,13,14,15};
            System.out.println(Arrays.toString(x));
            reverse(x);

        }
        public static void reverse(int a[])
        {int n=a.length-1;
            for (int i = 0; i < a.length/2; i++) {
                int temp=a[i];
                a[i]=a[n];
                a[n]=temp;
                n--;

            }
        }}



}
