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
public abstract class Employee {
    //员工姓名
    private String name;
    //工作时长
    private int workTime;
    protected Employee (){};
    public Employee(String name, int workTime) {
        this.name = name;
        this.workTime = workTime;
    }

    public abstract void accept(Department department);
}
