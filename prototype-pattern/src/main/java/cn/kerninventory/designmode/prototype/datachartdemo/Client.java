package cn.kerninventory.designmode.prototype.datachartdemo;

/**
 * @author Kern
 * @date 2020/6/9 11:01
 * @description
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        DataChart dataChartA = new DataChart("001", "#31", new DataSet(1111L));
        DataChart dataChartB = dataChartA.clone();
        dataChartB.setCode("002");
        dataChartB.setColorIndex("#62");
        System.out.println(dataChartA.toString());
        System.out.println(dataChartB.toString());
//        DataChart{code='001', colorIndex='#31', dataSet=DataSet{serializeNo=1111DataSet.hashCode()=356573597}}
//        DataChart{code='002', colorIndex='#62', dataSet=DataSet{serializeNo=1111DataSet.hashCode()=1735600054}}
    }
}
