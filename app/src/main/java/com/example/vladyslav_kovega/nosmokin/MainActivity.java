package com.example.vladyslav_kovega.nosmokin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.cigarette_everyday);

//        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                switch (checkedId) {
//                    case -1:
//                        //TODO
//                        break;
//                    case R.id.half_day:
//                        //TODO
//                        break;
//                    case R.id.one_day:
//                        // TODO: 20.07.2016
//                        break;
//                    case R.id.one_half_day:
//                        // TODO: 20.07.2016
//                        break;
//                    case R.id.two_day:
//                        //TODO
//                        break;
//                    default:
//                        break;
//                }
//            }
//
//        });
    }

        public void onRadioButtonClicked (View wiew){
        
    }

}
