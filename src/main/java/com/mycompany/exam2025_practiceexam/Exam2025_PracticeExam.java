

package com.mycompany.exam2025_practiceexam;


public class Exam2025_PracticeExam {

    public static void main(String[] args) {
        
        // Setting up my 1D & 2D arrays
        String[] quarter = {"QUARTER 1", "QUARTER 2", "QUARTER 3"};     // Col names
        String[] year = {"YEAR 1", "YEAR 2"};       // Row names
        
        int[][] values = {
            {300, 150, 700},
            {250, 200, 600}
        };
        
        IProductSales sales = new ProductSales();
        
        // Printing my table
        System.out.println();
        String line = "-".repeat(55);
        
        System.out.println(line);
        System.out.printf("%-15s", "");
        for (int col = 0; col < quarter.length; col++) {
            System.out.printf("%-10s", quarter[col]);
        }
        System.out.println();
        
        for (int row = 0; row < values.length; row++) {
            System.out.printf("%-15s", year[row]);
            for (int col = 0; col < values[row].length; col++) {
                System.out.printf("%-10d", values[row][col]);
            }
            System.out.println();
        }
        
        // Printing the report
        String line2 = "*".repeat(55);
        
        
        System.out.println();
        System.out.println(line2);
        System.out.println("PRODUCT SALES REPORT - 2025");
        System.out.println(line);
        
        // Total for each row
        int[] rowTotals = new int[values.length];
        for (int row = 0; row < values.length; row++) {
            int total = 0;
            for (int col = 0; col < values[row].length; col++) {
                total += values[row][col];
            }
            rowTotals[row] = total;
        }
        
        // overall totals using row totals
        int grandTotal = sales.TotalSales(values);
        
        System.out.println("Total sales: " + grandTotal);
        
        // average sales
        
        double tableAverage = sales.AverageSales(values);
        System.out.printf("Average sales: %.0f%n", tableAverage);       // .0f means 0 decimal places, if i want 2 decimal places i would say ".2f%n"
        
        // max sale
        System.out.println("Maximum sale: " + sales.MaxSale(values));
        
        // min sale
        System.out.println("Minimum sale: " + sales.MinSale(values));
        
        
        
    }
}
