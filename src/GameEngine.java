public class GameEngine {
    public int score;
    public int nb_manche;
    Gamer j1;
    Gamer j2;

    Case[][] grille = new Case[3][3];

    public GameEngine(){
        this.score = 0;
        this.nb_manche = 0;

    }

    public void start() {
        //là où on va commencer notre jeu
        GraphicEngine.display(grille);
    }

    public void evolution()
    {
        GraphicEngine.showGrille(grille);
    }

    public void generateGrid(Case[][] grille){
        int i;
        int j;
            for(i=0; i < 3; i++){
                for(j=0; j < 3; j++){
                    grille[i][j] = new Case();
                }
                System.out.print("\n");
            }
    }
//verifie si tous les champs sont remplis (le jeu s'arrete)
    public boolean CaseIsFull(Case[][] grille){
        boolean fulltab = true;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(grille[i][j].getValue()==' '){
                    fulltab = false;
                }
            }
        }
        return fulltab;
    }

    //Regarde si les valeurs de 3 cases sont identiques et non vide
    private   boolean CheckRandC(char a, char b, char c){

            return ((a!= ' ') && (a == b) && (b==c));
        }

        //regarder si une meme ligne est identique
        public boolean checkRow(Case[][] grille){
        for(int i=0; i<3; i++) {
            if (CheckRandC(grille[i][0].getValue(), grille[i][1].getValue(), grille[i][2].getValue()) == true) {
                return true;
            }
        }
        return false;

        }

    //regarder si une meme colonne est identique
    public boolean checkCol(Case[][] grille){
        for(int i=0; i<3; i++) {
            if (CheckRandC(grille[0][i].getValue(), grille[1][i].getValue(), grille[2][i].getValue()) == true) {
                return true;
            }
        }
        return false;

    }
    //regarder si une diagonale est identique
    public boolean checkDiago (Case[][] grille){
            return ((CheckRandC(grille[0][0].getValue(), grille[1][1].getValue(), grille[2][2].getValue()) == true)
            || (CheckRandC(grille[0][2].getValue(), grille[1][1].getValue(), grille[2][0].getValue()) == true));

            }

    //ensuite une fonction publique QUI appelle tout ça en une fois
    /*public boolean checkVictory(){
        return (checkCol(Case[][] grille));
    }*/
}


