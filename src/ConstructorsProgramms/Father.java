package ConstructorsProgramms;

import java.io.IOException;

class Father
{
    Father() throws IOException {
        System.out.println("Father Class Constructor");
    }
    Father(int x){
        System.out.println("Argument Const");
    }
}
