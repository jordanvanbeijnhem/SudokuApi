package nl.jordanvanbeijnhem.sudoku.model

import com.google.gson.annotations.SerializedName

data class Cell(
        @SerializedName("y") val row: Int = 0,
        @SerializedName("x") val column: Int = 0,
        val value: Int = 0,
        @Transient val fixed: Boolean = true
) {
}