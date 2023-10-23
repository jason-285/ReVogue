//--------------------------------------------------------------------------------------------------

/*IMPORTS*/

package com.jason.revogue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

//--------------------------------------------------------------------------------------------------

/*CLASS*/

public class SplasScreen extends AppCompatActivity {

    //----------------------------------------------------------------------------------------------

    /*ONCREATE METHOD*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //------------------------------------------------------------------------------------------

        /*INSTANT VARIABLES*/

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        //------------------------------------------------------------------------------------------

        /*TIMED FUNCTION*/

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(SplasScreen.this, Login.class);
                startActivity(intent);
                finish();
            }
        };//END TASK DEFINITION

        Timer time = new Timer();
        time.schedule(task, 2000);

        //------------------------------------------------------------------------------------------

    }//END ONCREATE

    //----------------------------------------------------------------------------------------------

}//END CLASS

//--------------------------------------------------------------------------------------------------