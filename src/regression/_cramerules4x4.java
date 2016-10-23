/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regression;

import static regression._dataImport.data;

public class _cramerules4x4 {

//    private static final String LETTERS = "abcrdefsghit";
    private static final boolean DEBUG = false;
   
    
    public static double[][] getLinearSystem() {

        double[][] linearSystem = new double[4][5];

        for (int i = 0; i < linearSystem.length; i++) {
            for (int j = 0; j < linearSystem[i].length; j++) {
                linearSystem[i][j] = data[i][j];
            }
        }

        return linearSystem;
    }
    
    public static double[][] getDeterminate(double[][] linearSystem) {
        if (linearSystem.length != 4) {
            throw new IllegalArgumentException("double[][] linearSystem argument does not have exactly 4 rows.");
        }
        if (linearSystem[0].length != 5) {
            throw new IllegalArgumentException("double[][] linearSystem argument does not have exactly 5 columns.");
        }

        double[][] determinate = new double[4][4];

        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 4; c++) {
                determinate[r][c] = linearSystem[r][c];
            }
        }

        return determinate;
    }

    public static double evaluateDeterminate(double[][] det) {
        if (det.length != 4) {
            throw new IllegalArgumentException("double[][] det argument does not have exactly 4 rows.");
        }
        if (det[0].length != 4) {
            throw new IllegalArgumentException("double[][] det argument does not have exactly 4 columns.");
        }

        double sum = 0.0;
        
        sum += det[0][0] * (((det[1][1] * det[2][2] * det[3][3]) + 
                             (det[1][2] * det[2][3] * det[3][1]) + 
                             (det[1][3] * det[2][1] * det[3][2]))-
                            ((det[3][1] * det[2][2] * det[1][3]) + 
                             (det[3][2] * det[2][3] * det[1][1]) + 
                             (det[3][3] * det[2][1] * det[1][2])));
        
        sum -= det[0][1] * (((det[1][0] * det[2][2] * det[3][3]) + 
                             (det[1][2] * det[2][3] * det[3][0]) + 
                             (det[1][3] * det[2][0] * det[3][2]))- 
                            ((det[3][0] * det[2][2] * det[1][3]) + 
                             (det[3][2] * det[2][3] * det[1][0]) + 
                             (det[3][3] * det[2][0] * det[1][2])));
        
        sum += det[0][2] * (((det[1][0] * det[2][1] * det[3][3]) + 
                             (det[1][1] * det[2][3] * det[3][0]) + 
                             (det[1][3] * det[2][0] * det[3][1]))- 
                            ((det[3][0] * det[2][1] * det[1][3]) + 
                             (det[3][1] * det[2][3] * det[1][0]) + 
                             (det[3][3] * det[2][0] * det[1][1])));
        
        sum -= det[0][3] * (((det[1][0] * det[2][1] * det[3][2]) + 
                             (det[1][1] * det[2][2] * det[3][0]) + 
                             (det[1][2] * det[2][0] * det[3][1])) - 
                            ((det[3][0] * det[2][1] * det[1][2]) + 
                             (det[3][1] * det[2][2] * det[1][0]) + 
                             (det[3][2] * det[2][0] * det[1][1])));

        if (DEBUG) {
            System.out.println("evaluateDeterminate(double[][]) returning sum = " + sum);
        }
        
        System.out.println(sum);
        return sum;
    }

    // int columnToReplace is the 1-based column to replace
    public static double[][] getDetVar(double[][] detD, double[] constants, int columnToReplace) {
        if (detD.length != 4) {
            throw new IllegalArgumentException("double[][] detD argument does not have exactly 4 rows.");
        }
        if (detD[0].length != 4) {
            throw new IllegalArgumentException("double[][] detD argument does not have exactly 4 columns.");
        }
        if (constants.length != 4) {
            throw new IllegalArgumentException("double[] constants argument does not have exactly 4 elements.");
        }
        if (columnToReplace < 1 || columnToReplace > 4) {
            throw new IllegalArgumentException("Illegal argument to int columnToReplace: " + columnToReplace);
        }

        double[][] detVar = new double[4][4];

        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 4; c++) {
                detVar[r][c] = detD[r][c];
            }
        }

        columnToReplace--;
        for (int r = 0; r < 4; r++) {
            detVar[r][columnToReplace] = constants[r];
        }

        return detVar;
    }

}
