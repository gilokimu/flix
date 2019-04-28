package me.gilo.flix.models;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.PrimaryKey;
import com.google.firebase.firestore.IgnoreExtraProperties;
import com.google.firebase.firestore.ServerTimestamp;
import me.gilo.flix.utils.DateUtils;

import java.io.Serializable;
import java.util.Date;


/**
 * A Base Model to be extended by other models to add ids.
 */

@IgnoreExtraProperties
public class Model implements Serializable {

    @PrimaryKey
    @ColumnInfo(name = "id")
    public String id;

    @ServerTimestamp
    private Date date_created = null;


    public <T extends Model> T withId(@NonNull final String id) {
        this.id = id;
        return (T) this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate_created() {
        return date_created;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }

    public String getWellFormatedDateCreated(){
        if (getDate_created() != null) {
            return  DateUtils.getDateString_shortAndSmart(getDate_created());
        }

        return "";
    }

}
