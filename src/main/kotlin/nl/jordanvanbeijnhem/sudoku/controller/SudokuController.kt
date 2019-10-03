package nl.jordanvanbeijnhem.sudoku.controller

import nl.jordanvanbeijnhem.sudoku.api.SudokuGeneratorApi
import nl.jordanvanbeijnhem.sudoku.model.Cell
import nl.jordanvanbeijnhem.sudoku.model.Difficulty
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("")
class SudokuController {

    @GetMapping
    fun getSudoku(@RequestParam("difficulty") difficulty: Difficulty): List<Cell>? {
        val api = SudokuGeneratorApi.createApi()
        val cells = arrayListOf<Cell>()

        val response = api.getSudoku(difficulty).execute()
        response.body()?.cells?.let {
            cells.addAll(it)
            addEmptyCells(cells)
        }

        return cells
    }

    private fun addEmptyCells(cells: ArrayList<Cell>) {
        for (column in 0..8) {
            for (row in 0..8) {
                if (!cellExists(row, column, cells)) {
                    cells.add(Cell(row, column, 0, false))
                }
            }
        }
    }

    private fun cellExists(row: Int, column: Int, cells: List<Cell>): Boolean {
        cells.forEach() {
            if (it.row == row && it.column == column)
                return true
        }
        return false
    }
}