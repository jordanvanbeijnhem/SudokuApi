package nl.jordanvanbeijnhem.sudoku.api

import nl.jordanvanbeijnhem.sudoku.converter.EnumConvertFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class SudokuApi {

    companion object {

        private const val baseUrl = "https://sugoku.herokuapp.com/"

        fun createApi(): SudokuApiService {
            val httpLoggingInterceptor = HttpLoggingInterceptor()
            val okHttpClient = OkHttpClient.Builder()
                    .addInterceptor(httpLoggingInterceptor.apply { httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY })
                    .build()

            val sudokuApi = Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .client(okHttpClient)
                    .addConverterFactory(EnumConvertFactory())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()

            return sudokuApi.create(SudokuApiService::class.java)
        }
    }
}