package nl.jordanvanbeijnhem.sudoku.controller

import nl.jordanvanbeijnhem.sudoku.api.SudokuApi
import nl.jordanvanbeijnhem.sudoku.model.Difficulty
import nl.jordanvanbeijnhem.sudoku.model.Sudoku
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("")
class SudokuController {

    @GetMapping
    fun getSudoku(@RequestParam("difficulty") difficulty: Difficulty): Sudoku? {
        return SudokuApi.createApi().getSudoku(difficulty).execute().body()
    }
}