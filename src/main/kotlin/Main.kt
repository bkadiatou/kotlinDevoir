import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory

fun main() {
    val retrofit = Retrofit.Builder()
        .baseUrl("https://6554e16263cafc694fe72522.mockapi.io/")
        .addConverterFactory(JacksonConverterFactory.create())
        .build()

    val myApi = retrofit.create(MyApi::class.java)

    val resultat = myApi.getUsers().execute()

    if (resultat.isSuccessful) {
        resultat.body().forEachIndexed { index, user ->
            println("User : ${index + 1} | name : ${user.name} | email : ${user.email} | password : ${user.password}")
        }
    } else {
        println("Impossible de recuperer les utilisateurs: ${resultat.code()}")
    }
}
