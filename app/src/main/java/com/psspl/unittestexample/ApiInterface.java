package com.psspl.unittestexample;


import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by samir on 9/4/2017.
 */

public interface ApiInterface {
    @FormUrlEncoded
    @POST("api/login?")
    Call<Loginmodel> getLogin(@Field("email") String userName, @Field("password")String Password);

    @GET("dashboard/GetDashboardBadgeCount")
    Call<DasBoardEntity>getDashBoard();
    @GET("masters/uldtype?")
    Call<ULDTypeEntity>getULDType();
    @GET("masters/equipmenttype?")
    Call<EquipmentTypeEntity>getEquipmentType();
}
