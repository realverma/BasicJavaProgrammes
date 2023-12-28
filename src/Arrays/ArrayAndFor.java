package Arrays;

public class ArrayAndFor
{
    public static void main(String[] args) {
        String superHero[]=new String[5];
        superHero[0]="Hulk";
        superHero[1]="Thor";
        superHero[2]="Iron Man";
        superHero[3]="Captain America";
        superHero[4]="Abhishek";

        // In forward Direction
        for (int i=0;i<=4;i++){
            System.out.println(superHero[i]);
        }

        // In backward Direction
        System.out.println();
        for (int i=4;i>=0;i--){
            System.out.println(superHero[i]);
        }



        // 2

        int num[]=new int[7];
        num[0]=44;
        num[1]=54;
        num[2]=6;
        num[3]=21;
        num[4]=-22;
        num[5]=100;
        num[6]=578;

        //Forward
        for(int i=0;i<=6;i++){
            System.out.println(num[i]);
        }
        System.out.println();
        //backward
        for(int i=6;i>=0;i--){
            System.out.println(num[i]);
        }

        System.out.println();

        double deciNums[]=new double[7];
        deciNums[0]=5.4;
        deciNums[1]=6.6;
        deciNums[2]=88.6;
        deciNums[3]=4.6;
        deciNums[4]=5.6;
        deciNums[5]=7.8;
        deciNums[6]=1.1;
        //Forward
        for(int i=0;i<=6;i++){
            System.out.println(deciNums[i]);
        }
        System.out.println();
        //backward
        for(int i=6;i>=0;i--){
            System.out.println(deciNums[i]);
        }

    }

}
