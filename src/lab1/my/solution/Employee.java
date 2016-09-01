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
    private Date birthDate;
    private boolean completedOrientation;
    private String cubeId;
    private Date currentDate;

    public Employee() {
        currentDate = new Date();
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
    private void meetWithHrForBenefitAndSalryInfo() {
        System.out.println("Met with Hr on " + getDate());
    }

    // Assume this is must be performed second
    private void meetDepartmentStaff() {
        System.out.println("Met with Dept. Staff on " + getDate());
    }

    // Assume this must be performed third
    private void reviewDeptPolicies() {
        System.out.println("Reviewed Dept. Policies on " + getDate());
    }

    // Assume this must be performed 4th
    private void moveIntoCubicle(String cubeId) {
        System.out.println("Moved into cube on " + getDate());
        this.cubeId = cubeId;
    }

    public String getStatus() {
        if(this.completedOrientation) {
            return "Orientation is completed on: " + getDate();
        } else {
            return getDate() + ": Orientation in progress...";
        }
    }
}
