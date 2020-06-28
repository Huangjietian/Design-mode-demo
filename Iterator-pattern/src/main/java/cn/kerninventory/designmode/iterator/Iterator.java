package cn.kerninventory.designmode.iterator;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class Iterator<E> {

    private List<E> eList;

    private int cursor1;

    private int cursor2;

    public Iterator(List<E> eList) {
        this.eList = eList;
        this.cursor1 = 0;
        this.cursor2 = -1;
    }

    public boolean hasNext(){
        return cursor1 != eList.size();
    }

    public E next(){
        cursor2 = cursor1;
        cursor1 ++;
        return eList.get(cursor2);
    }

    public void remove(){
        if (cursor2 == -1) {
            throw new IllegalArgumentException("No element to remove!");
        }
        eList.remove(cursor2);
        if (cursor2 < cursor1) {
            cursor1 -- ;
        }
    }

    public void forEachPrint(Consumer<E> consumer) {
        eList.forEach(e -> consumer.accept(e));
    }


}
