package Strings.Questions11Nov;

public class CountSpace
{
    public static int countSpace(String str){
        int count=0;
        int countSpace=0;
        for (int i=str.length()-1;i>=0;i--){
            if (str.charAt(i)==' '){
                countSpace++;
                if (countSpace==2){
                    break;
                }
            }
            if (countSpace==1){
                count++;

            }
        }
        return count-1;
    }

    public static void main(String[] args) {
        String str="My name is neeraj verma";
        System.out.println(countSpace(str));
    }
}
