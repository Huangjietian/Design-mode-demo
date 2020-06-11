package cn.kerninventory.designmode.adapter.bidirectional;

/**
 * <h1>中文注释</h1>
 * <p>
 * 一句话描述
 * </p>
 *
 * @author Kern
 * @version 1.0
 */
public class BidirectionalAdapter implements Target1, Target2 {

    private Target1 target1;
    private Target2 target2;

    private BidirectionalAdapter() {
    }

    public static Target1 getTarget1Adapter (){
        BidirectionalAdapter adapter = new BidirectionalAdapter();
        adapter.target2 = new Target2() {
            @Override
            public void target2Print() {
                System.out.println("target2 print");
            }
        };
        return adapter;
    }

    public static Target2 getTarget2Adapter () {
        BidirectionalAdapter adapter = new BidirectionalAdapter();
        adapter.target1 = new Target1() {
            @Override
            public void target1Print() {
                System.out.println("target1 print");
            }
        };
        return adapter;
    }


    @Override
    public void target1Print() {
        target2.target2Print();
    }

    @Override
    public void target2Print() {
        target1.target1Print();
    }
}
