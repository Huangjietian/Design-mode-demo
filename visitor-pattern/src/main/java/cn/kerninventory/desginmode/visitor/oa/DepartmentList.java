package cn.kerninventory.desginmode.visitor.oa;

import java.util.ArrayList;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class DepartmentList {
    private ArrayList<Department> departments = new ArrayList<>(16);

    public DepartmentList() {
        departments.add(new HRDepartment());
        departments.add(new FADepartment());
    }

    public void accept(Employee employee) {
        departments.forEach(e -> employee.accept(e));
    }

    public static void main(String[] args) {
        DepartmentList departmentList = new DepartmentList();
        Employee employee = new FulltimeEmployee("Kern", 50, 20000);
        departmentList.accept(employee);
    }
}
