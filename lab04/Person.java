package lab04;
import java.util.Arrays;

class Person {
    String firstName;
    String lastName;
    String gender;

    public Person(String firstName,String lastName, String gender){
        this.firstName=firstName;
        this.lastName=lastName;
        this.gender=gender;        
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getGender(){
        return gender;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }  
      public void setGender(String gender){
        this.gender=gender;
    }

    public String toString(){
        return "First name is "+firstName+". Last name is "+lastName+
        ". Gender is "+gender+".";
    }

    public boolean equals(Person p){
        if (p==null) return false;
        return this.firstName.equals(p.firstName) &&
        this.lastName.equals(p.lastName) &&
        this.gender.equals(p.gender);
    }


}
class Teacher extends Person {
    String department;
    String[] courses;

    public Teacher(String firstName,String lastName, String gender,String department, String[] courses){
        super(firstName, lastName, gender);
        this.department = department;
        this.courses=courses;
    }
    public String getDepartment(){
        return department;
    }
    public String[] getCourses(){
        return courses;
    }
    public void setDepartment(String department){
        this.department=department;
    }
    public void setCourses(String[] courses){
        this.courses=courses;
    }
    public String toString(){
        return "Teacher's first name is "+firstName+
        ", last name is "+lastName+
        ", gender is "+gender+
        ", department is "+department+
        ", courses are "+Arrays.toString(courses)+".";
    }
    public boolean equals(Teacher t){
        if(t==null) return false;
        return super.equals(t)&&
        this.department.equals(t.department)&&
        Arrays.equals(this.courses, t.courses);
    }
}
