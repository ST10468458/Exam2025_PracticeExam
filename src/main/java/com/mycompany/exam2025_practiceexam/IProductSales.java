
package com.mycompany.exam2025_practiceexam;


public interface IProductSales {

    // REMINDER: in main, create an object first -> ProductSales sales = new ProductSales();
    // then call: sales.TotalSales(values);
    // NOTE: pass the array name from MAIN (values), NOT the parameter name (productSales)
    int TotalSales (int[][] productSales);

    // REMINDER: in main, create an object first -> ProductSales sales = new ProductSales();
    // then call: sales.AverageSales(values);
    // NOTE: pass the array name from MAIN (values), NOT the parameter name (productSales)
    double AverageSales (int[][] productSales);

    // REMINDER: in main, create an object first -> ProductSales sales = new ProductSales();
    // then call: sales.MaxSale(values);
    // NOTE: pass the array name from MAIN (values), NOT the parameter name (productSales)
    int MaxSale (int[][] productSales);

    // REMINDER: in main, create an object first -> ProductSales sales = new ProductSales();
    // then call: sales.MinSale(values);
    // NOTE: pass the array name from MAIN (values), NOT the parameter name (productSales)
    int MinSale (int[][] productSales);

}
