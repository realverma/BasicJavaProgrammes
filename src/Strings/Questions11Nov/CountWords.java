package Strings.Questions11Nov;

public class CountWords
{
    public static int countSpace(String str){

        if (str.length()==0) return 0;
        int count=0;

        for (int i=0;i<=str.length()-1;i++){
            if (str.charAt(i)==' '){
                count++;
            }
        }
        return count+1;
    }

    public static void main(String[] args) {
        String str="My name";
        System.out.println(countSpace(str));
    }

    public static class DisplayLastWord
    {
        public static String displayLastWord(String str){
            String res="";

            for (int i=str.length()-1;i>=0;i--){
                if (str.charAt(i)!=' '){
                    res=str.charAt(i)+res;
                }
                else return res;
            }
            return res;
        }

        public static void main(String[] args) {
            String str="My name is neeraj verma. My friend is Abhishek";
            System.out.println(displayLastWord(str));
        }
    }
}
