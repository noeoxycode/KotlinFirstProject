package com.example.myapplication

class MinesweperBoard(row: Int, column: Int): BooleanMatrix(row, column) {
    fun getBoardHints (): IntMatrix {
        val intMatrixBis = IntMatrix(this.row, this.column);
        var bomb: String = "*";
        println(this.row-1<=0);
        println(this.column-1<=0);
        for (i in 0 until  this.row) {
            for (j in 0 until  this.column) {
                processAction(i,j,intMatrixBis);
            }
        }
        println(intMatrixBis.toString());
        return intMatrixBis;
    }

    private fun processAction(i: Int, j: Int, intMatrixBis: IntMatrix) {
        var cptBombAround = 0;
        if(this.mainMatrix[i][j] == false){
            if(this.row - 1 >= 0){
                if(this.mainMatrix[i-1][j] == true)
                    cptBombAround+=1;
                if(this.column-1 >= 0){
                    if(this.mainMatrix[i-1][j-1] == true)
                        cptBombAround+=1;
                }
                if(this.column+1 < column){
                    if(this.mainMatrix[i-1][j+1] == true)
                        cptBombAround+=1;
                }
            }
            if(this.row-1 >= 0){
                if(this.mainMatrix[i-1][j] == true)
                    cptBombAround+=1;
            }
            if(this.column+1 < column){
                if(this.mainMatrix[i+1][j] == true)
                    cptBombAround+=1;
            }
            if(this.row + 1 < row){
                if(this.mainMatrix[i+1][j] == true)
                    cptBombAround+=1;
                if(this.column-1 >= 0){
                    if(this.mainMatrix[i+1][j-1] == true)
                        cptBombAround+=1;
                }
                if(this.column+1 < column){
                    if(this.mainMatrix[i+1][j+1] == true)
                        cptBombAround+=1;
                }
            }
            println()
            println(cptBombAround);
            intMatrixBis.mainMatrix[i][j] = cptBombAround;
        }
        else{
            intMatrixBis.mainMatrix[i][j] = -1;
            println("bomb");
        }
    }


}