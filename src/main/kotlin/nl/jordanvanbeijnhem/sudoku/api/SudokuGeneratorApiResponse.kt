package nl.jordanvanbeijnhem.sudoku.api

import com.google.gson.annotations.SerializedName
import nl.jordanvanbeijnhem.sudoku.model.Cell

data class SudokuGeneratorApiResponse(
        @SerializedName("squares") var cells: List<Cell>
)