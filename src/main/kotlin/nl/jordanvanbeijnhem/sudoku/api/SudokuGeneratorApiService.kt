package nl.jordanvanbeijnhem.sudoku.api

import nl.jordanvanbeijnhem.sudoku.model.Difficulty
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface SudokuGeneratorApiService {

    @GET("sudoku/new?size=9")
    fun getSudoku(@Query("level") difficulty: Difficulty): Call<SudokuGeneratorApiResponse>
}