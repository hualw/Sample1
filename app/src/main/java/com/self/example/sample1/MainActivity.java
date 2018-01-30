package com.self.example.sample1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String aaa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String str = "<font color=#999999>备注：</font><br><font color=#999999>请您尽量在预约时间前到店。如需取消订单，请查看APP客户端<font color=red>【我的】-【预约接待】-【预约信息】</font>中取消预约</font> ";
        String str1 = "<html><body> Some html string <br><font size=13 color=red>This is some text!</font> </body></html>";
        TextView tv = (TextView) findViewById(R.id.tv);

        tv.setText(Html.fromHtml(str));

    }

}
