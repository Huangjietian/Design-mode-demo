package cn.kerninventory.designdemo.command;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class ConcreteCommand extends Command {

    /**
     * 维持一个命令接收者的引用，因此每一个具体的命令类都有一个命令的接收者
     */
    private CommandReceiver1 receiver;

    /**
     * 命令模式的命令类本身充当不同的命令接收者的调用者，由于命令类同属于Command 类型的子类， 因此可以扩展为 宏命令 和 批处理。
     * 重点在于理解 命令接收者可以是不同类型的对象，接收者应作概念性的理解。
     */
//    private CommandReceiver2 receiver2;

    @Override
    public void execute() {
        receiver.action();
    }
}
