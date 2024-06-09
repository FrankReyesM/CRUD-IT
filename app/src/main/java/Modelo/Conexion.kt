package Modelo

import java.sql.Connection
import java.sql.DriverManager
import kotlin.Exception

class Conexion {

    fun cadenaConexion(): Connection? {

        try {
            val url = "jdbc:oracle:thin:@192.168.1.15:1521:xe"
                val usuario ="system"
                val contrasena = "desarrollo"

            val conexion = DriverManager.getConnection(url, usuario, contrasena)
            return conexion
        }catch (e: Exception){
            println("Este es el error: $e")
            return null
        }
    }

}