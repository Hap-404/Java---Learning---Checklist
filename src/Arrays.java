public class Arrays {
    public static void main(String[] args) {

//        int[] arr = {1,2,3,4};
//        int[] arr2 = new int[3];
//        System.out.println(arr2[0]);
//        // traversing an array
//        for(int i = 0; i< arr.length; i++){
//            System.out.println(arr[i]);
//        }
//        System.out.println(arr); //prints the hash code of the array not the values of the array

        //for each loop
//        for (int i: arr){
//            System.out.println(i);
//        }

        //Searching an element:

//        int[] arr = {-101,-34,-98,-45,-23,-52,-69,-2};
//        for(int i : arr){
//            if(i == 69) {
//                System.out.println("Found");
//            }
//        }

        //finding maximum element;

//        int max = arr[0];// we can use Negative Infinity also here as Integer.MIN_VALUE
//        for(int i: arr){
//            if(i > max){
//                max = i;
//            }
//        }
//        System.out.println(max);
//

        //Reverse printing an array:
//        for (int i = arr.length - 1; i >= 0 ; i--) {
//            System.out.print(arr[i] + " ");
//        }

        //sum of array
//        int sum = 0;
//        for(int i : arr){
//            sum+=i;
//        }
//        System.out.println(sum);

        //2D arrays :

        int[][] arr = new int[3][3];
        int[][] nums = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        //jagged arrays <- to be learned


    }
}
