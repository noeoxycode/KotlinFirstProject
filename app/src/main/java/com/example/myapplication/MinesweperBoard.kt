package com.example.myapplication

class MinesweperBoard(row: Int, column: Int): Matrix<Boolean>(row, column) {
    fun getBoardHints (): IntMatrix {
        val intMatrixBis = IntMatrix(this.row, this.column);
        var bomb: String = "*";
        for (i in 0 until  this.row) {
            newString+= "[";
            for (j in 0 until  this.column) {
                if(this.mainMatrix[i][j] == true)
                    newString += "*";
                else
                    newString+= (this.mainMatrix[i][j].toString() + ",");
            }
            newString+= "] \n";
        }
        return newString;
    }
}