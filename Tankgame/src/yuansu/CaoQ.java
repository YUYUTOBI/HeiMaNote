package yuansu;

import org.itheima.game.DrawUtils;

import java.io.IOException;

public class CaoQ extends YuanSu {

    private String srcPath = "Tankgame/res/img/grass.gif";

    public CaoQ(int x, int y) {
        this.x = x;
        this.y = y;
        try {
            int[] arr = DrawUtils.getSize(srcPath);
            this.kuan = arr[0];
            this.gao = arr[1];
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void huihua() {
        try {
            DrawUtils.draw(srcPath,x,y);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}