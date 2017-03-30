package com.example.lenovo.ehelp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import org.apache.http.util.EncodingUtils;

import java.io.InputStream;

import static com.example.lenovo.ehelp.R.id.textView_1;

public class CTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ctest);
        TextView textView = (TextView)findViewById(textView_1);
        String res = "";
        try{
            InputStream in = getResources().openRawResource(R.raw.ctest);
            int length = in.available();
            byte[] buffer = new byte[length];
            in.read(buffer);
            res = EncodingUtils.getString(buffer, "UTF-8");
            in.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        textView.setText(res);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}
