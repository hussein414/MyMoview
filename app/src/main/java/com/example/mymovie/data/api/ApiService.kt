package com.example.mymovie.data.api

import com.example.mymovie.data.model.TvShowsModelItem
import com.example.mymovie.utils.Constance
import com.example.mymovie.utils.Constance.END_POINT
import retrofit2.http.GET

interface ApiService {
    @GET(END_POINT)
    suspend fun getMovieShows(): TvShowsModelItem
}