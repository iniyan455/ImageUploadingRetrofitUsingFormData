package com.iniyan.imageuploadingusingretrofit;


import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface RetrofitInterface {

    @Multipart
    @POST("api/appuserinst/")
    Call<Response> uploadImage(@Part("firmname") RequestBody firmname,
                               @Part("ownername") RequestBody ownername,
                               @Part("email") RequestBody email,
                               @Part("mobile") RequestBody mobile,
                               @Part("address") RequestBody address,
                               @Part("area") RequestBody area,
                               @Part("city") RequestBody city,
                               @Part("pincode") RequestBody pincode,
                               @Part MultipartBody.Part image,
                               @Part MultipartBody.Part image1,
                               @Part MultipartBody.Part image2);

}
