package com.example.myapplication

import kotlin.random.Random

class BooleanMatrix(row: Int, column: Int): Matrix<Boolean>(row, column) {
    override val mainMatrix : List<MutableList<Boolean?>> = List(row){ MutableList(column){Random.nextBoolean()} };

    override operator fun set(row:Int, column: Int, value: Boolean) {
        this.mainMatrix[row][column] = value;
    }
}