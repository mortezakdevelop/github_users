package com.example.githubusersapp.data.remote

import com.example.githubusersapp.data.model.ResponseUsers
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("/search/users")
    suspend fun searchUsers(@Query("q") username:String): Response<ResponseUsers>

}