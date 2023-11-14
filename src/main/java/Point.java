import java.io.Serializable;
import javax.persistence.*;

// The class is marked as an entity for Java Persistence API (JPA)
@Entity
public class Point implements Serializable {
    private static final long serialVersionUID = 1L;
    // Primary key field with automatic generation of values
    @Id @GeneratedValue
    private long id;
    // Fields representing the coordinagit tes of the point
    private int x;
    private int y;
    // Default constructor required by JPA
    public Point() {
    }
    // Parameterized constructor for initializing the coordinates
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // Getter method for retrieving the id
    public Long getId() {
        return id;
    }
    // Getter method for retrieving the x-coordinate
    public int getX() {
        return x;
    }
    // Getter method for retrieving the y-coordinate
    public int getY() {
        return y;
    }
    // toString method for obtaining a string representation of the point
    @Override
    public String toString() {
        return String.format("(%d, %d)", this.x, this.y);
    }
}
