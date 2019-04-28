package me.gilo.flix.db;


import androidx.room.Database;
import androidx.room.RoomDatabase;
import me.gilo.flix.dao.DaoAccess;
import me.gilo.flix.models.Note;

@Database(entities = {Note.class}, version = 1, exportSchema = false)
public abstract class NoteDatabase extends RoomDatabase {

    public abstract DaoAccess daoAccess();
}
