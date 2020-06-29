package cn.kerninventory.desginmode.visitor.oa;

import lombok.Data;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
@Data
public class FulltimeEmployee extends Employee {

    //员工周薪
    private double weeklyWage;
    private FulltimeEmployee(){
        super();
    };
    public FulltimeEmployee(String name, int workTime, double weeklyWage) {
        super(name, workTime);
        this.weeklyWage = weeklyWage;
    }

    @Override
    public void accept(Department department) {
        department.visit(this);
    }
}
