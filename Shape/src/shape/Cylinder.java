package shape;
/**
 Author: Kevin De Jesus
 File: Cylinder.java
 I affirm that this program is entirely my own work and none of it is the work 
 of any other person.
	__________Kevin De Jesus_________
	(your signature)
 */

/**
 Cylinder that implements the Shape class.
 */
public class Cylinder extends Shape{
    private final double radius, height;
    
    /**
     Constructs a cylinder with center coordinates, radius and height.
     @param x x coordinate of center
     @param y y coordinate of center
     @param z z coordinate of center
     @param radius radius
     @param height height
     */
    public Cylinder(int x, int y, int z, double radius, double height){
        super(x, y, z);
        this.radius = radius;
        this.height = height;
    }
    
    /**
     Returns the surface area of a cylinder.
     @return surface area
     */
    @Override
    public double getSurfaceArea() {
        /*
        formula for the surface area of a cylinder, 2πr^2 + 2πrh.
        */
        return (2.0 * Math.PI * Math.pow(radius, 2.0)) 
                + (2.0 * Math.PI * radius * height);
    }
    
    /**
     Returns the volume of a cylinder.
     @return volume
     */
    @Override
    public double getVolume() {
        /*
        formula for the volume of a cylinder, πr^2h.
        */
         return Math.PI * Math.pow(radius, 2.0) * height;
    }
    
    /**
     Returns a string representation of the center of the cylinder in terms of
     x, y, and z coordinates, radius and height.
     @return String with x,y, and z coordinates, radius, and height
     */
    @Override
    public String toString(){
        return this.getClass() + " Center coordinates: " + super.toString() 
                + " Radius: " + radius + " Height: " + height;
    }
}
