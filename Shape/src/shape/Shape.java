package shape;
/**
 Author: Kevin De Jesus
 File: Shape.java
 I affirm that this program is entirely my own work and none of it is the work 
 of any other person.
	__________Kevin De Jesus_________
	(your signature)
 */

/**
 Generic abstract shape class that provides methods that any Class that derives
 from the Shape class can use.
 */
public abstract class Shape implements Comparable{
    Point3D point;
    
    /**
     Constructs point with 3 dimensions.
     @param x x-coordinate
     @param y y-coordinate
     @param z z-coordinate
     */
    public Shape(int x, int y, int z){
        point = new Point3D(x, y, z);
    }
    
    /**
     Returns the distance of the center of the shape from the origin'
     @return distance from origin
     */
    public double getDistance(){
        double x = (double)point.getX();
        double y = (double)point.getY();
        double z = (double)point.getZ();
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }
    
    /**
     Returns the surface area of a shape.
     @return surface area
     */
    public abstract double getSurfaceArea();
    
    /**
     Returns the volume of a shape.
     @return volume
     */
    public abstract double getVolume();
    
    @Override
    public String toString(){
       return point.toString();
    }
    
    /**
     Compares two shapes with another in terms of volume.
     @param obj The shape object
     @return integer that indicates whether the implicit parameter, the explicit
     parameter is larger, or equal
     */
    @Override
    public int compareTo(Object obj){
        /*
        downcasts from object to shape to make sure the shapes can be compared 
        without throwing an error.
        */
        Shape shape = (Shape)obj;
        
        /*
        Compares the volume of two shapes and will be used by an array to sort
        in ascending order by volume.
        */
        if(this.getVolume() < shape.getVolume()){
            return -1;
        }
        else if(this.getVolume() > shape.getVolume()){
            return 1;
        }
        else{
            return 0;
        }
    }
}
