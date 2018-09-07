package activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.calculator_01.R;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    int [] buttons;  //数字键
    int result;
    int result0;
    int result1;

    //按钮对象声明
    Button buttonC;
    Button buttonS;
    Button buttonJia;
    Button buttonJian;
    Button buttonCheng;
    Button buttonChu;

    String str1; //最开始输入的值
    String str2; //第二次输入的值

    int flag = 0; //用于判断符号的标志位
    Button temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity","onCreate: ");
        //初始化按钮
                                                                                                                                                                                                                                                                  tton();
       buttonC.setOnClickListener(new View.OnClickListener(){
           @override
           public void onClick(View view){
               str1 = "";
               str2 = "";
               tv.setText("0");
               result = 0;
               result1 = 0;
               result0 = 0;
               flag = 0;


           }
       });

       //监听
        for (int i = 0;i<buttons.length;i++){

        }


    }
}
