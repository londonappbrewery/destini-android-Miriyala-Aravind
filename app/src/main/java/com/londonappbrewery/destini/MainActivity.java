package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button topButton;
    Button bottomButton;
    TextView storyTextView;
    int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topButton = findViewById(R.id.buttonTop);
        bottomButton = findViewById(R.id.buttonBottom);
        storyTextView = findViewById(R.id.storyTextView);


        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(mStoryIndex == 1 || mStoryIndex == 5)
                {
                    storyTextView.setText(R.string.T3_Story);
                    topButton.setText(R.string.T3_Ans1);
                    bottomButton.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                }
                else if(mStoryIndex ==3)
                {
                    storyTextView.setText(R.string.T6_End);
                    topButton.setVisibility(View.GONE);
                    bottomButton.setVisibility(View.GONE);
                }
            }
        });
        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(mStoryIndex==1)
                {
                    storyTextView.setText(R.string.T2_Story);
                    topButton.setText(R.string.T2_Ans1);
                    bottomButton.setText(R.string.T2_Ans2);
                    mStoryIndex = 5;
                }
                else if(mStoryIndex==3)
                {
                    storyTextView.setText(R.string.T5_End);
                    topButton.setVisibility(View.GONE);
                    bottomButton.setVisibility(View.GONE);
                }
                else
                {
                    storyTextView.setText(R.string.T4_End);
                    topButton.setVisibility(View.GONE);
                    bottomButton.setVisibility(View.GONE);
                }
            }
        });
        }
    }
