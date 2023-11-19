import com.fasterxml.jackson.annotation.JsonProperty

data class User(
    // Annotation @JsonProperty spécifiant le nom du champ dans la réponse JSON
    @JsonProperty("_id")
    val id: String,

    @JsonProperty("name")
    val name: String,

    @JsonProperty("email")
    val email: String,

    @JsonProperty("password")
    val password: String
)
