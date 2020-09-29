import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char debut = 'x';
        char gagnant = ' ';
        Scanner scan = new Scanner(System.in);
        GameEngine new_game = new GameEngine();
        Gamer jeux = new Gamer();
        new_game.start();
        new_game.generateGrid(new_game.grille);

        System.out.println("Tic - Tac - Toe");
        do {
            //new_game.start();
            int x;
            int y;

            do {
                new_game.evolution();
                System.out.println("Entrez vos coordonnez pour le joueur "+ debut);
                x = scan.nextInt()-1;
                y = scan.nextInt()-1;

            }while(!jeux.play(x,y,debut, new_game.grille));
            //changement de joueur
            if(debut == 'x'){
                debut='o';
                gagnant = 'X';
            }else{
                debut = 'x';
                gagnant = 'O';
            }
            //System.out.println("le debut :  " + debut);

            //verifier s'il y'a victoire ou pas
            //il tourne jusqu'à ce que ces trois fonctions soeint vrais
        }while(!new_game.CaseIsFull(new_game.grille)
        && !new_game.checkCol(new_game.grille)
        && !new_game.checkRow(new_game.grille)
        && !new_game.checkDiago(new_game.grille));

        if(new_game.CaseIsFull(new_game.grille) &&
                !new_game.checkCol(new_game.grille)
                && !new_game.checkRow(new_game.grille)
                && !new_game.checkDiago(new_game.grille)){
            new_game.evolution();
            System.out.println("La Grille est plaine, pas de gagnant");

        }else{
            new_game.evolution();

            System.out.println("Le joueur "+ gagnant + " a gagné ");
        }


    }
}
