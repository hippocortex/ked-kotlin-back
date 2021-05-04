package com.pse.kotlinked

import com.pse.kotlinked.application.model.FilmResponseDto
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinKedApplication

fun main(args: Array<String>) {

    //non-null types
    //ne peut pas etre null si on ne lle precise comme nullable
    val logger = LoggerFactory.getLogger(KotlinKedApplication::class.java)
    //peut etre null car ajout du ?
    var demoVarNullable: String? = "test de nullable"
    demoVarNullable = null
    logger.info("longueur de la String ${demoVarNullable?.length}")
    //peut pas compiler car nullable ajout du '?' pour passer la compilation
    //val length = demoVarNullable.length
    logger.info("longuer de la String avec ? et valeur null ==> ${demoVarNullable?.length}")
    var demoNotNullValue: String = "not null value"
    //ne peut pas compiler car non nullable
    //demoNotNullValue=null
    //value not null donc utilisable sans erreur
    val lengthNotNull = demoNotNullValue.length
    logger.info("longuer de la chaine non nullable ==> ${demoNotNullValue.length}")


    //immuabilité "simple"
    val immutableString = "immutable"
    //immutableString="modify immutable string"

    val listWithNulls: List<FilmResponseDto?> = listOf(FilmResponseDto(id = "1", title = "first"), null)
    for (item in listWithNulls) {
        item?.let { logger.info(it.toString()) } // prints Kotlin and ignores null
    }
    runApplication<KotlinKedApplication>(*args)
}
