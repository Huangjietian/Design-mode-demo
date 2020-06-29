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
public class ParttimeEmployee extends Employee {
    //时薪
    private double hourWage;
    private ParttimeEmployee(){
        super();
    };
    public ParttimeEmployee(String name, int workTime, double hourWage) {
        super(name, workTime);
        this.hourWage = hourWage;
    }

    @Override
    public void accept(Department department) {
        department.visit(this);
    }
}
