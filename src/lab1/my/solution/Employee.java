package lab1.my.solution;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private boolean completedOrientation;
    private String cubeId;
    private Date currentDate;

    public Employee() {
        this.currentDate = new Date();
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    //Sets both first and last names.
    public void setName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getSSN(){
        return this.ssn;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    
    public void performOrientation(String local){
        this.meetWithHrForBenefitAndSalryInfo();    //performed first
        this.meetDepartmentStaff();                 //performed second
        this.reviewDeptPolicies();                  //performed third
        this.moveIntoCubicle(local);                //performed fourth
        this.completedOrientation = true;           //boolean to prove Orientation is complete
    }
    private String getDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        return sdf.format(currentDate);
    }
    // Assume this must be performed first
    public void meetWithHrForBenefitAndSalryInfo() {
        this.metWithHr = true;
        System.out.println("Met with Hr on " + getDate());
    }
    // Assume this is must be performed second
    public void meetDepartmentStaff() {
        if(this.metWithHr){
            this.metDeptStaff = true;
            System.out.println("Met with Dept. Staff on " + getDate());
        }
        else{
            System.out.println("Has to meet wit Hr first!");
        }
    }
    // Assume this must be performed third
    public void reviewDeptPolicies() {
        if(this.metWithHr && this.metDeptStaff){
            this.reviewedDeptPolicies = true;
            System.out.println("Reviewed Dept. Policies on " + getDate());
        }
        else{
            System.out.println("Needs to either meet with HR or meet dept staff!");
        }
    }
    // Assume this must be performed 4th
    public void moveIntoCubicle(String cubeId) {
        if(this.metWithHr && this.metDeptStaff && this.reviewedDeptPolicies){
            this.movedIn = true;
            System.out.println("Moved into cube on " + getDate());
            this.cubeId = cubeId;
        }
        else{
            System.out.println("Either needs to see HR, Dept Staff or review policies!");        
        }
    }
    public String getStatus() {
        if(this.completedOrientation || (this.metDeptStaff && this.metWithHr &&
                this.movedIn && this.reviewedDeptPolicies)) {     //checks if overall completeion is done
            return "Orientation is completed on: " + getDate();
        } else {
            return getDate() + ": Orientation in progress...";
        }
    }
}
