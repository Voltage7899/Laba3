package com.company;

 public class Table extends Furniture  {
    private String Type_of_Table;
    public Table(float price,int number,int height,float weight,String colour,String material)
    {
        super(price,number,height,weight,colour,material);
        this.Type_of_Table=Type_of_Table;
    }
    public void FurnitureInfo()
    {
        System.out.println("Number "+super.getNumber()+" parameters are :"+ super.getHeight()+" " +super.getWeight()+" "+super.getColour()+" "+super.getMaterial()+" "+Type_of_Table );

    }
}
