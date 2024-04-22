public class Employee {
    private int baseSalary;
    public int hourlyRate;

    public int calculateWage(int exraHours){
        return baseSalary + (exraHours + hourlyRate);
    }

    public void setBaseSalary(int baseSalary) throws IllegalAccessException {
        if (baseSalary <= 0)
            throw new IllegalAccessException("salary can not be zero mother fuckere");
        this.baseSalary = baseSalary;
    }
    public int getBaseSalary(){
        return baseSalary;
    }
}
