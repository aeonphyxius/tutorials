package Java;

public class DibujarA{

    private static final int AHORIZONTAL = 12;
    private static final int AVERTICAL = 6;

    public static void main (String args[]){
        String display = "";

        for (int i = 0; i < AVERTICAL; ++i){
            for (int j = 0; j < AHORIZONTAL; ++j){
                if ( i == 0 && j == AHORIZONTAL / 2){
                    display += "*";
                }
                else if ( i>0 &&  ( j == (AHORIZONTAL / 2 - i ) || j == (AHORIZONTAL / 2 + i )) ){
                    display += "*";
                }
                else if ( i == AVERTICAL / 2  &&  j > AHORIZONTAL / 2 - i &&  j < AHORIZONTAL / 2 + i ) {
                    display += "*";
                }
                else{
                    display += "_";
                }
            }
            display += "\n";
        }

        System.out.println(display);
    }
}

/*

_____*______  
____*__*____ 
___*____*___ 
__********__
_*________*_
*__________*        

______*______
_____*_*____
____*___*___
___*_____*__
__*_______*_
_*_________*

*/