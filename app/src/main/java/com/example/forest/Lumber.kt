package com.example.forest

import java.sql.DriverManager

data class Lumber(
    val number: Int? = null,
    val height: Int? = null,
    val width: Int? = null,
    val length: Double? = null,
    val amount: Int? = null
)

fun main(){
    val jdbcUrl = "jdbc:postgres://telxdlzqbmrtne:f6d82aa04123063c8bd337c97b9ff748cfa4d191aa70059b9cecf565460569d5@ec2-63-34-180-86.eu-west-1.compute.amazonaws.com:5432/d6jmj8aqjb6170"
    val connection = DriverManager
        .getConnection(jdbcUrl, "telxdlzqbmrtne", "f6d82aa04123063c8bd337c97b9ff748cfa4d191aa70059b9cecf565460569d5")

    println(connection.isValid(0))
}
