package com.example.sm.webviewshalev;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et1;
    EditText et2;
    EditText et3;
    WebView wv1;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        wv1 = (WebView) findViewById(R.id.wv1);

    }
    public void ShalevKing (View view) {
        String st1 = et1.getText().toString();
        String st2 = et2.getText().toString();
        String st3 = et3.getText().toString();

        Double sh1 = Double.parseDouble(st1);
        Double sh2 = Double.parseDouble(st2);
        Double sh3 = Double.parseDouble(st3);

        String url = "https://www.google.co.il/webhp?sourceid=chrome-instant&ion=1&espv=2&ie=UTF-8#q=";
        url = url + sh1 + "x%5E2%2B" + sh2 + "x%2B" + sh3;
        wv1.loadUrl(url);



    }
}




