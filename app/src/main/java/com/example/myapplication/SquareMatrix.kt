package com.example.myapplication

import kotlin.random.Random

class SquareMatrix(size: Int): Matrix<Int>(size, size) {
    override val mainMatrix : List<MutableList<Int?>> = List(size){ MutableList(size){ Random.nextInt(1,100)} };
}

