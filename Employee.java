import java.util.Random;

public class Employee {

    // Data
    String name;
    int idNumber;
    String department;
    String position;
    String userName;
    boolean admin;

    // Constructor
    Employee(String val1, String val2, String val3){
        name = val1;
        department = val2;
        position = val3;
        admin = false;

        // Issue ID
        Random ID_values = new Random();
        idNumber = ID_values.nextInt(999999) + 100000;

        // Issue User Name
        String tempName = name.substring(0, 3);
        String tempID = String.valueOf(idNumber);
        tempName = tempName.toLowerCase();
        tempID = tempID.substring(0, 3);
        userName = tempName + tempID;
    }

    // to String
    public String toString(){
        
        String str = "Name: " + name +
                     "\nID: " + idNumber +
                     "\nDepartment: " + department +
                     "\nPosition: " + position +
                     "\nUser Name: " + userName +
                     "\nAdmin: " + admin;
        return str;
    }

    // Set
    void setName(String val){
        name = val;
    }
    void setDepartment(String val){
        department = val;
    }
    void setPosition(String val){
        position = val;
    }
    void setUserName(String val){
        userName = val;
    }
    void setAdmin(boolean val){
        if (val == true)
            admin = true;
        else
            admin = false;
    }

    // Get
    String getName(){
        return name;
    }
    int getID(){
        return idNumber;
    }
    String getDepartment(){
        return department;
    }
    String getPosition(){
        return position;
    }
    String getUserName(){
        return userName;
    }
}
