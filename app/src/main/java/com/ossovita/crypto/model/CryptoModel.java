package com.ossovita.crypto.model;

import com.google.gson.annotations.SerializedName;

public class CryptoModel {

    @SerializedName("currency")//apiden gelecek datanın değişken adıyla aynı olacak
    public String currency;

    @SerializedName("price")
    public String price;
}
