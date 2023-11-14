# ObjectDB with JPA Sample Project

This example project, developed by Anyel-EC, showcases the usage of ObjectDB (an object-oriented database) along with Java Persistence API (JPA) for object persistence in a relational database.

## Maven Configuration

Make sure to include the following configurations in your `pom.xml` for seamless integration with ObjectDB:

```xml
<repositories>
    <repository>
        <id>objectdb</id>
        <name>ObjectDB Repository</name>
        <url>https://m2.objectdb.com</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.objectdb</groupId>
        <artifactId>objectdb</artifactId>
        <version>2.8.9</version>
    </dependency>

    <dependency>
        <groupId>javax.transaction</groupId>
        <artifactId>jta</artifactId>
        <version>1.1</version>
    </dependency>
</dependencies>
```

## Point Class

The `Point` class represents a point in a two-dimensional space and is annotated with `@Entity` for persistence in the database. It includes a unique identifier (`id`), `x` and `y` coordinates, and methods to access these values.

## Main Class

The `Main` class contains a main program demonstrating how to use ObjectDB with JPA. It opens a connection to the database, stores 1000 `Point` objects, performs queries to find the total number of points and the average value of the `x` coordinate, and retrieves all points stored in the database.

**Author:** Anyel-EC

**Execution Instructions:**
1. Ensure you have an instance of ObjectDB Server running.
2. Compile and run the main program (`Main.java`).
3. Observe the results of the queries in the console.

Enjoy exploring the integration of ObjectDB and JPA in this example project!
