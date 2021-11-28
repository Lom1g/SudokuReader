package com.lomig.sudokureader;

import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface SudokuGridAPI {

    @Multipart
    @POST("resolve")
    Call<ResponseBody> uploadPicture(
            @Part MultipartBody.Part file);

}
