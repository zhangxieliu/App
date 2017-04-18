package com.newpearl.app;

import android.app.Application;

import org.xutils.x;

/**
 * Created by Administrator on 2017/4/18 0018.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(true);// 是否输出debug日志, 开启debug会影响性能.
    }
}
