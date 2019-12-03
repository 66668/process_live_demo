package com.enjoy.leo_daemon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.enjoy.leo_daemon.account.AccountHelper;
import com.enjoy.leo_daemon.activity.KeepManager;
import com.enjoy.leo_daemon.jobscheduler.MyJobService;
import com.enjoy.leo_daemon.service.ForegroundService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1像素保活
//        KeepManager.getInstance().registerKeep(this);

        // 前台服务保活
//        startService(new Intent(this, ForegroundService.class));

        //sticky
//        startService(new Intent(this, StickyService.class));

        // 账户拉活
        AccountHelper.addAccount(this);
        AccountHelper.autoSync();

//        MyJobService.startJob(this);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
