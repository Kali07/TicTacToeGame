public class Gamer {

    public boolean play(int x, int y, char c, Case[][] grille){
        if((x>=0) && (x<3)){
            if((y>=0) && (y < 3)){
                if(grille[x][y].getValue() == ' '){
                    grille[x][y].setValue(c) ;
                    return true;
                }
            }
        }
    return  false;
    }

    //changer de joueur
    public char changeValue(char c) {
        if (c == 'x') {
            c = 'o';
            return c;

        }
        else{
            c = 'x';
            return  c;
        }
    }

}
