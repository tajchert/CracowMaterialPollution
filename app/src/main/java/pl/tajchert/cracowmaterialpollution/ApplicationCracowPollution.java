package pl.tajchert.cracowmaterialpollution;

import android.app.Application;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * Created by Tajchert on 06.12.2015.
 */
public class ApplicationCracowPollution extends Application {
    public static Retrofit retrofit;
    public static final String URL_MALOPOLSKA = "http://powietrze.malopolska.pl";



    @Override
    public void onCreate() {
        super.onCreate();
        retrofit = new Retrofit.Builder()
                .baseUrl(URL_MALOPOLSKA)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}