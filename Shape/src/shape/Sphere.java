package shape;
/**
 Author: Kevin De Jesus
 File: Sphere.java
 I affirm that this program is entirely my own work and none of it is the work 
 of any other person.
	__________Kevin De Jesus_________
	(your signature)
 */

/**
  Sphere that implements the Shape class.
 */
public class Sphere extends Shape{
    private final double radius;
    
    /**
     Constructs a sphere.
     @param x x-coordinate of the center
     @param y y-coordinate of the center
     @param z z-coordinate of the center
     @param radius radius
     */
    public Sphere(int x, int y, int z, double radius){
        super(x, y, z);
        this.radius = radius;
    }
    
    /**
     Returns the surface area of a sphere.
     @return surface area
     */
    @Override
    public double getSurfaceArea(){
        /*
        formula for surface area of a sphere, 4πr^2.
        */
        return 4.0 * Math.PI * Math.pow(radius, 2.0);
    }
    
    /**
     Returns the volume of a sphere.
     @return volume
     */
    @Override
    public double getVolume(){
        /*
        formula for the volume of a sphere, 4/3πr^2.
        */
        return(4.0 / 3.0 * Math.PI * Math.pow(radius, 3));
    }
    
    /**
     Returns a string representation of the center of the sphere in terms of
     x, y, and z coordinates, and the radius of the sphere.
     @return String with x,y, and z coordinates and the radius
     */
    @Override
    public String toString(){
        return this.getClass() + " Center coordinates: " + super.toString() 
                + " Radius: " + radius;
    }
}
