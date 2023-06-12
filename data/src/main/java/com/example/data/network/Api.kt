package com.example.data.network

import retrofit2.http.GET
import retrofit2.http.POST

interface Api {

    @GET
    fun getVideo()

    @POST
    fun postUri()


}