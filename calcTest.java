import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class calcTest {

    @Test
    public void calcAdd() {
    	assertEquals(2,1+1);
    }
	
    

    @Test
    public void EmployeeAge(){
        int age = 20;
        Employee e = new Employee("POOJA PRAJAPATI");
        e.empAge(age);
    	assertEquals(20,e.giveAge());
    }

    @Test
    public void EmployeeName(){
        Employee e = new Employee("POOJA PRAJAPATI");
        e.empDesignation("docter");
        e.empSalery(1000);
        assertEquals(e,e.giveEmployee());
    }

}    