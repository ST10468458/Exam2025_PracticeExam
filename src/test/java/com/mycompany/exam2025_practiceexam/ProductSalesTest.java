
package com.mycompany.exam2025_practiceexam;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ProductSalesTest {
    
    public ProductSalesTest() {
    }

    @Test
    public void testCalculateTotalSales_ReturnsTotalSales() {
        System.out.println("TotalSales");
        int[][] productSales = {
            {300, 150, 700},
            {250, 200, 600}
         };
        
        ProductSales sales = new ProductSales();
        int expResult = 2200;
        int result = sales.TotalSales(productSales);
        assertEquals(2200, result);
        
    }

    @Test
    public void testAverageSales_ReturnsAverageProductSales() {
        System.out.println("AverageSales");
        int[][] productSales = {
            {300, 150, 700},
            {250, 200, 600}
         };
        ProductSales sales = new ProductSales();
        double expResult = 367;
        double result = sales.AverageSales(productSales);
        assertEquals(367, result, 0.5);
       
    }

    
    
}
