package Strings;

public class Password
{
//    Conditions
//    1. length>=8
//    2. Starts with number
//    3. Minimum 1 uppercase
//    4. exactly one special character
//        return Strong if all conditions are satisfied otherwise return Weak
    public static String checkPassword(String str){
        if (str.length()<8){
            return "Weak";
        }
        if (!(str.charAt(0)>=48 && str.charAt(0)<=57)){
            return "Weak";
        }

        int countUpper=0,countSpecial=0;
        for (int i=1;i<=str.length()-1;i++){
            if (str.charAt(i)>=65 && str.charAt(i)<=90){
                countUpper++;
            }
            if (!(str.charAt(i)>=65 && str.charAt(i)<=90 || str.charAt(i)>=97 && str.charAt(i)<=122 || str.charAt(i)>=48 && str.charAt(i)<=57)){
                countSpecial++;
            }
        }

        if (countUpper>=1 && countSpecial==1){
            return "Strong";
        }
        return "Weak";
    }

    public static void main(String[] args) {
        String str="1abc@MKabc";
        System.out.println(checkPassword(str));
    }
}
