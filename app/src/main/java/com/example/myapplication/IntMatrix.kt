package com.example.myapplication

import kotlin.random.Random

class IntMatrix (row: Int, column: Int): Matrix<Int>(row, column) {
    override val mainMatrix : List<MutableList<Int?>> = List(row){ MutableList(column){ Random.nextInt(1,100) } };

    operator fun times(matrix2: IntMatrix): IntMatrix {
        var finalMatrix = IntMatrix(this.row, this.column);
        for (i in 0 until this.row){
            for (j in 0 until this.column){
                finalMatrix.mainMatrix[i][j] = this.mainMatrix[i][j]?.times(matrix2.mainMatrix[i][j]!!);
            }
        }
        return finalMatrix;
    }

    operator fun timesAssign(matrix2: IntMatrix) {
        for (i in 0 until this.row){
            for (j in 0 until this.column){
                this.mainMatrix[i][j] = this.mainMatrix[i][j]?.times(matrix2.mainMatrix[i][j]!!);
            }
        }
    }

    private operator fun get(i: Int): Any {
        return i;
    }
}

private operator fun Any.get(j: Int): Int {
    return j;
}
