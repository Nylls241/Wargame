# Wargame (jeu de guerre)

# Description du projet 

L'objectif de ce projet est de réaliser une version informatique d'un jeu de Wargame tactique tour par tour.

Un wargame (jeu de guerre) est un jeu permettant à un ou plusieurs joueurs de simuler des batailles. Un wargame
est composé d'un système de jeu (règles) et de scénarios. Dans un wargame tactique, un scénario représente
une bataille où évoluent des unités d'au maximum quelques dizaines de soldats (compagnie). L'univers dans
lequel le jeu se déroule est libre. On peut citer par exemple : historique (Mémoire 44, War in the east),
fantastique (Battlelore, Battle for Wesnoth), science-_ction (Full metal planet, Crimson _eld,), . . .

Le jeu se déroule sur un espace de jeu découpé en cases hexagonales . Un hexagone représente
l'unité de lieu et est d'un certain type (plaine, colline, montagne, . . .). Le jeu devra comporter au minimum cinq
types différents de terrain. Le type de terrain a un effet sur les unités qui s'y trouvent (bonus d'attaque ou de défense, points de
déplacement, . . .) . Vous êtes libre d'adapter les types de terrain et les effets à
votre contexte. Les effets peuvent varier en fonction du type d'unité (le type d'unité « elfe » se déplacera par
exemple plus vite dans la forêt). Chaque hexagone ne peut accueillir qu'une seule unité.

Chaque unité possède un type (infanterie légère, infanterie lourde, . . .). Le jeu devra proposer au moins cinq
types différents d'unité dont au minimum une disposant de capacité d'attaque à distance (« archer » par
exemple).

Le type d'unité définit le potentiel d'attaque, le potentiel de défense, le potentiel de déplacement, le champ de
vision et l'état initial (points de vie ou PV) de l'unité . Vous pouvez adapter les
types d'unités et la valeur des caractéristiques à votre contexte.

Le potentiel d'attaque et de défense définissent la puissance de l'unité durant un combat. Plus une unité dispose
d'un potentiel d'attaque élevé, plus elle fera de dégâts lors d'une attaque. Plus son potentiel de défense est
élevé, mieux elle résistera aux attaques adverses. Une unité peut disposer de plusieurs « armes » et donc d'un
potentiel d'attaque par arme. Le potentiel de déplacement indique la vitesse de déplacement de l'unité,
i.e. la distance qu'elle peut parcourir en un tour. Le champ de vision précise jusqu'à quelle distance l'unité peut
voir. Au-delà, le brouillard de guerre occulte les évènements. Ces quatre caractéristiques sont immuables tout
au long du déroulement du scénario. L'état de l'unité va cependant varier en fonction des dégâts subis lors de la
bataille.

La capacité de déplacement d'une unité se mesure en nombre d'hexagones. Durant un tour, une unité peut donc
parcourir au maximum un nombre d'hexagone égal à son potentiel de déplacement initial. Lors d'un
déplacement, le potentiel de déplacement courant change également en fonction du type de terrain traversé.
Par exemple, une unité d'infanterie lourde pourra traverser dans le même tour deux hexagones de forêt mais
pas un hexagone de forêt et un de montagne.
Lorsqu'une unité se déplace sur une case contenant une unité adverse, elle l'attaque. L'attaque n'est donc
possible que si l'unité dispose encore de suffisamment de points de déplacement pour atteindre l'adversaire. Si
l'unité attaquée est détruite, l'attaquant prend sa place. Sinon, aucun déplacement ne se produit.

Durant sa phase de déplacement, une unité peut attaquer une unité ennemie qui se trouve à portée. Dans ce
cas, la résolution du conflit doit tenir compte des potentiels d'attaque et de défense des deux unités ainsi que
du type de terrain. Chaque unité pourra subir des points de dégâts qui se déduiront de l'état de l'unité.
Eventuellement, une peu de hasard pourra être introduit dans le calcul pour éviter des résultats trop répétitifs.
Une unité blessée qui ne se déplace pas et qui n'est pas attaquée lors d'un tour se repose et récupère donc une
partie de ses points de vie. Une unité ne peut jamais dépasser son nombre initial de PV.
Les formules de calcul pour les dégâts et la récupération des points de vie sont laissés à votre appréciation.
Exemple de calculs Le conflit oppose une unité d'infanterie lourde (PAil = 10) qui attaque une unité d'infanterie
(PDi = 3, PV = 28) se trouvant dans une forteresse (bonusdef = 60%). Le potentiel de défense de l'infanterie est
modifié par le bonus du terrain (PDi = 3 + [3 * 60%] = 3 + [1.8] = 5) où [x] est la partie entière supérieure de x. Les
dégâts bruts subis par l'infanterie sont Dbrut = PAil - PDi = 10 - 5 = 5. L'application d'un peu d'aléatoire donne D
= Dbrut +random(-[50% * Dbrut], + [50% * Dbrut]). Supposons que la fonction random retourne -2 alors D = 5 -
2 = 3. Après le conflit, l'unité d'infanterie aura donc 28 - 3 = 25 PV.
Supposons que le taux de récupération des unités est de 10% par tour. Si l'infanterie ne se déplace pas le tour
suivant et n'est pas attaquée à nouveau, elle récupère [10% * 28] PV, soit 3 PV. L'unité retrouvera donc 25 + 3 =
28 PV.

Le jeu est donc une succession de tours de jeu. Chaque tour permet successivement aux adversaires d'effectuer
diverses actions. Un joueur peut jouer tant qu'une de ses unités possèdent des points de déplacement. Quand
un adversaire a terminé ses déplacements, il passe la main au joueur suivant. Eventuellement, il peut rester des
points de déplacement à certaines de ces unités.

Dans un scénario, chaque adversaire peut avoir des conditions de victoire différentes. Deux conditions de victoire
sont possibles :
-
Destruction complète de l'armée adverse : cela représente la réussite de l'attaque d'un objectif, ou
-
Atteindre un numéro de tour sans avoir été détruit, i.e. après un nombre donné de tours, un joueur
possède encore au moins une unité : cela correspond à la réussite de la défense d'un objectif.

Ce projet va donc consister à proposer une version du jeu jouable sur ordinateur.

Le jeu doit permettre de jouer à plusieurs. Dans ce projet, les joueurs pourront être des joueurs humains ou des
IA (joueurs contrôlés par l'ordinateur). Le programme fonctionnera sur une seule machine (pas en réseau). Dans
le cas de plusieurs joueurs humains, ces derniers joueront leur tour l'un après l'autre.

Peu de choses sont imposées au niveau de l'interface graphique. Néanmoins, un soin particulier devra être
apporté à sa clarté et à son ergonomie. Une aide devra être proposée au joueur débutant pour l'aider à assimiler
les règles du jeu lors de ses premières parties. La forme que prendra cette aide n'est pas imposée.
Le programme aura également pour rôle de vérifier les actions des joueurs humains. Seules les actions valides
seront possibles. Enfin, l'application ne montrera au joueur que ce qui lui est visible en respectant la règle du
brouillard de guerre.

Les parties pouvant durer longtemps, le logiciel devra fournir un moyen de sauvegarder le jeu en cours. Ces
sauvegardes pourront bien sûr être rechargées par la suite pour continuer la partie.

Une ou plusieurs des extensions facultatives ci-dessous pourront être intégrées au logiciel :
Éditeur de scénario Ce mode permet de créer ou de modifier des scénarios.Campagne Une campagne est une succession de scénarios. L'intérêt d'une campagne réside dans le fait que les
unités gagnent de l'expérience dans un scénario et que l'on choisit en début de scénario, les troupes enrollées.
Lors d'un scénario ultérieur de la campagne, les unités expérimentées pourront être réutilisées.
Evènements extérieurs Un scénario peut être « perturbé » par des évènements extérieurs (arrivée de renfort,
évènement climatique, . . .).
Actions d'opportunité Lors du tour d'un joueur, la main peut passer temporairement à un autre joueur. Par
exemple, une unité qui entre dans le champ de vision d'une unité ennemie pourrait alors être attaquée par cette
dernière.
Ligne de tir Les attaques à distance ne sont possibles que si la ligne de visée est suffisamment dégagée (pas
d'autres unités, pas de montagnes).
Pression du temps Les joueurs doivent réaliser leur tour de jeu dans un temps donné. Eventuellement, ce temps
pourrait être différent pour chaque joueur. Lorsque le temps est écoulé, la main passe automatiquement au
joueur suivant.


# Instructions d'installation

## Prérequis 
Avoir un JDK, pour pouvoir utiliser ce projet.
## Téléchargement du code source 
git clone https://github.com/Nylls241/Wargame.git


# Guide d'utilisation
Après avoir suivi les instructions de la partie précédentes faite ceci pour pouvoir exécutez le projet sur votre machine : 
## Sur un terminal Linux : 

## Sur un IDE, en particulier VS code : 
Il vous suffit de <run>(exécuter) la classse LancerPartie se trouvant dans src/Controleur.
N.B : Nous avons utilisez particulièrement dans ce projet l'IDE VS code, pour d'autres IDE, renseignez vous sur net svp.

#  Structure du répertoire

L'espace de travail contient bin  dossiers principales , où :

- `src`: le dossier pour conserver les codes sources.Au sein de ce dossiers nous avons encore quatres dossiers :
  
        - `Model`: Contient les fichiers sources pour les données du programme sous une forme compréhensible par la vue et notifie la vue des changements.
  
        - `Vue`: Contient les fichiers sources des composants graphique affichant le modèle.
  
        - `Controleur`: Contient les fichiers sources qui agissent  sur demande de l'utilisateur et modifie le modèle.
  
        - `textures`: Contient les images qui nous servent de rendu à la vue.
  
- `docs`: le dossier qui contient un ensemble de fichiers web (html, javascrit, etc) pour notre documentation java doc.
- `bin`: le dossier qui contient nos exécutables (.class).


