package com.company;

public class Cupboard extends Furniture{
    private String type;
    public Cupboard(float price,int number,int height,float weight,String colour,String material)
    {
        super(price,number,height,weight,colour,material);
        this.type=type;
    }
    public void FurnitureInfo()
    {
        System.out.println("Number "+super.getNumber()+"parameters are : "+ super.getHeight()+" "+super.getWeight()+" "+super.getColour()+" "+super.getMaterial()+" "+type);

    }




}
