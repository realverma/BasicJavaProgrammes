package Blocks;

public class Block
{
    static int x=21;
    {
        System.out.println("I am a block");
        int a=45;
        System.out.println(a);
        System.out.println(x);
        x=22;
    }
    {
        System.out.println("I am a block 3");
    }
    Block(){
        System.out.println("I am a constructor");
        System.out.println(x);
        x=23;
        System.out.println(x);
    }
    public static void main(String[] args) {
        Block b1=new Block();
    }
    {
        System.out.println("I am a block 2");
    }
}
