package nl.jordanvanbeijnhem.sudoku

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import org.springframework.boot.builder.SpringApplicationBuilder


@SpringBootApplication
class SudokuApplication : SpringBootServletInitializer() {

    override fun configure(application: SpringApplicationBuilder): SpringApplicationBuilder {
        return application.sources(SudokuApplication::class.java)
    }
}

fun main(args: Array<String>) {
    runApplication<SudokuApplication>(*args)
}
