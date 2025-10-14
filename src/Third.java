public class Third {
    public static void main(String[] args) {
//        int a = 5;
//        System.out.println(Integer.toBinaryString(a)); //101
        //operands  --> byte short int long
        //operators :
        // and //or //xor //not //left shift //right shift //unsigned right shift

        int  a = 5 & 4;
        System.out.println(a); // 101 & 100 = 100 => 4

        int b = 5 | 7;
        System.out.println(b); // returns 7

        int c = 5 ^ 4;
        System.out.println(c); // returns 1 => 101 ^ 100 => 001 -> 1

        int d = 5;
        int result = ~d;
        System.out.println(result); //returns -6

        int res = a << 1; //left shift the bits by 1 place
        System.out.println(res); // returns 8 that is 1000
        System.out.println(Integer.toBinaryString(res));

        int res2 = a >> 1; //right shifts the bits by 1(n) place
        System.out.println(res2); // returns 10 that is 1010
        System.out.println(Integer.toBinaryString(res2));

        int res3 = a >>> 2 ;



    }
}
