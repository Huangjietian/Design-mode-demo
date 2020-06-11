package cn.kerninventory.designmode.adapter.player;

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
        RealPlayerAPI realPlayerAPI = PlayerAdapter.getRealPlayer();
        realPlayerAPI.play();

        WindowsMediaPlayerAPI windowsMediaPlayerAPI = PlayerAdapter.getWindowsMediaPlayer();
        windowsMediaPlayerAPI.play();
    }
}
