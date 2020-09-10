package com.company;

public abstract class Furniture {
    private float price;
    private int number;
    private int height;
    private float weight;
    private String colour;
    private String material;
    public float getPrice()
    {
        return price;
    }
    public int getNumber()
    {
        return number;
    }
    public int getHeight()
    {
        return height;
    }
    public float getWeight()
    {
        return weight;
    }
    public String getColour()
    {
        return colour;
    }
    public String getMaterial()
    {
        return material;
    }
     abstract public void FurnitureInfo();

    public Furniture(float price,int number,int height,float weight,String colour,String material)
    {
        this.price=price;
        this.number=number;
        this.height=height;
        this.weight=weight;
        this.colour=colour;
        this.material=material;
    }




}
