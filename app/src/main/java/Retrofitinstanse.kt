import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://tyutorapi.kspi.uz/swagger/") // O'zingizning server manzilingizni qo'ying
        .addConverterFactory(GsonConverterFactory.create())
        .build()


}