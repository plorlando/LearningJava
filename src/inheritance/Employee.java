package inheritance;

public class Employee extends Person {
    private String emplyeeId;
    private String title;

    public Employee(){
        // a superclass constructor is run before the subclass´s constructor
        // use super() to call a superclass constuctor
        // must be first statement
        // if the superclass does not have a default constructor, the subclass
        // must explicitly call one of its other constructors
        super("John Doe");  // call the constructor of the superclass
        System.out.println("In Employee default contructor");
    }

    public String getEmplyeeId() {
        return emplyeeId;
    }

    public void setEmplyeeId(String emplyeeId) {
        this.emplyeeId = emplyeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
