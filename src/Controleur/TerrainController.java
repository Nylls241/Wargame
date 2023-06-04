package Controleur;

import Model.*;

import java.util.ArrayList;

public class TerrainController {

    public static void main(String[] args) {

        int tailleMaxColonne = 10; // Remplacez la taille de la carte selon vos besoins
        int tailleMaxLigne = 10; // Remplacez la taille de la carte selon vos besoins

        // Création des terrains
        Terrain[][] map = new Terrain[tailleMaxColonne][tailleMaxLigne];

        // Définition des terrains pour chaque hexagone de la carte
        {
        map[0][0] = new EauProfonde();
        map[1][0] = new EauProfonde();
        map[2][0] = new EauProfonde();
        map[3][0] = new EauProfonde();
        map[4][0] = new EauProfonde();
        map[5][0] = new Foret();
        map[6][0] = new Foret();
        map[7][0] = new Foret();
        map[8][0] = new Foret();
        map[9][0] = new Foret();
        map[10][0] = new Foret();
        map[11][0] = new Foret();
        map[12][0] = new EauProfonde();
        map[13][0] = new EauProfonde();
        map[14][0] = new EauProfonde();
        map[15][0] = new EauProfonde();
        map[16][0] = new EauProfonde();
        map[17][0] = new EauProfonde();
        map[18][0] = new EauProfonde();
        map[19][0] = new EauProfonde();
        map[20][0] = new EauProfonde();
        map[21][0] = new EauProfonde();
        map[22][0] = new EauProfonde();
        map[23][0] = new EauProfonde();
        map[24][0] = new EauProfonde();
        map[25][0] = new EauProfonde();
        map[26][0] = new EauProfonde();
        map[27][0] = new EauProfonde();
        map[28][0] = new Plaine();
        map[29][0] = new Village();
        map[30][0] = new Plaine();
        map[31][0] = new Montagne();
        map[32][0] = new Montagne();
        map[33][0] = new Foret();
        map[34][0] = new Foret();
        map[35][0] = new Foret();
        map[36][0] = new Foret();
        map[37][0] = new Foret();
        map[38][0] = new Plaine();
        map[39][0] = new Plaine();

        // ligne 2

        map[0][1] = new EauProfonde();
        map[1][1] = new EauProfonde();
        map[2][1] = new EauProfonde();
        map[3][1] = new EauProfonde();
        map[4][1] = new EauProfonde();
        map[5][1] = new Foret();
        map[6][1] = new Foret();
        map[7][1] = new Plaine();
        map[8][1] = new Foret();
        map[9][1] = new Foret();
        map[10][1] = new Foret();
        map[11][1] = new Foret();
        map[12][1] = new Foret();
        map[13][1] = new Plaine();
        map[14][1] = new EauProfonde();
        map[15][1] = new EauProfonde();
        map[16][1] = new EauProfonde();
        map[17][1] = new EauProfonde();
        map[18][1] = new EauProfonde();
        map[19][1] = new EauProfonde();
        map[20][1] = new EauProfonde();
        map[21][1] = new EauProfonde();
        map[22][1] = new EauProfonde();
        map[23][1] = new EauProfonde();
        map[24][1] = new EauProfonde();
        map[25][1] = new Foret();
        map[26][1] = new EauProfonde();
        map[27][1] = new Plaine();
        map[28][1] = new EauProfonde();
        map[29][1] = new EauProfonde();
        map[30][1] = new Plaine();
        map[31][1] = new Montagne();
        map[32][1] = new Montagne();
        map[33][1] = new Foret();
        map[34][1] = new Foret();
        map[35][1] = new Foret();
        map[36][1] = new Foret();
        map[37][1] = new Foret();
        map[38][1] = new Plaine();
        map[39][1] = new Forteresse();

// LIGNE 3
        map[0][2] = new EauProfonde();
        map[1][2] = new EauProfonde();
        map[2][2] = new EauProfonde();
        map[3][2] = new EauProfonde();
        map[4][2] = new EauProfonde();
        map[5][2] = new Plaine();
        map[6][2] = new Plaine();
        map[7][2] = new Forteresse();
        map[8][2] = new Plaine();
        map[9][2] = new Foret();
        map[10][2] = new Foret();
        map[11][2] = new Foret();
        map[12][2] = new Plaine();
        map[13][2] = new Plaine();
        map[14][2] = new Plaine();
        map[15][2] = new EauProfonde();
        map[16][2] = new EauProfonde();
        map[17][2] = new EauProfonde();
        map[18][2] = new EauProfonde();
        map[19][2] = new EauProfonde();
        map[20][2] = new EauProfonde();
        map[21][2] = new Foret();
        map[22][2] = new Foret();
        map[23][2] = new Foret();
        map[24][2] = new Foret();
        map[25][2] = new Foret();
        map[26][2] = new Plaine();
        map[27][2] = new Plaine();
        map[28][2] = new EauProfonde();
        map[29][2] = new EauProfonde();
        map[30][2] = new EauProfonde();
        map[31][2] = new EauProfonde();
        map[32][2] = new Montagne();
        map[33][2] = new Montagne();
        map[34][2] = new Montagne();
        map[35][2] = new Foret();
        map[36][2] = new Foret(); 
        map[37][2] = new Foret();
        map[38][2] = new Forteresse();
        map[39][2] = new Forteresse();


// LIGNE 4
        map[0][3] = new EauProfonde();
        map[1][3] = new EauProfonde();
        map[2][3] = new EauProfonde();
        map[3][3] = new EauProfonde();
        map[4][3] = new Foret();
        map[5][3] = new Foret();
        map[6][3] = new Plaine();
        map[7][3] = new Plaine();
        map[8][3] = new Plaine();
        map[9][3] = new Foret();
        map[10][3] = new EauProfonde();
        map[11][3] = new EauProfonde();
        map[12][3] = new Plaine();
        map[13][3] = new Plaine();
        map[14][3] = new Plaine();
        map[15][3] = new Forteresse();
        map[16][3] = new EauProfonde();
        map[17][3] = new EauProfonde();
        map[18][3] = new EauProfonde();
        map[19][3] = new Foret();
        map[20][3] = new Foret();
        map[21][3] = new Foret();
        map[22][3] = new Foret();
        map[23][3] = new Foret();
        map[24][3] = new Foret();
        map[25][3] = new Montagne();
        map[26][3] = new Montagne();
        map[27][3] = new Plaine();
        map[28][3] = new Plaine();
        map[29][3] = new EauProfonde();
        map[30][3] = new EauProfonde();
        map[31][3] = new EauProfonde();
        map[32][3] = new Montagne();
        map[33][3] = new Montagne();
        map[34][3] = new Montagne();
        map[35][3] = new Montagne();
        map[36][3] = new Montagne();
        map[37][3] = new Foret();
        map[38][3] = new Plaine();
        map[39][3] = new Village();


// LIGNE 5
        map[0][4] = new Montagne();
        map[1][4] = new EauProfonde();
        map[2][4] = new EauProfonde();
        map[3][4] = new EauProfonde();
        map[4][4] = new Foret();
        map[5][4] = new Foret();
        map[6][4] = new Foret();
        map[7][4] = new Foret();
        map[8][4] = new Plaine();
        map[9][4] = new Plaine();
        map[10][4] = new EauProfonde();
        map[11][4] = new EauProfonde();
        map[12][4] = new EauProfonde();
        map[13][4] = new EauProfonde();
        map[14][4] = new Plaine();
        map[15][4] = new Forteresse();
        map[16][4] = new Plaine();
        map[17][4] = new EauProfonde();
        map[18][4] = new Foret();
        map[19][4] = new Foret();
        map[20][4] = new Foret();
        map[21][4] = new Foret();
        map[22][4] = new Plaine();
        map[23][4] = new Plaine();
        map[24][4] = new Montagne();
        map[25][4] = new Montagne();
        map[26][4] = new Montagne();
        map[27][4] = new Plaine();
        map[28][4] = new Village();
        map[29][4] = new Plaine();
        map[30][4] = new Plaine();
        map[31][4] = new Plaine();
        map[32][4] = new Montagne();
        map[33][4] = new Montagne();
        map[34][4] = new Montagne();
        map[35][4] = new Montagne();
        map[36][4] = new Montagne();
        map[37][4] = new EauProfonde();
        map[38][4] = new Plaine();
        map[39][4] = new Plaine();



// LIGNE 6
        map[0][5] = new Montagne();
        map[1][5] = new Montagne();
        map[2][5] = new EauProfonde();
        map[3][5] = new EauProfonde();
        map[4][5] = new Foret();
        map[5][5] = new Village();
        map[6][5] = new Foret();
        map[7][5] = new EauProfonde();
        map[8][5] = new Plaine();
        map[9][5] = new Plaine();
        map[10][5] = new EauProfonde();
        map[11][5] = new EauProfonde();
        map[12][5] = new EauProfonde();
        map[13][5] = new EauProfonde();
        map[14][5] = new Plaine();
        map[15][5] = new Plaine();
        map[16][5] = new Plaine();
        map[17][5] = new Plaine();
        map[18][5] = new Plaine();
        map[19][5] = new Plaine();
        map[20][5] = new Foret();
        map[21][5] = new Plaine();
        map[22][5] = new Plaine();
        map[23][5] = new Forteresse();
        map[24][5] = new Plaine();
        map[25][5] = new Plaine();
        map[26][5] = new Montagne();
        map[27][5] = new Montagne();
        map[28][5] = new Plaine();
        map[29][5] = new Plaine();
        map[30][5] = new Plaine();
        map[31][5] = new Foret();
        map[32][5] = new Montagne();
        map[33][5] = new Montagne();
        map[34][5] = new Montagne();
        map[35][5] = new EauProfonde();
        map[36][5] = new EauProfonde();
        map[37][5] = new EauProfonde();
        map[38][5] = new EauProfonde();
        map[39][5] = new Plaine();


// LIGNE 7
        map[0][6] = new Montagne();
        map[1][6] = new Montagne();
        map[2][6] = new EauProfonde();
        map[3][6] = new EauProfonde();
        map[4][6] = new Foret();
        map[5][6] = new Foret();
        map[6][6] = new EauProfonde();
        map[7][6] = new EauProfonde();
        map[8][6] = new EauProfonde();
        map[9][6] = new Montagne();
        map[10][6] = new Montagne();
        map[11][6] = new EauProfonde();
        map[12][6] = new Plaine();
        map[13][6] = new Plaine();
        map[14][6] = new Plaine();
        map[15][6] = new Plaine();
        map[16][6] = new Foret();
        map[17][6] = new Foret();
        map[18][6] = new Plaine();
        map[19][6] = new Foret();
        map[20][6] = new Plaine();
        map[21][6] = new Montagne();
        map[22][6] = new Plaine();
        map[23][6] = new Plaine();
        map[24][6] = new Plaine();
        map[25][6] = new Plaine();
        map[26][6] = new Montagne();
        map[27][6] = new Foret();
        map[28][6] = new Foret();
        map[29][6] = new Foret();
        map[30][6] = new Foret();
        map[31][6] = new EauProfonde();
        map[32][6] = new Foret();
        map[33][6] = new EauProfonde();
        map[34][6] = new EauProfonde();
        map[35][6] = new EauProfonde();
        map[36][6] = new EauProfonde();
        map[37][6] = new EauProfonde();
        map[38][6] = new Plaine();
        map[39][6] = new Plaine();










// LIGNE 8
        map[0][7] = new Montagne();
        map[1][7] = new Montagne();
        map[2][7] = new EauProfonde();
        map[3][7] = new EauProfonde();
        map[4][7] = new Plaine();
        map[5][7] = new Foret();
        map[6][7] = new EauProfonde();
        map[7][7] = new EauProfonde();
        map[8][7] = new EauProfonde();
        map[9][7] = new Montagne();
        map[10][7] = new Montagne();
        map[11][7] = new Montagne();
        map[12][7] = new Plaine();
        map[13][7] = new Plaine();
        map[14][7] = new Plaine();
        map[15][7] = new Foret();
        map[16][7] = new Foret();
        map[17][7] = new Foret();
        map[18][7] = new Colline();
        map[19][7] = new Foret();
        map[20][7] = new Foret();
        map[21][7] = new Montagne();
        map[22][7] = new Foret();
        map[23][7] = new Foret();
        map[24][7] = new Foret();
        map[25][7] = new Foret();
        map[26][7] = new Foret();
        map[27][7] = new Foret();
        map[28][7] = new Foret();
        map[29][7] = new Foret();
        map[30][7] = new Foret();
        map[31][7] = new EauProfonde();
        map[32][7] = new EauProfonde();
        map[33][7] = new Montagne();
        map[34][7] = new EauProfonde();
        map[35][7] = new Montagne();
        map[36][7] = new EauProfonde();
        map[37][7] = new Foret();
        map[38][7] = new Plaine();
        map[39][7] = new Plaine();



// LIGNE 9
        map[0][8] = new Montagne();
        map[1][8] = new EauProfonde();
        map[2][8] = new EauProfonde();
        map[3][8] = new EauProfonde();
        map[4][8] = new Plaine();
        map[5][8] = new Montagne();
        map[6][8] = new Montagne();
        map[7][8] = new Plaine();
        map[8][8] = new Montagne();
        map[9][8] = new Montagne();
        map[10][8] = new Montagne();
        map[11][8] = new Foret();
        map[12][8] = new Foret();
        map[13][8] = new Foret();
        map[14][8] = new Foret();
        map[15][8] = new Colline();
        map[16][8] = new Colline();
        map[17][8] = new Colline();
        map[18][8] = new Colline();
        map[19][8] = new Colline();
        map[20][8] = new Montagne();
        map[21][8] = new Montagne();
        map[22][8] = new Montagne();
        map[23][8] = new Foret();
        map[24][8] = new Colline();
        map[25][8] = new Foret();
        map[26][8] = new Foret();
        map[27][8] = new Foret();
        map[28][8] = new Village();
        map[29][8] = new Foret();
        map[30][8] = new Foret();
        map[31][8] = new Foret();
        map[32][8] = new Foret();
        map[33][8] = new Montagne();
        map[34][8] = new Montagne();
        map[35][8] = new Montagne();
        map[36][8] = new Foret();
        map[37][8] = new Foret();
        map[38][8] = new Foret();
        map[39][8] = new Village();







// LIGNE 10
        map[0][9] = new Montagne();
        map[1][9] = new EauProfonde();
        map[2][9] = new EauProfonde();
        map[3][9] = new Village();
        map[4][9] = new Plaine();
        map[5][9] = new Montagne();
        map[6][9] = new Montagne();
        map[7][9] = new Forteresse();
        map[8][9] = new Plaine();
        map[9][9] = new Montagne();
        map[10][9] = new Montagne();
        map[11][9] = new Foret();
        map[12][9] = new Foret();
        map[13][9] = new Foret();
        map[14][9] = new Plaine();
        map[15][9] = new Montagne();
        map[16][9] = new Montagne();
        map[17][9] = new Colline();
        map[18][9] = new Colline();
        map[19][9] = new Montagne();
        map[20][9] = new Montagne();
        map[21][9] = new Colline();
        map[22][9] = new Montagne();
        map[23][9] = new Colline();
        map[24][9] = new Colline();
        map[25][9] = new Colline();
        map[26][9] = new Colline();
        map[27][9] = new Foret();
        map[28][9] = new Foret();
        map[29][9] = new Foret();
        map[30][9] = new Foret();
        map[31][9] = new Foret();
        map[32][9] = new Foret();
        map[33][9] = new Montagne();
        map[34][9] = new Montagne();
        map[35][9] = new Montagne();
        map[36][9] = new Montagne();
        map[37][9] = new Foret();
        map[38][9] = new Foret();
        map[39][9] = new Foret();


// LIGNE 11
        map[0][10] = new EauProfonde ();
        map[1][10] = new EauProfonde();
        map[2][10] = new EauProfonde();
        map[3][10] = new EauProfonde();
        map[4][10] = new Montagne ();
        map[5][10] = new Plaine();
        map[6][10] = new Plaine();
        map[7][10] = new Plaine();
        map[8][10] = new Plaine();
        map[9][10] = new Foret();
        map[10][10] = new Foret();
        map[11][10] = new Foret();
        map[12][10] = new Foret();
        map[13][10] = new Plaine();
        map[14][10] = new Montagne();
        map[15][10] = new Montagne();
        map[16][10] = new Montagne();
        map[17][10] = new Montagne();
        map[18][10] = new Plaine();
        map[19][10] = new Montagne();
        map[20][10] = new Plaine();
        map[21][10] = new Foret();
        map[22][10] = new Colline();
        map[23][10] = new Colline();
        map[24][10] = new Plaine();
        map[25][10] = new Forteresse();
        map[26][10] = new Colline();
        map[27][10] = new Colline();
        map[28][10] = new Foret();
        map[29][10] = new Colline();
        map[30][10] = new Foret();
        map[31][10] = new Foret();
        map[32][10] = new Foret();
        map[33][10] = new Montagne();
        map[34][10] = new Montagne();
        map[35][10] = new Montagne();
        map[36][10] = new Foret();
        map[37][10] = new Foret();
        map[38][10] = new EauProfonde();
        map[39][10] = new EauProfonde();









// LIGNE 12
        map[0][11] = new EauProfonde();
        map[1][11] = new EauProfonde();
        map[2][11] = new EauProfonde();
        map[3][11] = new Foret();
        map[4][11] = new Foret();
        map[5][11] = new Plaine();
        map[6][11] = new Plaine();
        map[7][11] = new Foret();
        map[8][11] = new Foret();
        map[9][11] = new EauProfonde();
        map[10][11] = new EauProfonde();
        map[11][11] = new EauProfonde();
        map[12][11] = new EauProfonde();
        map[13][11] = new Montagne();
        map[14][11] = new Montagne();
        map[15][11] = new Montagne();
        map[16][11] = new Plaine();
        map[17][11] = new Plaine();
        map[18][11] = new Village();
        map[19][11] = new Plaine();
        map[20][11] = new Plaine();
        map[21][11] = new Foret();
        map[22][11] = new Foret();
        map[23][11] = new Foret();
        map[24][11] = new Foret();
        map[25][11] = new Colline();
        map[26][11] = new Plaine();
        map[27][11] = new Colline();
        map[28][11] = new Colline();
        map[29][11] = new Colline();
        map[30][11] = new Colline();
        map[31][11] = new Colline();
        map[32][11] = new Colline();
        map[33][11] = new Colline();
        map[34][11] = new Colline();
        map[35][11] = new EauProfonde();
        map[36][11] = new EauProfonde();
        map[37][11] = new EauProfonde();
        map[38][11] = new EauProfonde();
        map[39][11] = new EauProfonde();


// LIGNE 13
        map[0][12] = new Colline();
        map[1][12] = new Foret();
        map[2][12] = new Foret();
        map[3][12] = new Foret();
        map[4][12] = new Plaine();
        map[5][12] = new Plaine();
        map[6][12] = new Foret();
        map[7][12] = new EauProfonde();
        map[8][12] = new EauProfonde();
        map[9][12] = new EauProfonde();
        map[10][12] = new EauProfonde();
        map[11][12] = new EauProfonde();
        map[12][12] = new EauProfonde();
        map[13][12] = new EauProfonde();
        map[14][12] = new Plaine();
        map[15][12] = new Plaine();
        map[16][12] = new Plaine();
        map[17][12] = new EauProfonde();
        map[18][12] = new Plaine();
        map[19][12] = new Plaine();
        map[20][12] = new Foret();
        map[21][12] = new Foret();
        map[22][12] = new Foret();
        map[23][12] = new Foret();
        map[24][12] = new Foret();
        map[25][12] = new Foret();
        map[26][12] = new Foret();
        map[27][12] = new Colline();
        map[28][12] = new Colline();
        map[29][12] = new Colline();
        map[30][12] = new Colline();
        map[31][12] = new Colline();
        map[32][12] = new Colline();
        map[33][12] = new Colline();
        map[34][12] = new Colline();
        map[35][12] = new Colline();
        map[36][12] = new EauProfonde();
        map[37][12] = new EauProfonde();
        map[38][12] = new EauProfonde();
        map[39][12] = new Colline();



//LIGNE 14
        map[0][13] = new Colline();
        map[1][13] = new Colline();
        map[2][13] = new Montagne();
        map[3][13] = new Montagne();
        map[4][13] = new Plaine();
        map[5][13] = new Plaine();
        map[6][13] = new Foret();
        map[7][13] = new Foret();
        map[8][13] = new EauProfonde();
        map[9][13] = new EauProfonde();
        map[10][13] = new EauProfonde();
        map[11][13] = new EauProfonde();
        map[12][13] = new EauProfonde();
        map[13][13] = new EauProfonde();
        map[14][13] = new EauProfonde();
        map[15][13] = new EauProfonde();
        map[16][13] = new EauProfonde();
        map[17][13] = new EauProfonde();
        map[18][13] = new EauProfonde();
        map[19][13] = new EauProfonde();
        map[20][13] = new EauProfonde();
        map[21][13] = new Foret();
        map[22][13] = new EauProfonde();
        map[23][13] = new Foret();
        map[24][13] = new Foret();
        map[25][13] = new Colline();
        map[26][13] = new Colline();
        map[27][13] = new Plaine();
        map[28][13] = new Plaine();
        map[29][13] = new Forteresse();
        map[30][13] = new Plaine();
        map[31][13] = new Plaine();
        map[32][13] = new Plaine();
        map[33][13] = new Colline();
        map[34][13] = new Colline();
        map[35][13] = new Colline();
        map[36][13] = new EauProfonde();
        map[37][13] = new Colline();
        map[38][13] = new Colline();
        map[39][13] = new Colline();


// LIGNE 15
        map[0][14] = new Colline();
        map[1][14] = new Colline ();
        map[2][14] = new Montagne();
        map[3][14] = new Montagne();
        map[4][14] = new Montagne();
        map[5][14] = new Plaine();
        map[6][14] = new Plaine();
        map[7][14] = new Foret();
        map[8][14] = new EauProfonde();
        map[9][14] = new EauProfonde();
        map[10][14] = new EauProfonde();
        map[11][14] = new EauProfonde();
        map[12][14] = new EauProfonde();
        map[13][14] = new Foret();
        map[14][14] = new Plaine();
        map[15][14] = new Plaine();
        map[16][14] = new EauProfonde();
        map[17][14] = new Plaine();
        map[18][14] = new Plaine();
        map[19][14] = new EauProfonde();
        map[20][14] = new EauProfonde();
        map[21][14] = new EauProfonde();
        map[22][14] = new EauProfonde();
        map[23][14] = new EauProfonde();
        map[24][14] = new EauProfonde();
        map[25][14] = new Colline();
        map[26][14] = new Plaine();
        map[27][14] = new Plaine();
        map[28][14] = new Plaine();
        map[29][14] = new EauProfonde();
        map[30][14] = new Plaine();
        map[31][14] = new Plaine();
        map[32][14] = new Village();
        map[33][14] = new Plaine();
        map[34][14] = new Plaine();
        map[35][14] = new Plaine();
        map[36][14] = new Colline();
        map[37][14] = new Colline();
        map[38][14] = new Colline();
        map[39][14] = new Plaine();


// LIGNE 16
        map[0][15] = new Colline();
        map[1][15] = new Colline();
        map[2][15] = new Montagne();
        map[3][15] = new Plaine();
        map[4][15] = new Plaine();
        map[5][15] = new Plaine();
        map[6][15] = new Plaine();
        map[7][15] = new Foret();
        map[8][15] = new EauProfonde();
        map[9][15] = new EauProfonde();
        map[10][15] = new EauProfonde();
        map[11][15] = new EauProfonde();
        map[12][15] = new EauProfonde();
        map[13][15] = new Foret();
        map[14][15] = new Plaine();
        map[15][15] = new Plaine();
        map[16][15] = new Plaine();
        map[17][15] = new Plaine();
        map[18][15] = new Village();
        map[19][15] = new Plaine();
        map[20][15] = new EauProfonde();
        map[21][15] = new Plaine();
        map[22][15] = new Plaine();
        map[23][15] = new EauProfonde();
        map[24][15] = new Plaine();
        map[25][15] = new Plaine();
        map[26][15] = new Plaine();
        map[27][15] = new EauProfonde();
        map[28][15] = new EauProfonde();
        map[29][15] = new EauProfonde();
        map[30][15] = new EauProfonde();
        map[31][15] = new EauProfonde();
        map[32][15] = new Plaine();
        map[33][15] = new EauProfonde();
        map[34][15] = new EauProfonde();
        map[35][15] = new Plaine();
        map[36][15] = new Plaine();
        map[37][15] = new Plaine();
        map[38][15] = new Village();
        map[39][15] = new Plaine();



// LIGNE 17
        map[0][16] = new Colline();
        map[1][16] = new Colline();
        map[2][16] = new Plaine();
        map[3][16] = new Plaine();
        map[4][16] = new Plaine();
        map[5][16] = new Forteresse();
        map[6][16] = new Plaine();
        map[7][16] = new Plaine();
        map[8][16] = new Foret();
        map[9][16] = new EauProfonde();
        map[10][16] = new EauProfonde();
        map[11][16] = new EauProfonde();
        map[12][16] = new Foret();
        map[13][16] = new Foret();
        map[14][16] = new Plaine();
        map[15][16] = new Forteresse();
        map[16][16] = new Forteresse();
        map[17][16] = new Plaine();
        map[18][16] = new Village();
        map[19][16] = new Plaine();
        map[20][16] = new Plaine();
        map[21][16] = new Foret();
        map[22][16] = new Plaine();
        map[23][16] = new Plaine();
        map[24][16] = new Village();
        map[25][16] = new Plaine();
        map[26][16] = new Plaine();
        map[27][16] = new EauProfonde();
        map[28][16] = new EauProfonde();
        map[29][16] = new EauProfonde();
        map[30][16] = new EauProfonde();
        map[31][16] = new EauProfonde();
        map[32][16] = new EauProfonde();
        map[33][16] = new EauProfonde();
        map[34][16] = new EauProfonde();
        map[35][16] = new EauProfonde();
        map[36][16] = new EauProfonde();
        map[37][16] = new EauProfonde();
        map[38][16] = new Plaine();
        map[39][16] = new EauProfonde();


// LIGNE 18
        map[0][17] = new Colline();
        map[1][17] = new Colline();
        map[2][17] = new Colline();
        map[3][17] = new Plaine();
        map[4][17] = new Plaine();
        map[5][17] = new Village();
        map[6][17] = new Plaine();
        map[7][17] = new Plaine();
        map[8][17] = new Foret();
        map[9][17] = new Foret();
        map[10][17] = new Foret();
        map[11][17] = new Foret();
        map[12][17] = new Foret();
        map[13][17] = new Foret();
        map[14][17] = new Plaine();
        map[15][17] = new Village();
        map[16][17] = new Forteresse();
        map[17][17] = new Plaine();
        map[18][17] = new Montagne();
        map[19][17] = new Montagne();
        map[20][17] = new Plaine();
        map[21][17] = new Foret();
        map[22][17] = new Foret();
        map[23][17] = new Foret();
        map[24][17] = new Foret();
        map[25][17] = new Foret();
        map[26][17] = new Foret();
        map[27][17] = new EauProfonde();
        map[28][17] = new EauProfonde();
        map[29][17] = new EauProfonde();
        map[30][17] = new EauProfonde();
        map[31][17] = new EauProfonde();
        map[32][17] = new EauProfonde();
        map[33][17] = new EauProfonde();
        map[34][17] = new EauProfonde();
        map[35][17] = new EauProfonde();
        map[36][17] = new EauProfonde();
        map[37][17] = new EauProfonde();
        map[38][17] = new EauProfonde();
        map[39][17] = new EauProfonde();


// LIGNE 19
        map[0][18] = new Colline();
        map[1][18] = new Village();
        map[2][18] = new Colline();
        map[3][18] = new Plaine();
        map[4][18] = new Plaine();
        map[5][18] = new Plaine();
        map[6][18] = new Plaine();
        map[7][18] = new Plaine();
        map[8][18] = new Foret();
        map[9][18] = new Foret();
        map[10][18] = new Foret();
        map[11][18] = new Foret();
        map[12][18] = new Foret();
        map[13][18] = new Foret();
        map[14][18] = new Plaine();
        map[15][18] = new Plaine();
        map[16][18] = new Village();
        map[17][18] = new Plaine();
        map[18][18] = new Montagne();
        map[19][18] = new Montagne();
        map[20][18] = new Plaine();
        map[21][18] = new Foret();
        map[22][18] = new Foret();
        map[23][18] = new Foret();
        map[24][18] = new Foret();
        map[25][18] = new Foret();
        map[26][18] = new Foret();
        map[27][18] = new Plaine();
        map[28][18] = new EauProfonde();
        map[29][18] = new EauProfonde();
        map[30][18] = new EauProfonde();
        map[31][18] = new Plaine();
        map[32][18] = new Plaine();
        map[33][18] = new Plaine();
        map[34][18] = new EauProfonde();
        map[35][18] = new EauProfonde();
        map[36][18] = new EauProfonde();
        map[37][18] = new EauProfonde();
        map[38][18] = new Colline();
        map[39][18] = new EauProfonde();


// LIGNE 20
        map[0][19] = new Colline();
        map[1][19] = new Village();
        map[2][19] = new Colline();
        map[3][19] = new Colline();
        map[4][19] = new Plaine();
        map[5][19] = new Village();
        map[6][19] = new Plaine();
        map[7][19] = new Plaine();
        map[8][19] = new Plaine();
        map[9][19] = new Plaine();
        map[10][19] = new EauProfonde();
        map[11][19] = new EauProfonde();
        map[12][19] = new Foret();
        map[13][19] = new Foret();
        map[14][19] = new Foret();
        map[15][19] = new Foret();
        map[16][19] = new Plaine();
        map[17][19] = new Plaine();
        map[18][19] = new Montagne();
        map[19][19] = new Montagne();
        map[20][19] = new Foret();
        map[21][19] = new Foret();
        map[22][19] = new Foret();
        map[23][19] = new Foret();
        map[24][19] = new Foret();
        map[25][19] = new Foret();
        map[26][19] = new Plaine();
        map[27][19] = new Plaine();
        map[28][19] = new Plaine();
        map[29][19] = new Forteresse();
        map[30][19] = new Plaine();
        map[31][19] = new Plaine();
        map[32][19] = new Plaine();
        map[33][19] = new Foret();
        map[34][19] = new Foret();
        map[35][19] = new Foret();
        map[36][19] = new Colline();
        map[37][19] = new Colline();
        map[38][19] = new Colline();
        map[39][19] = new Colline();


// LIGNE 21
        map[0][20] = new Colline();
        map[1][20] = new Colline();
        map[2][20] = new Colline();
        map[3][20] = new Colline();
        map[4][20] = new Colline();
        map[5][20] = new Plaine();
        map[6][20] = new Village();
        map[7][20] = new Plaine();
        map[8][20] = new Plaine();
        map[9][20] = new Plaine();
        map[10][20] = new EauProfonde();
        map[11][20] = new EauProfonde();
        map[12][20] = new EauProfonde();
        map[13][20] = new EauProfonde();
        map[14][20] = new Foret();
        map[15][20] = new Foret();
        map[16][20] = new Plaine();
        map[17][20] = new Plaine();
        map[18][20] = new Montagne();
        map[19][20] = new Montagne();
        map[20][20] = new Montagne();
        map[21][20] = new Foret();
        map[22][20] = new Foret();
        map[23][20] = new EauProfonde();
        map[24][20] = new EauProfonde();
        map[25][20] = new EauProfonde();
        map[26][20] = new EauProfonde();
        map[27][20] = new Plaine();
        map[28][20] = new Plaine();
        map[29][20] = new Plaine();
        map[30][20] = new Plaine();
        map[31][20] = new EauProfonde();
        map[32][20] = new Plaine();
        map[33][20] = new Foret();
        map[34][20] = new Foret();
        map[35][20] = new Foret();
        map[36][20] = new Colline();
        map[37][20] = new Colline();
        map[38][20] = new Village();
        map[39][20] = new Colline();


// LIGNE 22
        map[0][21] = new Colline();
        map[1][21] = new Colline();
        map[2][21] = new Colline();
        map[3][21] = new Colline();
        map[4][21] = new Foret();
        map[5][21] = new Foret();
        map[6][21] = new Foret();
        map[7][21] = new Foret();
        map[8][21] = new Plaine();
        map[9][21] = new Foret();
        map[10][21] = new Foret();
        map[11][21] = new Foret();
        map[12][21] = new Foret();
        map[13][21] = new EauProfonde();
        map[14][21] = new EauProfonde();
        map[15][21] = new Plaine();
        map[16][21] = new Plaine();
        map[17][21] = new Montagne();
        map[18][21] = new Montagne();
        map[19][21] = new Montagne();
        map[20][21] = new Montagne();
        map[21][21] = new Foret();
        map[22][21] = new Foret();
        map[23][21] = new EauProfonde();
        map[24][21] = new EauProfonde();
        map[25][21] = new EauProfonde();
        map[26][21] = new EauProfonde();
        map[27][21] = new EauProfonde();
        map[28][21] = new EauProfonde();
        map[29][21] = new EauProfonde();
        map[30][21] = new EauProfonde();
        map[31][21] = new EauProfonde();
        map[32][21] = new EauProfonde();
        map[33][21] = new EauProfonde();
        map[34][21] = new Foret();
        map[35][21] = new Foret();
        map[36][21] = new Foret();
        map[37][21] = new Colline();
        map[38][21] = new Colline();
        map[39][21] = new Colline();


// LIGNE 23
        map[0][22] = new Colline();
        map[1][22] = new Colline();
        map[2][22] = new Colline();
        map[3][22] = new Colline();
        map[4][22] = new Colline();
        map[5][22] = new Foret();
        map[6][22] = new Foret();
        map[7][22] = new Foret();
        map[8][22] = new Foret();
        map[9][22] = new Foret();
        map[10][22] = new Foret();
        map[11][22] = new Foret();
        map[12][22] = new Foret();
        map[13][22] = new EauProfonde();
        map[14][22] = new EauProfonde();
        map[15][22] = new Foret();
        map[16][22] = new Foret();
        map[17][22] = new Montagne();
        map[18][22] = new Montagne();
        map[19][22] = new Montagne();
        map[20][22] = new Montagne();
        map[21][22] = new Foret();
        map[22][22] = new Foret();
        map[23][22] = new EauProfonde();
        map[24][22] = new EauProfonde();
        map[25][22] = new Colline();
        map[26][22] = new Colline();
        map[27][22] = new Colline();
        map[28][22] = new EauProfonde();
        map[29][22] = new EauProfonde();
        map[30][22] = new EauProfonde();
        map[31][22] = new EauProfonde();
        map[32][22] = new Montagne();
        map[33][22] = new EauProfonde();
        map[34][22] = new Foret();
        map[35][22] = new Village();
        map[36][22] = new Foret();
        map[37][22] = new Foret();
        map[38][22] = new Foret();
        map[39][22] = new Colline();


// LIGNE 24
        map[0][23] = new Plaine();
        map[1][23] = new Plaine();
        map[2][23] = new Colline();
        map[3][23] = new Plaine();
        map[4][23] = new Foret();
        map[5][23] = new Foret();
        map[6][23] = new Foret();
        map[7][23] = new Foret();
        map[8][23] = new EauProfonde();
        map[9][23] = new EauProfonde();
        map[10][23] = new Foret();
        map[11][23] = new Foret();
        map[12][23] = new Foret();
        map[13][23] = new Foret();
        map[14][23] = new EauProfonde();
        map[15][23] = new Foret();
        map[16][23] = new Foret();
        map[17][23] = new Montagne();
        map[18][23] = new Montagne();
        map[19][23] = new Montagne();
        map[20][23] = new Montagne();
        map[21][23] = new Foret();
        map[22][23] = new Foret();
        map[23][23] = new Foret();
        map[24][23] = new Colline();
        map[25][23] = new Colline();
        map[26][23] = new Colline();
        map[27][23] = new Colline();
        map[28][23] = new Colline();
        map[29][23] = new EauProfonde();
        map[30][23] = new EauProfonde();
        map[31][23] = new Montagne();
        map[32][23] = new Montagne();
        map[33][32] = new Foret();
        map[34][32] = new Foret();
        map[35][23] = new Foret();
        map[36][23] = new Foret();
        map[37][23] = new Foret();
        map[38][23] = new Foret();
        map[39][32] = new Colline();


// LIGNE 25
        map[0][24] = new Plaine();
        map[1][24] = new Plaine();
        map[2][24] = new Plaine();
        map[3][24] = new Foret();
        map[4][24] = new Foret();
        map[5][24] = new Foret();
        map[6][24] = new Foret();
        map[7][24] = new EauProfonde();
        map[8][24] = new EauProfonde();
        map[9][24] = new EauProfonde();
        map[10][24] = new Plaine();
        map[11][24] = new Village();
        map[12][24] = new Plaine();
        map[13][24] = new Plaine();
        map[14][24] = new Plaine();
        map[15][24] = new Foret();
        map[16][24] = new Foret();
        map[17][24] = new Montagne();
        map[18][24] = new Montagne();
        map[19][24] = new Montagne();
        map[20][24] = new Montagne();
        map[21][24] = new Montagne();
        map[22][24] = new Foret();
        map[23][24] = new Foret();
        map[24][24] = new Plaine();
        map[25][24] = new Colline();
        map[26][24] = new Colline();
        map[27][24] = new Plaine();
        map[28][24] = new Plaine();
        map[29][24] = new Plaine();
        map[30][24] = new Plaine();
        map[31][24] = new Village();
        map[32][24] = new Plaine();
        map[33][24] = new Foret();
        map[34][24] = new Foret();
        map[35][24] = new Foret();
        map[36][24] = new Foret();
        map[37][24] = new Plaine();
        map[38][24] = new Plaine();
        map[39][24] = new Plaine();


// LIGNE 26
        map[0][25] = new Plaine();
        map[1][25] = new Village();
        map[2][25] = new Village ();
        map[3][25] = new Foret();
        map[4][25] = new Foret();
        map[5][25] = new Foret();
        map[6][25] = new EauProfonde();
        map[7][52] = new EauProfonde();
        map[8][25] = new EauProfonde();
        map[9][25] = new Forteresse();
        map[10][25] = new Plaine();
        map[11][25] = new Plaine();
        map[12][25] = new Village();
        map[13][25] = new Plaine();
        map[14][25] = new Plaine();
        map[15][25] = new Plaine();
        map[16][25] = new Foret();
        map[17][25] = new Montagne();
        map[18][25] = new Montagne();
        map[19][25] = new Montagne();
        map[20][25] = new Montagne();
        map[21][25] = new Montagne();
        map[22][25] = new Montagne();
        map[23][25] = new Plaine();
        map[24][25] = new Plaine();
        map[25][25] = new Plaine();
        map[26][25] = new Plaine();
        map[27][25] = new Forteresse();
        map[28][25] = new Forteresse();
        map[29][25] = new Plaine();
        map[30][25] = new Village();
        map[31][25] = new Plaine();
        map[32][25] = new Plaine();
        map[33][25] = new Plaine();
        map[34][25] = new Plaine();
        map[35][25] = new Plaine();
        map[36][25] = new Plaine();
        map[37][25] = new Plaine();
        map[38][25] = new Forteresse();
        map[39][25] = new Plaine();


// LIGNE 27
        map[0][26] = new Plaine();
        map[1][26] = new Forteresse();
        map[2][26] = new Plaine();
        map[3][26] = new Foret();
        map[4][26] = new Foret();
        map[5][26] = new EauProfonde();
        map[6][26] = new EauProfonde();
        map[7][26] = new EauProfonde();
        map[8][26] = new EauProfonde();
        map[9][26] = new Plaine();
        map[10][26] = new Plaine();
        map[11][26] = new Foret();
        map[12][26] = new Foret();
        map[13][26] = new Foret();
        map[14][26] = new Foret();
        map[15][26] = new Foret();
        map[16][26] = new Foret();
        map[17][26] = new Village();
        map[18][26] = new Montagne();
        map[19][26] = new Montagne();
        map[20][26] = new Montagne();
        map[21][26] = new Foret();
        map[22][26] = new Montagne();
        map[23][26] = new Plaine();
        map[24][26] = new Village();
        map[25][26] = new Plaine();
        map[26][26] = new Plaine();
        map[27][26] = new Plaine();
        map[28][26] = new Plaine();
        map[29][26] = new Plaine();
        map[30][26] = new Plaine();
        map[31][26] = new Foret();
        map[32][26] = new Foret();
        map[33][26] = new Foret();
        map[34][26] = new Plaine();
        map[35][26] = new Plaine();
        map[36][26] = new Village();
        map[37][26] = new Plaine();
        map[38][26] = new Plaine();
        map[39][26] = new Plaine();


// LIGNE 28
        map[0][27] = new Plaine();
        map[1][27] = new Plaine();
        map[2][27] = new Plaine();
        map[3][27] = new EauProfonde();
        map[4][27] = new EauProfonde();
        map[5][27] = new EauProfonde();
        map[6][27] = new EauProfonde();
        map[7][27] = new Foret();
        map[8][27] = new EauProfonde();
        map[9][27] = new Foret();
        map[10][27] = new Foret();
        map[11][27] = new Foret();
        map[12][27] = new Foret();
        map[13][27] = new Foret();
        map[14][27] = new Foret();
        map[15][27] = new Foret();
        map[16][27] = new Foret();
        map[17][27] = new Colline();
        map[18][27] = new Montagne();
        map[19][27] = new Montagne();
        map[20][27] = new Foret();
        map[21][27] = new Foret();
        map[22][27] = new Plaine();
        map[23][27] = new Plaine();
        map[24][27] = new Village();
        map[25][27] = new Plaine();
        map[26][27] = new EauProfonde();
        map[27][27] = new EauProfonde();
        map[28][27] = new EauProfonde();
        map[29][27] = new EauProfonde();
        map[30][27] = new EauProfonde();
        map[31][27] = new EauProfonde();
        map[32][27] = new Foret();
        map[33][27] = new EauProfonde();
        map[34][27] = new EauProfonde();
        map[35][27] = new EauProfonde();
        map[36][27] = new EauProfonde();
        map[37][27] = new EauProfonde();
        map[38][27] = new EauProfonde();
        map[39][27] = new EauProfonde();


// LIGNE 29
        map[0][28] = new Plaine();
        map[1][28] = new Plaine();
        map[2][28] = new Plaine();
        map[3][28] = new EauProfonde();
        map[4][28] = new EauProfonde();
        map[5][28] = new EauProfonde();
        map[6][28] = new Foret();
        map[7][28] = new Foret();
        map[8][28] = new Foret();
        map[9][28] = new Foret();
        map[10][28] = new Foret();
        map[11][28] = new Foret();
        map[12][28] = new Foret();
        map[13][28] = new Foret();
        map[14][28] = new Colline();
        map[15][28] = new Colline();
        map[16][28] = new Colline();
        map[17][28] = new Colline();
        map[18][28] = new Colline();
        map[19][28] = new Plaine();
        map[20][28] = new Plaine();
        map[21][28] = new Foret();
        map[22][28] = new Plaine();
        map[23][28] = new Forteresse();
        map[24][28] = new Plaine();
        map[25][28] = new Plaine();
        map[26][28] = new EauProfonde();
        map[27][28] = new EauProfonde();
        map[28][28] = new EauProfonde();
        map[29][28] = new EauProfonde();
        map[30][28] = new EauProfonde();
        map[31][28] = new EauProfonde();
        map[32][28] = new EauProfonde();
        map[33][28] = new EauProfonde();
        map[34][28] = new EauProfonde();
        map[35][28] = new EauProfonde();
        map[36][28] = new EauProfonde();
        map[37][28] = new EauProfonde();
        map[38][28] = new EauProfonde();
        map[39][28] = new EauProfonde();

// LIGNE 30
        map[0][29] = new Plaine();
        map[1][29] = new Plaine();
        map[2][29] = new Plaine();
        map[3][29] = new EauProfonde();
        map[4][29] = new EauProfonde();
        map[5][29] = new EauProfonde();
        map[6][29] = new Foret();
        map[7][29] = new Foret();
        map[8][29] = new Foret();
        map[9][29] = new Foret();
        map[10][29] = new Foret();
        map[11][29] = new Foret();
        map[12][29] = new Foret();
        map[13][29] = new Colline();
        map[14][29] = new Colline();
        map[15][29] = new Colline();
        map[16][29] = new Colline();
        map[17][29] = new Colline();
        map[18][29] = new Colline();
        map[19][29] = new Plaine();
        map[20][29] = new Plaine();
        map[21][29] = new Plaine();
        map[22][29] = new Plaine();
        map[23][29] = new Plaine();
        map[24][29] = new Plaine();
        map[25][29] = new Plaine();
        map[26][29] = new EauProfonde();
        map[27][29] = new EauProfonde();
        map[28][29] = new EauProfonde();
        map[29][29] = new EauProfonde();
        map[30][29] = new EauProfonde();
        map[31][29] = new EauProfonde();
        map[32][29] = new EauProfonde();
        map[33][29] = new EauProfonde();
        map[34][29] = new EauProfonde();
        map[35][29] = new EauProfonde();
        map[36][29] = new EauProfonde();
        map[37][29] = new EauProfonde();
        map[38][29] = new EauProfonde();
        map[39][29] = new EauProfonde();

    }


       

        

        

        /* 
        for (int x = 0; x < tailleMaxColonne; x++) {
            for (int y = 0; y < tailleMaxLigne; y++) {
                // Utilisez les différentes classes de terrain pour chaque position de la carte
                if (x % 2 == 0) {
                    if (y % 2 == 0) {
                        map[x][y] = new Foret();
                    } else {
                        map[x][y] = new Plaine();
                    }
                } else {
                    if (y % 2 == 0) {
                        map[x][y] = new Montagne();
                    } else {
                        map[x][y] = new EauProfonde();
                    }
                }
            }
        }

        */

        // Créer la liste d'hexagones
        ArrayList<ArrayList<Hexagone>> cases = new ArrayList<>();

        // Ajouter des colonnes à la liste d'hexagones
        for (int x = 0; x < tailleMaxColonne; x++) {
            cases.add(new ArrayList<>());
        }

        // Ajouter les hexagones dans les colonnes
        for (int x = 0; x < tailleMaxColonne; x++) {
            for (int y = 0; y < tailleMaxLigne; y++) {
                // Créer un nouvel hexagone avec les informations données
                Hexagone hexagone = new Hexagone(null, map[x][y], true, x, y);
                // Remplacer "null" par une instance de la classe Unites si nécessaire
                // Remplacer "true" par la visibilité de l'hexagone si nécessaire

                // Ajouter l'hexagone à la colonne correspondante
                cases.get(x).add(hexagone);
            }
        }
        int y = 0;
        for (int x = 0; x < 7; x++) {
            Hexagone hexagone = cases.get(x).get(y);
            System.out.println("Hexagone [" + x + "][" + y + "]: " + hexagone.getTerrain().getClass().getSimpleName());
            System.out.println("Bonus de défense : " + hexagone.getTerrain().getBonusDef());
            System.out.println("Coût en points de déplacement : " + hexagone.getTerrain().getPointDeplacement());
            System.out.println("Occupable : " + hexagone.getTerrain().isOccupable());
            System.out.println();
        }


        /* 
        // Affichage des terrains de la carte
        for (int x = 0; x < tailleMaxColonne; x++) {
            for (int y = 0; y < tailleMaxLigne; y++) {
                Hexagone hexagone = cases.get(x).get(y);
                System.out.println("Hexagone [" + x + "][" + y + "]: " + hexagone.getTerrain().getClass().getSimpleName());
                System.out.println("Bonus de défense : " + hexagone.getTerrain().getBonusDef());
                System.out.println("Coût en points de déplacement : " + hexagone.getTerrain().getPointDeplacement());
                System.out.println("Occupable : " + hexagone.getTerrain().isOccupable());
                System.out.println();
            }
        }

        */
    }
}
