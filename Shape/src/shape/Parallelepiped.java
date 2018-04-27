package shape;
/**
 Author: Kevin De Jesus
 File: Parallelepiped.java
 I affirm that this program is entirely my own work and none of it is the work 
 of any other person.
	__________Kevin De Jesus_________
	(your signature)
 */

/**
 Parallelepiped that implements the Shape class.
 */
public class Parallelepiped extends Shape{
    private final double length, width, height;
    
    /**
     Constructs a parallelepiped.
     @param x x-coordinate of the center
     @param y y-coordinate of the center
     @param z z-coordinate of the center
     @param length length
     @param width width
     @param height height
     */
    public Parallelepiped(int x, int y, int z, double length, double width,
    double height){
        super(x, y, z);
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    /**
     Returns the surface area of the parallelepiped.
     @return surface area
     */
    @Override
    public double getSurfaceArea() {
        double ab = length * width;//length * width represented as a*b
        double ac = length * height;//length * height represented as a*c
        double bc = width * height;//width * height represented as b*c
        
        /*
        formula for the surface area of a parallelepiped, 2(ab + ac + bc).
        */
        return 2.0 * (ab + ac + bc);
    }
    
    /**
     Returns the volume of the parallelepiped.
     @return volume
     */
    @Override
    public double getVolume(){
        /*
        formula for the volume of a parallelepiped, a*b*c or Length*width*height
        */
        return length * width * height;
    }
    
    /**
     Returns a String representation of a parallelepiped in terms of center
     coordinates, length, width, and height.
     @return String with x,y, and z coordinates, length, width, and height
     */
    public String toString(){
        return this.getClass() + " center coordinates: " + super.toString() 
                + " length: " + length + " width: " + width 
                + " height: " + height;
    }
}
