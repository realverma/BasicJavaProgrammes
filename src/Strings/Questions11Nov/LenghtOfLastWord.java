package Strings.Questions11Nov;

public class LenghtOfLastWord
{
    public static int countSpace(String str){
        int count=0;
        for (int i=str.length()-1;i>=0;i--){
            if (str.charAt(i)!=' '){
                count++;
            }
            else return count;
        }
        return count;
    }

    public static void main(String[] args) {
        String str="My name is neeraj verma";
        System.out.println(countSpace(str));
    }
}
