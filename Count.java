
public class Count {

    public static int countDown(int n) {

        //print the count numbers
        if (n==1) { 
            System.out.println(1);
            return 0;
        }
        else {
            System.out.println(n);
            return countDown(n - 1);
        }

    }

    public static void main(String[] args) {

        //count
        countDown(5);
    }

}