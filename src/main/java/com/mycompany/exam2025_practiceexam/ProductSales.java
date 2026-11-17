
package com.mycompany.exam2025_practiceexam;


public class ProductSales implements IProductSales {

    @Override
    public int TotalSales(int[][] productSales) {
    int total = 0; 
    for (int row = 0; row < productSales.length; row++) {
        for (int col = 0; col < productSales[row].length; col++) {
            total += productSales[row][col];
        }
    }
    return total;
    }

    @Override
    public double AverageSales(int[][] productSales) {
        int howManyNumbers = productSales.length * productSales[0].length;
        return (double) TotalSales (productSales) / howManyNumbers;
    }

    @Override
    public int MaxSale(int[][] productSales) {
    int maxRow = 0;
    int maxCol = 0;
    for (int row = 0; row < productSales.length; row++) {
        for (int col = 0; col < productSales[row].length; col++) {
            if (productSales[row][col] > productSales[maxRow][maxCol]) {
                maxRow = row;
                maxCol = col;
            }
        }
    }
    return productSales[maxRow][maxCol];
    }

    @Override
    public int MinSale(int[][] productSales) {
    int minRow = 0;
    int minCol = 0;
    for (int row = 0; row < productSales.length; row++) {
        for (int col = 0; col < productSales[row].length; col++) {
            if (productSales[row][col] < productSales[minRow][minCol]) {
                minRow = row;
                minCol = col;
            }
        }
    }
    return productSales [minRow][minCol];
    }
    
}
