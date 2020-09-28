public class GraphicEngine {

    //initialiser la grille
    public  static void display(Case[][] grille){
        int i;
        int j;
        System.out.println("--------Start-------");
        for(i=0; i < grille.length; i++){
            System.out.print("|");
            for(j=0; j < grille.length; j++){
               grille[i][j] = null;
                System.out.print(grille[i][j] +"|");
            }
            System.out.print("\n");
        }
        System.out.println("---------------");

    }


    //pour afficher à chaque évolution
    public static void showGrille(Case[][] grille){
        System.out.println("--Others--");
        for(int i=0; i < grille.length; i++){
            System.out.print("|");
            for(int j=0; j < grille.length; j++){
                System.out.print(grille[i][j].getValue() +"|");
            }
            System.out.print("\n");
        }
        System.out.println("-------");

    }

}
