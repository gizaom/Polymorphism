package shape;

import java.util.Arrays;

/**
 Author: Kevin De Jesus
 File: Driver.java
 I affirm that this program is entirely my own work and none of it is the work 
 of any other person.
	__________Kevin De Jesus_________
	(your signature)
 */

/**
 Test class to make sure that the program functions properly.
 */
public class Driver {
    public static void main (String [] args ){
        //array with shape objects initialized.
        Shape[] shapes = {new Sphere(2, -7, 5, 15), 
        new Parallelepiped(7, 3, 9, 37, 9, 12), new Cylinder(3, -5, 5, 13, 10),
        new Cone(-5, 3, -1, 14, 11)};
    
        //prints the center coordinates and additional input data of each shape
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
            System.out.println("surface area: " + shape.getSurfaceArea());
            System.out.println("volume: " + shape.getVolume() + "\n");
        }
        
        /*
        sorts the array of shapes by ascending order of volume.
        */
        Arrays.sort(shapes);
        
        /*
        displays the shapes and their volumes in ascending order.
        */
        for(Shape shape : shapes){
            System.out.println(shape.getClass().getName());
            System.out.println("volume: " + shape.getVolume() + "\n");
        }
        
        /*
        sorts the array by descending order of the distance from the center
        of each shape
        */
        Arrays.sort(shapes, new ShapeComparer());
        
        /*
        displays the shapes and their distance from their center in descending
        order.
        */
        for(Shape shape: shapes){
            System.out.println(shape.getClass().getName());
            System.out.println("distance from origin: " 
                    + shape.getDistance() + "\n");
        }
    }
}
