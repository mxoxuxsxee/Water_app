package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.chip.Chip;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private int CurrentProgress = 0;
    private ProgressBar progressBar;
    private ProgressBar progressBar2;
    private Button button_100;
    private Button button_200;
    private Button button_300;
    private Button button_400;
    private Button button_500;
    private Button button_700;
    private Button button_decr;
    private Button button_remove;
    private Chip chip;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progress_bar);
        progressBar2 = findViewById(R.id.progressBar2);

        button_100 = findViewById(R.id.button_100);
        button_100.setTextColor(Color.parseColor("#FFFFFF"));
        button_100.setBackgroundColor(Color.parseColor("#03A9F4"));

        button_200 = findViewById(R.id.button_200);
        button_200.setTextColor(Color.parseColor("#FFFFFF"));
        button_200.setBackgroundColor(Color.parseColor("#03A9F4"));

        button_300 = findViewById(R.id.button_300);
        button_300.setTextColor(Color.parseColor("#FFFFFF"));
        button_300.setBackgroundColor(Color.parseColor("#03A9F4"));

        button_400 = findViewById(R.id.button_400);
        button_400.setTextColor(Color.parseColor("#FFFFFF"));
        button_400.setBackgroundColor(Color.parseColor("#03A9F4"));

        button_500 = findViewById(R.id.button_500);
        button_500.setTextColor(Color.parseColor("#FFFFFF"));
        button_500.setBackgroundColor(Color.parseColor("#03A9F4"));

        button_700 = findViewById(R.id.button_700);
        button_700.setTextColor(Color.parseColor("#FFFFFF"));
        button_700.setBackgroundColor(Color.parseColor("#03A9F4"));

        button_decr = findViewById(R.id.button_decr);
        button_decr.setTextColor(Color.parseColor("#FFFFFF"));
        button_decr.setBackgroundColor(Color.parseColor("#03A9F4"));

        button_remove = findViewById(R.id.button_remove);
        button_remove.setTextColor(Color.parseColor("#FFFFFF"));
        button_remove.setBackgroundColor(Color.parseColor("#03A9F4"));

        chip = findViewById(R.id.chip);
        chip.setTextColor(Color.parseColor("#FFFFFF"));
        chip.setBackgroundColor(Color.parseColor("#03A9F4"));

        TextView textView = findViewById(R.id.text_view_progress);
        textView.setText("0%");
        textView.setTextSize(35f);
        textView.setTextColor(Color.parseColor("#03A9F4"));

        TextView textView1 = findViewById(R.id.textView_min);
        textView1.setText("0 ml");

        TextView textView2 = findViewById(R.id.textView_max);
        textView2.setText("2000 ml");

        TextView info = findViewById(R.id.info);
        info.setText("wyświetl progres");

        TextView textView3 = findViewById(R.id.textView_progress2);
        textView3.setText("0 / 2000ml");
        textView3.setTextSize(20f);

        button_100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CurrentProgress = CurrentProgress + 5;
                progressBar.setProgress(CurrentProgress);
                progressBar.setMax(100);

                progressBar2.setProgress((CurrentProgress));
                progressBar2.setMax(100);
                progressBar2.setProgressTintList(ColorStateList.valueOf(Color.parseColor("#03A9F4")));

                String temp = "";
                temp = String.valueOf(CurrentProgress);
                textView.setText(temp + "%");
                textView.setTextSize(35f);
                textView.setTextColor(Color.parseColor("#03A9F4"));
                textView3.setText(Integer.valueOf(temp)*20+" / 2000 ml");
                textView3.setTextSize(20f);
            }
        });

        button_200.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CurrentProgress = CurrentProgress + 10;
                progressBar.setProgress(CurrentProgress);
                progressBar.setMax(100);

                progressBar2.setProgress((CurrentProgress));
                progressBar2.setMax(100);
                progressBar2.setProgressTintList(ColorStateList.valueOf(Color.parseColor("#03A9F4")));

                String temp = "";
                temp = String.valueOf(CurrentProgress);
                textView.setText(temp + "%");
                textView.setTextSize(35f);
                textView.setTextColor(Color.parseColor("#03A9F4"));
                textView3.setText(Integer.valueOf(temp)*20+" / 2000 ml");
                textView3.setTextSize(20f);
            }
        });

        button_300.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CurrentProgress = CurrentProgress + 15;
                progressBar.setProgress(CurrentProgress);
                progressBar.setMax(100);
                progressBar2.setProgress((CurrentProgress));
                progressBar2.setMax(100);
                progressBar2.setProgressTintList(ColorStateList.valueOf(Color.parseColor("#03A9F4")));

                String temp = "";
                temp = String.valueOf(CurrentProgress);
                textView.setText(temp + "%");
                textView.setTextSize(35f);
                textView.setTextColor(Color.parseColor("#03A9F4"));
                textView3.setText(Integer.valueOf(temp)*20+" / 2000 ml");
                textView3.setTextSize(20f);
            }
        });
        button_400.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CurrentProgress = CurrentProgress + 20;
                progressBar.setProgress(CurrentProgress);
                progressBar.setMax(100);
                progressBar2.setProgress((CurrentProgress));
                progressBar2.setMax(100);
                progressBar2.setProgressTintList(ColorStateList.valueOf(Color.parseColor("#03A9F4")));

                String temp = "";
                temp = String.valueOf(CurrentProgress);
                textView.setText(temp + "%");
                textView.setTextSize(35f);
                textView.setTextColor(Color.parseColor("#03A9F4"));
                textView3.setText(Integer.valueOf(temp)*20+" / 2000 ml");
                textView3.setTextSize(20f);
            }
        });
        button_500.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CurrentProgress = CurrentProgress + 25;
                progressBar.setProgress(CurrentProgress);
                progressBar.setMax(100);
                progressBar2.setProgress((CurrentProgress));
                progressBar2.setMax(100);
                progressBar2.setProgressTintList(ColorStateList.valueOf(Color.parseColor("#03A9F4")));

                String temp = "";
                temp = String.valueOf(CurrentProgress);
                textView.setText(temp + "%");
                textView.setTextSize(35f);
                textView.setTextColor(Color.parseColor("#03A9F4"));
                textView3.setText(Integer.valueOf(temp)*20+" / 2000 ml");
                textView3.setTextSize(20f);
            }
        });
        button_700.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CurrentProgress = CurrentProgress + 35;
                progressBar.setProgress(CurrentProgress);
                progressBar.setMax(100);
                progressBar2.setProgress((CurrentProgress));
                progressBar2.setMax(100);
                progressBar2.setProgressTintList(ColorStateList.valueOf(Color.parseColor("#03A9F4")));

                String temp = "";
                temp = String.valueOf(CurrentProgress);
                textView.setText(temp + "%");
                textView.setTextSize(35f);
                textView.setTextColor(Color.parseColor("#03A9F4"));
                textView3.setText(Integer.valueOf(temp)*20+" / 2000 ml");
                textView3.setTextSize(20f);
            }
        });
        button_decr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CurrentProgress = CurrentProgress - 5;
                progressBar.setProgress(CurrentProgress);
                progressBar.setMax(100);
                progressBar2.setProgress((CurrentProgress));
                progressBar2.setMax(100);
                progressBar2.setProgressTintList(ColorStateList.valueOf(Color.parseColor("#03A9F4")));

                String temp = "";
                temp = String.valueOf(CurrentProgress);
                textView.setText(temp + "%");
                textView.setTextSize(35f);
                textView.setTextColor(Color.parseColor("#03A9F4"));
                textView3.setText(Integer.valueOf(temp)*20+" / 2000 ml");
                textView3.setTextSize(20f);
            }
        });
        button_remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CurrentProgress = 0;
                progressBar.setProgress(CurrentProgress);
                progressBar.setMax(100);
                progressBar2.setProgress((CurrentProgress));
                progressBar2.setMax(100);
                progressBar2.setProgressTintList(ColorStateList.valueOf(Color.parseColor("#03A9F4")));

                String temp = "";
                temp = String.valueOf(CurrentProgress);
                textView.setText(temp + "%");
                textView.setTextSize(35f);
                textView.setTextColor(Color.parseColor("#03A9F4"));
                textView3.setText(Integer.valueOf(temp)*20+" / 2000 ml");
                textView3.setTextSize(20f);
            }
        });
        chip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CurrentProgress = CurrentProgress;
                progressBar.setProgress(CurrentProgress);
                progressBar.setMax(100);
                progressBar2.setProgress((CurrentProgress));
                progressBar2.setMax(100);
                progressBar2.setProgressTintList(ColorStateList.valueOf(Color.parseColor("#03A9F4")));

                String temp = "";
                temp = String.valueOf(CurrentProgress);
                textView.setText(temp + "%");
                textView.setTextSize(35f);
                textView.setTextColor(Color.parseColor("#03A9F4"));
                textView3.setText(Integer.valueOf(temp)*20+" / 2000 ml");
                textView3.setTextSize(20f);
            }
        });
    }
    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences sharedPref = this.getPreferences(Context.MODE_PRIVATE);
        CurrentProgress = sharedPref.getInt("dane", 0);
    }
    @Override
    protected void onStop() {
        super.onStop();
        SharedPreferences sharedPref = this.getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("dane", CurrentProgress);
        editor.commit();
    }
}