package com.sifat.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity2 extends AppCompatActivity {

    ImageView coverimage;
    TextView tittletext,destext;
    FloatingActionButton fabbutton;

    TextToSpeech textToSpeech;


    public static String TITTLE="";
    public static String DESCRIPTION="";
    public static Bitmap My_image=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        coverimage=findViewById(R.id.coverimage);
        tittletext=findViewById(R.id.tittletext);
        destext=findViewById(R.id.destext);
        fabbutton=findViewById(R.id.fabbutton);




        tittletext.setText(TITTLE);
        destext.setText(DESCRIPTION);
        if (My_image!=null)coverimage.setImageBitmap(My_image);





        textToSpeech=new TextToSpeech(MainActivity2.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {

            }
        });




        fabbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String text=destext.getText().toString();
                textToSpeech.speak(DESCRIPTION,TextToSpeech.QUEUE_FLUSH,null,null);

            }
        });





    }
}