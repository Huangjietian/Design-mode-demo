package cn.kerninventory.designdemo.composite.exercise;

/**
 * <h1>中文注释</h1>
 * <p>
 * 一句话描述
 * </p>
 *
 * @author Kern
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Document document = new Document("关于XXX的指示");
        Institute beijingHeadQuarter = new Institute("北京总部");
        beijingHeadQuarter.defaultOffice();
        Institute hunanBranchSchool = new Institute("湖南分校");
        hunanBranchSchool.defaultOffice();
        beijingHeadQuarter.addSubUnit(hunanBranchSchool);

        Institute changshaSchool = new Institute("长沙教学点");
        changshaSchool.defaultOffice();
        Institute xiangtanSchool = new Institute("湘潭教学点");
        xiangtanSchool.defaultOffice();

        hunanBranchSchool.addSubUnit(changshaSchool).addSubUnit(xiangtanSchool);


        beijingHeadQuarter.issued(document);
    }
}
