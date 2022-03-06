package com.projetandroid.AudioDB_API

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory

object TheAudioDBAPI {
    private val baseUrl = "https://www.theaudiodb.com"

    fun getInstance(): Retrofit {

        return Retrofit
            .Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(
                CoroutineCallAdapterFactory()
            )
            .build()
    }
}