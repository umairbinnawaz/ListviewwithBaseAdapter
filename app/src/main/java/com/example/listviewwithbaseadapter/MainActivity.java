package com.example.listviewwithbaseadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView list1;
    String number1[]={"976776776","6766678998","776767","6766678998","776767"};
    int pic1[]={R.drawable.facbook,R.drawable.ic_linkedin,R.drawable.ic_messenger,R.drawable.ic_whatsapp,R.drawable.instagram};
    int pic2[]={R.drawable.ic_phone,R.drawable.ic_video_call,R.drawable.ic_phone,R.drawable.ic_video_call,R.drawable.ic_phone,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list1=findViewById(R.id.list1);
        A adapte=new A(getApplicationContext(),pic1, number1,pic2);
        list1.setAdapter(adapte);

    }
}