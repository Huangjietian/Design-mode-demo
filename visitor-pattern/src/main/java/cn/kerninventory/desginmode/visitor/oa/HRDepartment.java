package cn.kerninventory.desginmode.visitor.oa;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class HRDepartment extends Department {

    @Override
    public void visit(FulltimeEmployee employee) {
        int workTime = employee.getWorkTime();
        System.out.println("正式员工" + employee.getName() + "实际工作时间为： " + workTime + "小时");
        if (workTime > 40) {
            System.out.println("正式员工" + employee.getName() + "加班时间为： " + (workTime - 40) + "小时");
        } else if (workTime < 40) {
            System.out.println("正式员工" + employee.getName() + "请假时间为： " + (40 - workTime) + "小时");
        }
    }

    @Override
    public void visit(ParttimeEmployee employee) {
        int workTime = employee.getWorkTime();
        System.out.println("临时工" + employee.getName() + "实际工作时间为： " + workTime + "小时");
    }
}
