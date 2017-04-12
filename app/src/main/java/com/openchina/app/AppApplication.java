package com.openchina.app;

import android.app.Application;

import com.itheima.retrofitutils.ItheimaHttp;
import com.openchina.util.Constants;

/**
 * Created by Administrator on 2017/4/12.
 */
public class AppApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ItheimaHttp.init(this, Constants.BASE_URL);//baseUrl格式："http://xxxxxx/xxxxx/"
    }
}
