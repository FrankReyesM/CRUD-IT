package Modelo

data class Ticket (

    val UUID_TICKET: String,
    val num_ticket: Int,
    var titulo: String,
    val descripcion: String,
    val autor:String,
    val email_autor: String,
    val fecha_ticket: String,
    val estado: String,
    val fecha_fin_ticket: String

)