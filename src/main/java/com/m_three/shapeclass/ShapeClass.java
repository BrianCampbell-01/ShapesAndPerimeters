/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.m_three.shapeclass;

/**
 *
 * @author Brian
 */

 
      


public class ShapeClass {
    
    public static class Shape
    {
        private String color = "Pink";
        
          public Shape()
        {
            
        }
          
        public double getArea()
        {
            return -1;
        }
     
        public double  getParimeter()
        {
            return -1;
        }
    }
   
    
    public static class Square extends Shape
    {
        private double length;
        private double width;
        private double area;
        private double parimeter;
        
        public Square(double l, double w)
        {
            this.length =l;
            this.width = w;
            area = length*width;
            parimeter = (length+width)*2;
        }
        @Override
         public double getArea()
        {
            return area;
        }
         @Override
        public double getParimeter()
        {
            return parimeter;
        }
    }
    
    
    public static class Rectangle extends Shape
    {
        private double length;
        private double width;
        private double area;
        private double parimeter;
           
        public Rectangle(double l, double w)
        {
            this.length =l;
            this.width = w;
            area = length*width;
            parimeter = (length+width)*2;
        }
        @Override
        public double getArea()
        {
            return area;
        }
        @Override
        public double getParimeter()
        {
            return parimeter;
        }
        
    }
    
    public static class  Triangle extends Shape
    {
        private double base;
        private double hieght;
        private double parimeter;
        private double area;
        public Triangle(double b, double h)
        {
            this.base =b;
            this.hieght = h;
            this.area=(.5*base*hieght);
        }
        
        @Override
        public double getArea()
        {
            return area;
        }
        @Override
        public double getParimeter()
        {
            double aSq= base*base;
            double bSq= hieght*hieght;
            double cSq = aSq + bSq; 
            double hypotenuse = Math.sqrt(cSq);
            parimeter = base + hieght+ hypotenuse;
            return parimeter;
        }
    }
    
    public static class Circle extends Shape
    {
        private double pi = Math.PI;
        private double radius;
        private double area;
        private double parimeter;
        
        public Circle(double r)
        {
            radius = r;
            area = pi * Math.pow(radius,2);
            parimeter = 2*pi*radius;
        }
        @Override
        public double getArea()
        {
            return area;
        }
        @Override
        public double getParimeter()
        {

            return parimeter;
        }
    }
    
    public static void main(String[] args)
    {
        Square sq =  new Square(5,5);
       
        System.out.println("Shape Square~ Area:"+ sq.getArea() + " Parimeter: " + sq.getParimeter());
        Rectangle rect = new Rectangle(5,5);
        System.out.println("Shape Rectangle~ Area:"+ rect.getArea() + " Parimeter: " + rect.getParimeter());
        Triangle tri =  new Triangle(5,5);
        System.out.println("Shape Triangle~ Area:"+ tri.getArea() + " Parimeter: " + tri.getParimeter());
        Circle circle = new Circle(5);
        System.out.println("Shape Circle~ Area:"+ circle.getArea() + " Parimeter: " + circle.getParimeter());
    
    }
}
