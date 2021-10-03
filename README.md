# Brief_Tic-Tac-Toe

*Description du jeu:
Le jeu du tic-Tac-Toe ce joue à deux en tout par tour, il s'agit d'un jeu de stratégie, dont le but est d'alligner trois même signe soit en ligne, colonne ou diagonale!



*Description de l'inplémentation technique du jeu:
ALGORYTHME PRINCIPAL DU TIC-TAC-TOE

1-	Initialiser les données du jeu
2-	Créer une grille vide (tableau avec indice)
3-	Demander aux joueurs de saisir leurs noms
4-	Effectuer une fonction Random qui va choisir quel joueur va commencer en premier
5-	Attribuer à chaque joueur un jeton soit « O » soit « X »
6-	Demander au joueur de placer son jeton dans la case qu’il veut
7-	Imprimer à nouveau la grille avec le jeton qui vient d’être placé dedans
8-	Demander au second joueur de placer son jeton dans la case qu’il veut
9-	Imprimer à nouveau la grille avec le jeton qui vient d’être placé dedans
10-	Tant qu’aucun joueur n’a gagné ou qu’il n’y a pas d’égalité 
11-	Continuer de demander aux joueurs de jouer c’est-à-dire répéter de l’étape 6 à l’étape 9
12-	Quand il est détecter qu’un joueur à gagner soit parce qu’il a aligné sur une ligne, une colonne ou une diagonale 
13-	Annoncer le résultat de la partie soit il y a un gagnant soit une égalité
14-	Annoncer à fin du jeu
15-	Proposer aux joueurs de recommencer une partie



*Notice d'utilisation
Comment jouer à Tic-Tac-Toe ?
La console vous demande de rentrer le nom des joueurs :
Entrez le nom du joueur 1  puis du joueur 2 :
L’algorithme du jeu décide grâce à une méthode « Random » lequel des deux joueur va commencer à jouer et donc afficher de quel joueur il s’agit !


Pour jouer c’est simple, chaque joueur dispose de jeton qui est assimilé à un caractère : soit un « O » soit un « X » !
Le but du jeu est de réussir à aligner soit en ligne soit en colonne soit en diagonale 3 jetons identiques.

Lors du premier tour du premier joueur, le joueur décide à quel emplacement il place sont jeton !
Pour placer son jeton il dispose du tableau suivant avec les indices des cases ou il peut jouer !
┌───┬───┬───┐ 
│ 0 │ 1 │ 2 │ 		
├───┼───┼───┤ 
│ 3 │ 4 │ 5 │
├───┼───┼───┤ 
│ 6 │ 7 │ 8 │ 
└───┴───┴───┘

Le joueur doit donc choisir une case et son jeton y sera placé.
Puis il passe son tour au deuxième jouer qui lui aussi doit choisir une case ou placer son jeton !
Cela ce répète jusqu’à ce qu’un joueur gagne ou qu’il y est une égalité !
Puis la partie ce termine et les joueurs peuvent effacer la console et relancer le programme pour effectuer une nouvelle partie.
