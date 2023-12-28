package Strings.Questions11Nov;

public class PrintLastWord
{
    public static String countSpace(String str){
        String res="";
        int countSpace=0;
        for (int i=str.length()-1;i>=0;i--){
            if (str.charAt(i)==' '){
                countSpace++;
                if (countSpace==2){
                    break;
                }
            }
            if (countSpace==1){
                res=str.charAt(i)+res;

            }
        }
        return res;
    }

    public static void main(String[] args) {
        String str="My name is neeraj verma";
        System.out.println(countSpace(str));
    }
}
