package cn.kerninventory.designmode.prototype.datachartdemo;

import lombok.Data;

/**
 * @author Kern
 * @date 2020/6/9 10:44
 * @description
 */
public class DataChart implements Cloneable {

    public DataChart(String code, String colorIndex, DataSet dataSet) {
        this.code = code;
        this.colorIndex = colorIndex;
        this.dataSet = dataSet;
    }

    private String code;

    private String colorIndex;

    private DataSet dataSet;

    public String getCode() {
        return code;
    }

    public DataChart setCode(String code) {
        this.code = code;
        return this;
    }

    public String getColorIndex() {
        return colorIndex;
    }

    public DataChart setColorIndex(String colorIndex) {
        this.colorIndex = colorIndex;
        return this;
    }

    public DataSet getDataSet() {
        return dataSet;
    }

    public DataChart setDataSet(DataSet dataSet) {
        this.dataSet = dataSet;
        return this;
    }

    @Override
    public String toString() {
        return "DataChart{" +
                "code='" + code + '\'' +
                ", colorIndex='" + colorIndex + '\'' +
                ", dataSet=" + dataSet.toString() +
                '}';
    }

    @Override
    public DataChart clone() throws CloneNotSupportedException {
        DataChart dataChart = (DataChart) super.clone();
        DataSet dataSet = dataChart.getDataSet().clone();
        dataChart.setDataSet(dataSet);
        return dataChart;
    }
}
