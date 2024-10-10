public class Bottle {
    private String brand;
    private String color;
    private float capacity;

    private String expiration;


    /*
    COnstructors initialize values for the object
     */
    public Bottle() {
        // no arg constructor
        // no params
        // means no input into this method
        // so... the interpretation of this is...
        // the following code
        // is used to create an object of Bottle class
        // and initialize its data
        // but i have no extra information to use
        // bc no parameters passed
        // what are the "default" values related
        // to a bottle
        // this is pretty arbitrary
        brand = "No name";
        color = "Clear";
        capacity = 12;
    }

    public Bottle(float capacity) {
        /*
        code to be used to create a bottle
        and initialize data
        this time i have a capacity value
         */

        // repeated code = bad code
//        brand = "No name";
//        color = "Clear";

        this();  // calling the constructor with no arguments
        // same as doing Bottle();
        // this is an example of
        // constructor chaining

        if (capacity > 0)
            this.capacity = capacity;
    }

    public Bottle(String brand, float capacity) {
        // don't repeat code...
        this(capacity);
        // this chained constructor will actually call
        // both constructors above
        
        this.brand = brand;
    }

    public Bottle(String brand, String initialColor, float initialCapacity) {
        String expiration;
        // this doesn't conflict with the instance variable expiration
        // because the program knows about variable scope
        // local variable scope will supercede the class scope
        expiration = "March 10";

        this.expiration = "July 10";

        this.brand = brand;
        // differentiates between the instance var "brand"
        // vs the parameter "brand"

        color = initialColor;
        this.capacity = initialCapacity;
        /*
        this is replaced by levsBottle or logansBottle
        ref var depending on WHEN in the program we're talking about
         */
    }
    void setBrand(String brand) {
        this.brand = brand;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setCapacity(float capacity) {
        this.capacity = capacity;
    }
}

class App {
    public static void main(String[] args) {
        Bottle logansBottle = new Bottle("Gatorade", "Green", 32);
        Bottle levsBottle = new Bottle("Hydroflask", "Black", 32);
    }
}
