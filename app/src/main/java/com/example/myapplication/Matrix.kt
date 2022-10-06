package com.example.myapplication

import kotlin.random.Random

fun main(){
    /*val matrix = Matrix(5,5);
    val matrix2 = Matrix(5,6);*/
    /*println("coucou");
    println(matrix.toString());
    matrix[2, 2] = 5;
    println(matrix.toString());
    println("matrix 1 is square : " + matrix.isQuare());
    println("matrix 2 is square : " + matrix2.isQuare());*/
    /*val square = SquareMatrix(8);
    println(square.toString());
    val booleanMatrix = BooleanMatrix(5,8);
    println(booleanMatrix.toString());
    println(booleanMatrix.toString());*/
    /*val intMatrix = IntMatrix(5,9);
    println(intMatrix.toString());
    val intMatrix = IntMatrix(5,4);
    intMatrix[0,0] = 5;
    intMatrix[0,1] = 5;
    val intMatrixBis = IntMatrix(5,4);
    intMatrixBis[0,0] = 5;
    intMatrixBis[0,1] = 5;
    val finalMatrix = intMatrix * intMatrixBis;
    println(finalMatrix.mainMatrix.toString());
    intMatrix *= intMatrixBis;
    println(intMatrix.mainMatrix.toString());*/
    val mneMatrix = MinesweperBoard(5,6);
    println(mneMatrix.mainMatrix.toString());
    println("coucou 1");
    val intMatrix = mneMatrix.getBoardHints();
    println("int matrix to display");
    println(intMatrix.toString());
    println(intMatrix.mainMatrix.toString());
    println("coucou 2");
    mneMatrix.toString();

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
                if(this.mainMatrix[i][j] == null)
                    newString += "-,";
                else
                    newString+= (this.mainMatrix[i][j].toString() + ",");
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