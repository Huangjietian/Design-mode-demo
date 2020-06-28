package cn.kerninventory.designmode.iterator;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class Student implements Comparable<Student> {

    private int height;

    public Student(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.height, o.height);
    }
}
