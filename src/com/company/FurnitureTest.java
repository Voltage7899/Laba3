package com.company;

public class FurnitureTest {
    public static void main (String[] args)
    {
        Furniture table =new Table(500f,1,110,70,"black","wood");
        Furniture Cupboard =new Cupboard(450f,2,250,100,"Brown","Wood");
        FurnitureShop table1=new FurnitureShop(true,500f);
        FurnitureShop Cupboard2 =new FurnitureShop(true,400f);
        table.FurnitureInfo();
        table1.deal(table1,table);
        Cupboard.FurnitureInfo();

    }





}
