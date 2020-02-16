public class Employee {

     private String empID;
    private  String empName;
    private  int salary;
    private  int age;

    public String getEmpID() {
        return empID;
    }

   // public void setEmpID(String empID) {
     //   this.empID = empID;
   // }

    public String getEmpName() {
        return empName;
    }

    public void setEmp9Name() {
        this.empName = empName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee (String empID){

          this.empID = empID;
          load();
      }

      public Employee(){

      }

       void save(){
    }


    private void load(){


    }
}
