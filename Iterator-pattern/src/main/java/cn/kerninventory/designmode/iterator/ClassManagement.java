package cn.kerninventory.designmode.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class ClassManagement {

    private String name;

    public ClassManagement(String name) {
        this.name = name;
    }

    private List<Student> students = new ArrayList<>();

    public ClassManagement addStudent(Student student) {
        students.add(student);
        return this;
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public Iterator<Student> iterator(){
        return new HeightIterator(students);
    }

    public class HeightIterator extends Iterator<Student> {

        public HeightIterator(List<Student> students) {
            super(students);
            Collections.sort(students);
        }
    }

}
