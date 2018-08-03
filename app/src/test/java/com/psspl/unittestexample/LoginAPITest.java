package com.psspl.unittestexample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.lang.annotation.Target;

import retrofit2.Call;
import retrofit2.Response;

import static junit.framework.Assert.assertTrue;

/**
 * Created by haresh
 * on 20-07-2018.
 */
public class LoginAPITest {
    public static String mHeader;
    DashBaordAPI mDashBaordAPI=new DashBaordAPI();
    MasterDataAPI masterDataAPI=new MasterDataAPI();
    @Test
    public void login_Success() {
        ApiInterface apiEndpoints = ApiClient.getClient("").create(ApiInterface.class);
        Call<Loginmodel> call = apiEndpoints.getLogin("peter@klaven.com","cityslicka");
        try {
            Response<Loginmodel> response = call.execute();
            Loginmodel authResponse = response.body();
            mHeader=authResponse.getToken();
            if(response.isSuccessful()){
            }
            assertTrue(response.isSuccessful());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @After
    public void getmDashBaordAPI() {
       // mDashBaordAPI.getDashBoardAPI();
    }

    @After
    public void getMasterDataAPI() {
      //  masterDataAPI.getULDType();
       // masterDataAPI.getEquipmentType();
    }
}
