public class Revrnce
{
    public static void main(String[] args) {
        int[]s={1,2,3,4,5};
        int []d=new int[s.length];
        for (int i = 0; i<d.length ; i++) {
            d[i]=s[s.length-1-i];
            System.out.println(i+"is now"+d[i]);

        }

    }
}
