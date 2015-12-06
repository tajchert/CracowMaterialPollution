package pl.tajchert.cracowmaterialpollution.api;


import com.google.gson.annotations.SerializedName;

public class ApiMalopolska {

    public String type;
    public String province;
    public String provincedesc;
    public String county;
    public String countydesc;
    public String city;
    public String citydesc;
    public String location;
    public String locationdesc;
    @SerializedName("lat")
    public String gspLat;
    @SerializedName("long")
    public String gspLong;
    public String date;
    public String time;
    public String timestamp;
    public String parameter;
    public String parameterdesc;
    public String average;
    public String value;
    public String unit;
    public Object percentoflimit;
    public String caqi;
    public String caqiclass;
    public String caqidesc;
    public String caqicolor;
    public String aqi;
    public String aqiclass;
    public String aqidesc;
    public String aqicolor;
    public Object message;

}