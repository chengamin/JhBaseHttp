package com.jh.jhbasehttp;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("search/error.html")
    Call<ResponseBody> baiDu();

}
