package com.example.sisillia.bikebank;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

public class MyPoint extends AppCompatActivity {

    Button Ranking;
    private PopupWindow mPopupWindow;
    private Context mContext;
    private LinearLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_point);

        Ranking = (Button) findViewById(R.id.ranking);
        mContext = getApplicationContext();
        mRelativeLayout = (LinearLayout) findViewById(R.id.rl_custom_layout);

        mPopupWindow = new PopupWindow(
                ActionBar.LayoutParams.WRAP_CONTENT,
                ActionBar.LayoutParams.WRAP_CONTENT
        );

        Ranking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(LAYOUT_INFLATER_SERVICE);

                // Inflate the custom layout/view
                View customView = inflater.inflate(R.layout.popup_layout,null);


                if(Build.VERSION.SDK_INT>=21){
                    mPopupWindow.setElevation(5.0f);
                }

                // Get a reference for the custom view close button
                ImageButton closeButton = (ImageButton) customView.findViewById(R.id.ib_close);

                // Set a click listener for the popup window close button
                closeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // Dismiss the popup window
                        mPopupWindow.dismiss();
                    }
                });


                mPopupWindow.showAtLocation(mRelativeLayout, Gravity.CENTER,0,0);
                mPopupWindow.setFocusable(true);

                mPopupWindow.setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(mContext, android.R.color.transparent)));
                mPopupWindow.setOutsideTouchable(false);
                mPopupWindow.setTouchable(true);

                mPopupWindow.update();
            }
        });
    }
}

