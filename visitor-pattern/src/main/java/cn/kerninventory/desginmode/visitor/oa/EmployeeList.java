package cn.kerninventory.desginmode.visitor.oa;

import java.util.ArrayList;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class EmployeeList {

    private ArrayList<Employee> list = new ArrayList<>(16);

    public void addEmployee(Employee employee) {
        list.add(employee);
    }

    public void accept(Department department) {
        list.forEach(e -> e.accept(department));
    }

    public static void main(String[] args) {
        EmployeeList employeeList = new EmployeeList();
        employeeList.addEmployee(new FulltimeEmployee("Kern", 50, 5000));
        employeeList.addEmployee(new FulltimeEmployee("Jack", 37, 3700));
        employeeList.addEmployee(new ParttimeEmployee("Marry", 70, 18));
        employeeList.accept(new HRDepartment());
        employeeList.accept(new FADepartment());
    }
}
