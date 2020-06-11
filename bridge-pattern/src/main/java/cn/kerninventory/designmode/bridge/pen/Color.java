package cn.kerninventory.designmode.bridge.pen;

/**
 * <h1>中文注释</h1>
 * <p>
 * 一句话描述
 * </p>
 *
 * @author Kern
 * @version 1.0
 */
public abstract class Color {

    private String desc;

    public Color(String desc) {
        if (desc == null || desc.trim().equals("")) {
            throw new IllegalArgumentException("不能是无色的");
        }
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
