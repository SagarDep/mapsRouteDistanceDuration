package putuguna.com.mapsnomatrix;


import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Daniel on 10/20/2015.
 */
public class Data {

    private String latitude;
    private String longitude;
    @SerializedName("created_at")
    private String modified;
    @SerializedName("legs")
    private Legs legs;

    public Legs getLegs() {
        return legs;
    }

    public void setLegs(Legs legs) {
        this.legs = legs;
    }

    public Data() {
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

}