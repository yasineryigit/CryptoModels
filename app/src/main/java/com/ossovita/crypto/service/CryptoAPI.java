package com.ossovita.crypto.service;

import com.ossovita.crypto.model.CryptoModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    //GET,POST,UPDATE,DELETE
    //https://api.nomics.com/v1/prices?key=a5554d73a36b2309d79d774d4247f302
    //aşağıdaki adrese bir get isteği yolla
    @GET("prices?key=a5554d73a36b2309d79d774d4247f302")
    //Buradan bir liste içerisinde CryptoModel'leri gelecek diyoruz
    Call<List<CryptoModel>> getData();
}
