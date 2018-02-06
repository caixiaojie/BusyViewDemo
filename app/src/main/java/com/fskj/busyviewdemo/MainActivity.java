package com.fskj.busyviewdemo;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fskj.busyviewdemo.View.BusyView;
import com.fskj.busyviewdemo.View.CustomWeiboDialogUtils;

public class MainActivity extends AppCompatActivity {

    private BusyView busyView;
    private Dialog loadingDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        busyView = BusyView.showQuery(MainActivity.this);
//        loadingDialog = CustomWeiboDialogUtils.createLoadingDialog(MainActivity.this, "查询中...");
//        try {
//            Thread.sleep(10000);
//            CustomWeiboDialogUtils.closeDialog(loadingDialog);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
