public class Patterns {
    public static void main(String[] args) {
        //Pattern1 : https://static.takeuforward.org/wp/uploads/2022/08/P1.png
//        for(int i = 0 ; i<5;i++){
//            for (int j = 0;j<5;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //Pattern2 : https://static.takeuforward.org/wp/uploads/2022/08/P2.png
//        for(int i = 0; i<=5; i++){
//            for(int j = 0; j<i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //Pattern3 : https://static.takeuforward.org/wp/uploads/2022/08/P3.png
//        for(int i = 1; i<=5; i++){
//            for(int j = 1; j<=i;j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

        //Pattern4 : https://static.takeuforward.org/wp/uploads/2022/08/P4.png
//        for(int i = 1; i<=5; i++){
//            for(int j = 1; j<=i;j++){
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }

        //Pattern5:
        for(int i = 5;i>=0;i--){
            for (int j = 5; j >i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
