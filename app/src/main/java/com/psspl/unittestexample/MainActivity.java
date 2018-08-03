package com.psspl.unittestexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static junit.framework.Assert.assertTrue;


/*
* Developed by Prakash Software Solution
* This is unit test POC Project.
*/
public class MainActivity extends AppCompatActivity {
    //Define UI Components
    public Button btnSubmit;
    public EditText editEmail,editPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Set UI View
        setContentView(R.layout.activity_main);

        //Initialize UI Components
        btnSubmit=findViewById(R.id.btnSubmit);
        editEmail=findViewById(R.id.editEmail);
        editPassword=findViewById(R.id.editPassword);

        //This Button Events
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login_Success();
            }
        });
    }

    String mHeader;
    public void login_Success() {
        ApiInterface apiEndpoints = ApiClient.getClient("").create(ApiInterface.class);
        Call<Loginmodel> call = apiEndpoints.getLogin("peter@klaven","cityslicka");
        try {
            call.enqueue(new Callback<Loginmodel>() {
                @Override
                public void onResponse(Call<Loginmodel> call, Response<Loginmodel> response) {
                    Loginmodel authResponse = response.body();
                    mHeader=response.headers().get("Authorization-Token");
                }

                @Override
                public void onFailure(Call<Loginmodel> call, Throwable t) {
                    Log.i("exception",t.getLocalizedMessage());
                }
            });


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    void getULDType(){
        ApiInterface apiEndpoints = ApiClient.getClient(mHeader).create(ApiInterface.class);
        Call<ULDTypeEntity> call = apiEndpoints.getULDType();
        try {
            Response<ULDTypeEntity> response = call.execute();
            ULDTypeEntity authResponse = response.body();
            assertTrue(response.isSuccessful());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void getEquipmentType(){
        ApiInterface apiEndpoints = ApiClient.getClient(mHeader).create(ApiInterface.class);
        Call<EquipmentTypeEntity> call = apiEndpoints.getEquipmentType();
        try {
            Response<EquipmentTypeEntity> response = call.execute();
            EquipmentTypeEntity authResponse = response.body();
            assertTrue(response.isSuccessful());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void getDashBoardAPI(){
        ApiInterface apiEndpoints = ApiClient.getClient(mHeader).create(ApiInterface.class);
        Call<DasBoardEntity> call = apiEndpoints.getDashBoard();
        try {
            Response<DasBoardEntity> response = call.execute();
            DasBoardEntity authResponse = response.body();
            assertTrue(response.isSuccessful());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
