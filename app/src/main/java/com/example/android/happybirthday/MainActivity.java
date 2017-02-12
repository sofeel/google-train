package com.example.android.happybirthday;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv_hotFilm).setOnClickListener(this);
        findViewById(R.id.tv_gupiao).setOnClickListener(this);
        findViewById(R.id.tv_reder).setOnClickListener(this);
        findViewById(R.id.tv_newest).setOnClickListener(this);
        findViewById(R.id.tv_graduationProject).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_hotFilm:
                Toast.makeText(this,"启动应用：热门电影",Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_gupiao:
                Toast.makeText(this,"启动应用：股票雄鷹",Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_reder:
                Toast.makeText(this,"启动应用：XYZ阅读器",Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_newest:
                Toast.makeText(this,"启动应用：最新闻",Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_graduationProject:
                Toast.makeText(this,"启动应用：毕业设计",Toast.LENGTH_SHORT).show();
                break;


        }
    }
}
