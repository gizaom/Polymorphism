package shape;
/**
 Author: Kevin De Jesus
 File: Point3D.java
 I affirm that this program is entirely my own work and none of it is the work 
 of any other person.
	__________Kevin De Jesus_________
	(your signature)
 */

/**
 A 3 dimensional point.
 */
public class Point3D {
    private int x, y, z;//coordinates for the point.
    
    /**
     Constructs a 3 dimensional point.
     @param x x-coordinate
     @param y y-coordinate
     @param z z-coordinate
     */
    Point3D(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    /**
     Returns x-coordinate of point.
     @return x-coordinate
     */
    public int getX(){
        return x;
    }
    
    /**
     Returns y-coordinate of point.
     @return y-coordinate
     */
    public int getY(){
        return y;
    }
    
    /**
     Returns z-coordinate.
     @return z-coordinate
     */
    public int getZ(){
        return z;
    }
    
    /**
     Sets the x-coordinate to a specific integer.
     * @param x x-coordinate
     */
    public void setX(int x){
        this.x = x;
    }
    
    /**
     Sets the y-coordinate to a specific integer.
     @param y y-coordinate
     */
    public void setY(int y){
        this.y = y;
    }
    
    /**
     Sets the z-coordinate to a specific integer.
     @param z z-coordinate
     */
    public void setZ(int z){
        this.z = z;
    }
    
    /**
     Returns the 3 dimensional coordinates of the point in String format.
     @return String with x, y and z coordinates of the point
     */
    @Override
    public String toString(){
        return "x-coordinate: " + x + " y-coordinate: " + y 
                + " z-coordinate: " + z;
    }
}
