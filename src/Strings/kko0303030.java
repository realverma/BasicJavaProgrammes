package Strings;

public class kko0303030 {
// input = a3b4cd2z
    //output= aaabbbbcddz
//    public  static String getIt(String str){
//        String res="";
//        for (int i=1;i<=str.length()-1;i++){
//
//            if (str.charAt(i)>=48 && str.charAt(i)<=57){
//                res=res+concat(str.charAt(i-1),str.charAt(i)-48);
//            }
//        }
//        return res;
//    }
//
//    public static String concat(char ch,int n){
//        String res="";
//        for (int i=1;i<=n;i++){
//            res=res+ch;
//        }
//        return res;
//    }
//    public static void main(String[] args) {
//        System.out.println(getIt("a3b4cd2z"));
//    }



    public  static String getIt(String str){
        String res="";
        for (int i=0;i<=str.length()-1;i++){

            if (str.charAt(i)>=48 && str.charAt(i)<=57){
                    res=res+concat(str.charAt(i-1),(str.charAt(i)-48)-1);
            }
            else {
                res=res+str.charAt(i);
            }
        }
        return res;
    }

    public static String concat(char ch,int n){
        String res="";
        for (int i=1;i<=n;i++){
            res=res+ch;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(getIt("a3b4cd2z"));
    }
}
