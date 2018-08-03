package com.psspl.unittestexample;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;

import static junit.framework.Assert.assertTrue;

/**
 * Created by haresh
 * on 20-07-2018.
 */

public class MasterDataAPI {

    void getULDType(){
        ApiInterface apiEndpoints = ApiClient.getClient(LoginAPITest.mHeader).create(ApiInterface.class);
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
        ApiInterface apiEndpoints = ApiClient.getClient(LoginAPITest.mHeader).create(ApiInterface.class);
        Call<EquipmentTypeEntity> call = apiEndpoints.getEquipmentType();
        try {
            Response<EquipmentTypeEntity> response = call.execute();
            EquipmentTypeEntity authResponse = response.body();
            assertTrue(response.isSuccessful());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
