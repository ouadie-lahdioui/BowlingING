
ING Bowling Kata
================

## Katas

Le but de ce programme est de calculer le score d’une partie de bowling :
 
- Une partie complète est composée de 10 tours.
- Un tour comporte 2 lancers.
- Le score final est la somme des scores à chaque tour
- Strike : [10, 0] Le joueur fait tomber toutes les quilles à son premier lancer
- Spare : [7, 3] Le joueur fait tomber toutes les quilles en deux lancers


## Règles de gestion :

- Les parties incomplètes ne seront pas acceptées par le programme
- Si le joueur ne fait pas tomber toutes les quilles à son tour, alors son score pour ce tour est la somme des quilles tombées pendant les 2 lancers du tours
- Si le joueur fait un strike à un tour, son score pour ce tour sera 10 + le score des deux lancers suivants
- Si le joueur fait un spare à un tour, son score pour ce tour sera 10 + le score du lancer suivant 

## Exemples :
 
- [0,0] [0,0] [0,0] [0,0] [0,0] [0,0] [0,0] [0,0] [0,0] [0,0] -> 0
 
- [3,3] [3,3] [3,3] [3,3] [3,3] [3,3] [3,3] [3,3] [3,3] [3,3] -> 60
 
- [4,5] [4,5] [4,5] [4,5] [4,5] [10,0] [4,5] [4,5] [4,5] [4,5] -> 100
 
- [4,5] [4,5] [4,5] [4,5] [5,5] [4,5] [4,5] [4,5] [4,5] ] [4,5] -> 95


## Contributing

Your contributions are always welcome ;).