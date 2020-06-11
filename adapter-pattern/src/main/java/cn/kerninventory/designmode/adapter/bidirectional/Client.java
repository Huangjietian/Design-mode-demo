package cn.kerninventory.designmode.adapter.bidirectional;

/**
 * <h1>中文注释</h1>
 * <p>
 *      双向适配器模式，需要充当适配双方的中间调和者
 * </p>
 *
 * @author Kern
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Target1 target1 = BidirectionalAdapter.getTarget1Adapter();
        target1.target1Print();
        Target2 target2 = BidirectionalAdapter.getTarget2Adapter();
        target2.target2Print();
    }
}
