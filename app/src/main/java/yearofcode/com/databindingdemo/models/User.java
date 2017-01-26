package yearofcode.com.databindingdemo.models;

/**
 * Created by vivek on 26/01/17.
 */

public class User {

    int id;
    String firstName;
    String lastName;


    public String getFullName(){
        return firstName+" "+lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
