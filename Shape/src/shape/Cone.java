package shape;
/**
 Author: Kevin De Jesus
 File: Cone.java
 I affirm that this program is entirely my own work and none of it is the work 
 of any other person.
	__________Kevin De Jesus_________
	(your signature)
 */

/**
 Cone that implements the Shape class.
 */
public class Cone extends Shape{
    private final double radius, height;
    
    /**
     Constructs a cone with center coordinates, radius and height.
     @param x x-coordinate
     @param y y-coordinate
     @param z z-coordinate
     @param radius radius
     @param height height
     */
    public Cone(int x, int y, int z, double radius, double height){
        super(x, y, z);
        this.radius = radius;
        this.height = height;
    }
    
    /**
     Returns the surface area of a cone.
     @return surface area
     */
    @Override
    public double getSurfaceArea() {
        /*
        formula to calculate slant height to use in formula for surface area.
        */
         double slantHeight = Math.sqrt(Math.pow(radius, 2.0) 
                 + Math.pow(height, 2.0));
         
         /*
         formula for the surface area of a cone, πr(r + s)
         */
         return Math.PI * radius * (radius + slantHeight);
    }
    
    /**
     Returns the volume of the cone.
     @return volume
     */
    @Override
    public double getVolume() {
        /*
        formula for the volume of a cone, (πr^2h)/3.
        */
        return (Math.PI * Math.pow(radius, 2.0) * height) / 3.0;
    }
    
    /**
     String representation of a cone in terms of x, y, and z coordinates, radius
     and height.
     @return  String with x, y, z coordinates, radius and height
     */
    @Override
    public String toString(){
        return this.getClass() + " Center coordinates: " + super.toString() 
                + " Radius: " + radius + " Height: " + height;
    }
}
