package cn.myxingxing.spring;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by lixing on 17/11/3.
 */
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }
}
