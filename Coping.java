public class Coping {
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        int []a2 = new int[5];
        for (int i = 0; i < a.length; i++) {
            a2[i]=a[i];
            int []c={1,2,3};
            int []d=new int [10];
            System.arraycopy(c,0,d,0,c.length);
            for (int j = 0; j <3 ; j++) {
                System.out.println("coping"+d[j]);

            }

        }

    }
}
