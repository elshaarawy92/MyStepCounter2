package com.example.mystepcounter;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private String TAG = "MainActivity";

    private static final int REFRESH_STEP_WHAT = 0;

    //循环取当前时刻的步数中间的间隔时间
    private long TIME_INTERVAL_REFRESH = 500;

    private Handler mDelayHandler = new Handler(new MyStepCounterCall());//新建一个Handler
    private int mStepSum;//步数总数

    private int ISportStepInterface iSportStepInterface;//新建aidl接口实例

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    class MyStepCounterCall implements Handler.Callback {
        @Override
        public boolean handleMessage(Message message) {
            switch (message.what){
                case REFRESH_STEP_WHAT:{
                    //每隔500毫秒获取一次计步数据刷新UI
                    if(null != iSportStepInterface){

                    }
                }
            }
        }
    }
}
