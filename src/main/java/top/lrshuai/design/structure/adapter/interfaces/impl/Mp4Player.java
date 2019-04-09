package top.lrshuai.design.structure.adapter.interfaces.impl;

import top.lrshuai.design.structure.adapter.interfaces.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
