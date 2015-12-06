package pl.tajchert.cracowmaterialpollution.api;

import java.util.List;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by Tajchert on 06.12.2015.
 */
public interface ApiService {
    @GET("/data")
    Call<List<ApiMalopolska>> getMalopolska(@Query("type") String type, @Query("city") String city, @Query("parameter") String parameter, @Query("average") String average);
}
