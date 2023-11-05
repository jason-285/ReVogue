//--------------------------------------------------------------------------------------------------

/*IMPORTS*/

package com.jason.revogue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    //----------------------------------------------------------------------------------------------

    /*VARS DEFINITION*/

    TextView skipBtn;

    //----------------------------------------------------------------------------------------------

    /*ONCREATE METHOD*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //------------------------------------------------------------------------------------------

        /*INSTANT VAR*/

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        skipBtn = findViewById(R.id.skipBtn);

        //------------------------------------------------------------------------------------------

        /*LiSTENER METHODS*/

        skipBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(Login.this, MainScreen.class);
                //startActivity(intent);
            }
        });

        //------------------------------------------------------------------------------------------

    }//END ONCREATE

    //----------------------------------------------------------------------------------------------

}//END CLASS

//--------------------------------------------------------------------------------------------------