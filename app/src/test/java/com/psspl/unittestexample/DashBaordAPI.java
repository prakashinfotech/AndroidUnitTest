package com.psspl.unittestexample;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;

import static junit.framework.Assert.assertTrue;

/**
 * Created by haresh
 * on 20-07-2018.
 */
public class DashBaordAPI {
    void getDashBoardAPI(){
        ApiInterface apiEndpoints = ApiClient.getClient(LoginAPITest.mHeader).create(ApiInterface.class);
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
