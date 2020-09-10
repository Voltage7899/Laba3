package com.company;

public class FurnitureShop {
    private boolean client_agree;
    private float money;
    FurnitureShop(boolean client_agree,float money)
    {
    this.client_agree=client_agree;
    this.money=money;
    }
    public  void deal(FurnitureShop t1,Furniture t)
    {

        if(t1.client_agree&&t1.money== t.getPrice()) {
            System.out.println("deal made");
        }
    }





}
