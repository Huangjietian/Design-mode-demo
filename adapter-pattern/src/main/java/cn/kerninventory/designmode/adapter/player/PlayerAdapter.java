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
public class PlayerAdapter implements WindowsMediaPlayerAPI, RealPlayerAPI {

    private WindowsMediaPlayerAPI windowsMediaPlayerAPI;
    private RealPlayerAPI realPlayerAPI;

    private PlayerAdapter() {

    }

    public static WindowsMediaPlayerAPI getWindowsMediaPlayer (){
        PlayerAdapter playerAdapter = new PlayerAdapter();
        playerAdapter.windowsMediaPlayerAPI = new WindowsMediaPlayerAPI() {
            @Override
            public void play() {
                System.out.println("WindowsMediaPlayerAPI starts to play!!!");
            }
        };
        return playerAdapter;
    }

    public static RealPlayerAPI getRealPlayer () {
        PlayerAdapter playerAdapter = new PlayerAdapter();
        playerAdapter.realPlayerAPI = new RealPlayerAPI() {
            @Override
            public void play() {
                System.out.println("RealPlayerAPI starts to play!!!");
            }
        };
        return playerAdapter;
    }

    @Override
    public void play() {
        if (windowsMediaPlayerAPI != null) {
            windowsMediaPlayerAPI.play();
        } else if (realPlayerAPI != null){
            realPlayerAPI.play();
        } else {
            throw new NullPointerException("No player Api was found");
        }
    }
}
