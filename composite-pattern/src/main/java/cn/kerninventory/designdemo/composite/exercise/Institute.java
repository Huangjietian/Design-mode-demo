package cn.kerninventory.designdemo.composite.exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>中文注释</h1>
 * <p>
 * 一句话描述
 * </p>
 *
 * @author Kern
 * @version 1.0
 */
public class Institute extends Unit {

    private List<Unit> subUnits = new ArrayList<>(16);

    public Institute(String name) {
        super(name);
    }

    public Institute addSubUnit(Unit unit){
        subUnits.add(unit);
        return this;
    }

    public Institute removeSubUnit(Unit unit) {
        subUnits.remove(unit);
        return this;
    }

    @Override
    public void issued(Document document) {
        System.out.println("研究院: [ " + getName() + " ] 收到了公文: " + document.getName());
        System.out.println("研究院: [ " + getName() + " ] 下发公文到下级单位");
        subUnits.forEach(e -> e.issued(document));
    }

    public void defaultOffice() {
        subUnits.add(new Office(getName() + "教务办公室"));
        subUnits.add(new Office(getName() + "行政办公室"));
    }
}
