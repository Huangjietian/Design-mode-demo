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
public abstract class Pen {

    private Color color;

    public Color getColor() {
        return color;
    }

    public Pen setColor(Color color) {
        this.color = color;
        return this;
    }

    public String draw() {
        if (getColor() == null) {
            System.out.println("纸上没留下什么痕迹!!!");
            return null;
        } else {
            System.out.println("纸上留下了" + getColor().getDesc() + "的字!!!");
            return color.getDesc();
        }
    }
}
