package nl.jordanvanbeijnhem.sudoku.model

import com.google.gson.annotations.SerializedName

enum class Difficulty {
    @SerializedName("1") EASY,
    @SerializedName("2") MEDIUM,
    @SerializedName("3") HARD
}