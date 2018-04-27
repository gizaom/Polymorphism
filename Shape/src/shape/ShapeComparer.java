package shape;
import java.util.Comparator;

/**
 Author: Kevin De Jesus
 File: ShapeComparer.java
 I affirm that this program is entirely my own work and none of it is the work 
 of any other person.
	__________Kevin De Jesus_________
	(your signature)
 */

/**
 Shape comparer that implements the Comparator class.
 */
public class ShapeComparer implements Comparator{
    
    public int compare(Object obj1, Object obj2){
        /*
        downcasts both objects to make sure they both can be compared to one 
        another without throwing an error.
        */
        Shape shape1 = (Shape)obj1;
        Shape shape2 = (Shape)obj2;
        
        /*
        Compares shapes by distance from origin in order to be sorted later
        by descending order in an array.
        */
        if(shape1.getDistance() < shape2.getDistance()){
            return 1;
        }
        if(shape1.getDistance() > shape2.getDistance()){
            return -1;
        }
        else return 0;
    }
}
