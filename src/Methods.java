public class Methods {

    public static void main(String[] args) {
        int[] a = {12,434,35,23,53,75};
        int z = sumOfArray(a);
        System.out.println(z);

        System.out.println(convertString("           Harsh          "));
        int b = sum(1,2,4,5);
        System.out.println(b);
        boolean c = isPrime(97);
        System.out.println(c);

    }

    //Methods: If we want to do some task repeatedly instead of writing it we can its method and call it whereever we want to use it
    //Syntax : access-modifier return-type method-name(parameters) {
    //  Method body;
    // }

    //see the bob part again


    public static int sumOfArray(int[] arr ){
        int res = 0;
        for(int i : arr){
            res+=i;
        }
//        System.out.println(res);
        //since print statement is used we are not using return statement
        //to use that we should change return type to int
        return res;

    }

    //Method to convert string into upper case and remove white spaces
    private static String convertString(String s){
        return s.trim().toUpperCase();

    }

    //Method Overloading:
    //1.No of parameters different //Method Signature
    //2.Type of parameters are different
    //3.

    private static int sum(int a, int b){
        return a+b;
    }

    private static int sum(int a, int b, int c){
        return a + b + c;
    }

    private static int sum(int... a){ //variable number of arguments
        int sum = 0;
        for(int i : a){
            sum+=i;
        }
        return sum;
    }

    public static boolean isPrime(int x){
        for(int i  = 2 ; i * i < x; i++){
            if(x % i == 0) {
                return false;
            }
        }
        return true;
    }


}

