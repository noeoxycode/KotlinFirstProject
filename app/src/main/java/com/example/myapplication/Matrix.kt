package com.example.myapplication

import kotlin.random.Random

fun main(){
/*
    //Création d'une matrice classique impossible car classe abstraite
    val matrix = Matrix(5,5);
*/

/*
    //Création d'une matrice booléenne et affichage
    val booleanMatrix = BooleanMatrix(5,8);
    println(booleanMatrix.toString());
*/

/*
    //Création et controle de deux matrices pour voir si elles sont carrées
    val matrix1 = IntMatrix(1,5);
    println("Matrix 1 : \n $matrix1");
    val matrix2 = BooleanMatrix(5,5);
    println("Matrix 2 : \n $matrix2");
    println("matrix1 is square : " + matrix1.isQuare());
    println("matrix2 is square : " + matrix2.isQuare());
*/

/*
    //Multiplication de matrices
    val intMatrix = IntMatrix(5,5);
    val intMatrixBis = IntMatrix(5,5);
    println("Affichage de la matrice 1 : \n $intMatrix");
    println("Affichage de la matrice 2 : \n $intMatrixBis");
    //On assigne 5 aux cases [0][0] puis on les multiplies avec *
    intMatrix[0,0] = 5;
    intMatrixBis[0,0] = 5;
    val finalMatrix = intMatrix * intMatrixBis;
    println("Résultat du produit des deux matrices, avec 25 en [0][0] : \n" + finalMatrix.toString());
    //On répète l'opération avec l'opérateur *= et on obtient 125 en [0][0]
    finalMatrix *= intMatrix;
    println("Résultat du produit des deux matrices, avec 125 en [0][0] avec l'opérateur *= : \n" + finalMatrix.toString());
*/

/*
    //Afficher une matrix carré
    println("Affichage d'une matrice carré");
    val squareMatrix = SquareMatrix(5);
    println(squareMatrix.toString());
    squareMatrix[0,0] = 999;
    println("On assigne la valeur 999 à la case [0][0]");
    println(squareMatrix.toString());
*/

/*
    //Afficher un terrain de démineur
    val mneMatrix = MinesweperBoard(Random.nextInt(5,10),Random.nextInt(5,10));
    println("Terrain de " + mneMatrix.row + " row et " + mneMatrix.column + " columns");
    println(mneMatrix.getBoardHints().toString());
*/
}

abstract class Matrix<T>(val row: Int, val column: Int) {
    open val mainMatrix : List<MutableList<T?>> = List(row){ MutableList(column){null} };

    open operator fun set(row:Int, column: Int, value: T) {
        this.mainMatrix[row][column] = value;
    }

    override fun toString(): String {
        var newString: String = "";
        for (i in 0 until  this.row) {
            newString+= "[";
            for (j in 0 until  this.column) {
                if(this.mainMatrix[i][j] == -1)
                    newString += " * ";
                else
                    newString+= (" " + this.mainMatrix[i][j].toString() + " ");
            }
            newString+= "] \n";
        }
        return newString;
    }

    fun isQuare(): Boolean {
        if(this.row != this.column)
            return false;
        else
            return true;
    }
}