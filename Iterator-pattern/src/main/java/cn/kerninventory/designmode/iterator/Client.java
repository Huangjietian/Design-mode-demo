package cn.kerninventory.designmode.iterator;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        ClassManagement classManagement = new ClassManagement("三年一班");
        classManagement
                .addStudent(new Student(175))
                .addStudent(new Student(176))
                .addStudent(new Student(165))
                .addStudent(new Student(180))
        ;
        Iterator iterator = classManagement.iterator();
        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            System.out.println(student.getHeight());
            if (student.getHeight() < 170) {
                iterator.remove();
            }
        }
        System.out.println("======================");
        classManagement.iterator().forEachPrint(e -> System.out.println(e.getHeight()));

    }
}
