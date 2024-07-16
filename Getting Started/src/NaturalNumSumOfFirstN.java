public class NaturalNumSumOfFirstN {
    public static void main(String[]args){
        int n =10;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
//or we can just use the formula
// System.out.println ( n*(n+1)/2);no need of loop
