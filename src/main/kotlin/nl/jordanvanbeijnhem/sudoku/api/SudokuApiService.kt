package nl.jordanvanbeijnhem.sudoku.api

import nl.jordanvanbeijnhem.sudoku.model.Difficulty
import nl.jordanvanbeijnhem.sudoku.model.Sudoku
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface SudokuApiService {

    @GET("board")
    fun getSudoku(@Query("difficulty") difficulty: Difficulty): Call<Sudoku>
}