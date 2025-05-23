package mx.edu.itson.practica12_crud

data class Tarea(
    var id: String = "",
    var titulo: String = "",
    var descripcion: String = ""
) {
    fun toMap(): Map<String, String> {
        return mapOf(
            "titulo" to titulo,
            "descripcion" to descripcion
        )
    }
}