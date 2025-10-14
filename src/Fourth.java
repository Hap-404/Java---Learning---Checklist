public class Fourth {
    public static void main(String[] args) {
        //Strings and its methods
//        String name = "Harsh"; //sequence of Characters
//        String address = new String("India");
//
//
//        int a = 1;
//        Integer b = new Integer(5);
//
//
//        System.out.println(name);
//        System.out.println(address);
//        System.out.println(a);
//        System.out.println(b);
//
//        String x = "Ram";
//        String c = new String(x);
//        String d = new String(x);
//        String e = "Ram";
//        String f = "Ram";
//
//        System.out.println(c == d); //false //we are checking reference not equality
//        System.out.println(e == f); //true
//
         //String Methods:

//        String name = "Harsh Parekh";
//        String name2 = "Amit Parekh";
//
//        int len = name.length();
//        System.out.println(len);
//
//        char c = name.charAt(6);
//        System.out.println(c);
//
//        System.out.println(name.equals(name2));
//
//        System.out.println(name.equalsIgnoreCase("harsh parekh"));
//
//        String str1 = "remote";
//        String str2 = "car";
//
//        int i = str1.compareTo(str2);
//        System.out.println(i);

//        Strings are immutable so string methods create new string and does not applied on original string
            String name = "Amit Sharma";
            String substring = name.substring(5,8); //excludes the 8th index that is last index and shows 5 - 7 only
            System.out.println(substring);

            String name2 = "       Amit Sharma    ";
            System.out.println(name.toUpperCase());
            System.out.println(name.toLowerCase());
            System.out.println(name2.trim()); //remove white spaces

            System.out.println(name2.replace("Sharma","Gupta").toLowerCase());
            System.out.println(name.contains("Sha")); //true

//            name.startsWith();
//            name.endsWith();
//        System.out.println(name.isEmpty()); //false

            System.out.println(name.indexOf("a"));
            System.out.println(name2.lastIndexOf("h"));

            int a = 10;
        System.out.println(String.valueOf(a));
//        name.format();
//        name.subSequence();
















    }
}
