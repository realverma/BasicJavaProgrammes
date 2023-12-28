package Strings;

public class rr999999
{
//    remove couples
//    ->aaabbdc
//    ->abbdc
//    ->adc
    public static String balance(String str){
        for (int i=1;i<=str.length()-1;i++){
            if (str.charAt(i)==str.charAt(i-1)){
                str=str.substring(i+1);
            }
        }
        return str;
    }
    public static void main(String[] args) {
        String str="aabb";
        System.out.println(balance(str));
    }
}
