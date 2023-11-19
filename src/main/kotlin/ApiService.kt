import retrofit2.Call
import retrofit2.http.GET

interface MyApi {
    @GET("users")
    fun getUsers(): Call<List<User>>
}
