package test.example.com.test;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("SecondActivity","Task id is"+getTaskId());
        setContentView(R.layout.second_layout);
       Intent intent =getIntent();
       String data=intent.getStringExtra("extra_data");
        Log.d("SecondActivity",data);

        Button button2 = (Button) findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent1 = new Intent("test.example.com.test.VIEW");
                intent1.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent1);
                System.out.println("follow me!");
            }
        });
    }

//    public static void actionStart(Context context,String data1,String data2){
//        Intent intent = new Intent(context,SecondActivity.class);
//        intent.putExtra("param1",data1);
//        intent.putExtra("param2",data2);
//        context.startActivity(intent);
//    }
}
