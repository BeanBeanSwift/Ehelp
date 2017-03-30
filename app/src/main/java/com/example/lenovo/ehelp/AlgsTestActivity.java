package com.example.lenovo.ehelp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import org.apache.http.util.EncodingUtils;

import java.io.InputStream;

public class AlgsTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algs_test);
        TextView textView2 = (TextView)findViewById(R.id.textView_3);
        String res = "";
        try{
            InputStream in = getResources().openRawResource(R.raw.algetest);
            int length = in.available();
            byte[] buffer = new byte[length];
            in.read(buffer);
            res = EncodingUtils.getString(buffer, "UTF-8");
            in.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        textView2.setText(res);
        textView2.setMovementMethod(new ScrollingMovementMethod());
    }
}
