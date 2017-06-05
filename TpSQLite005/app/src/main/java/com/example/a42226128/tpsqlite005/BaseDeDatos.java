package com.example.a42226128.tpsqlite005;


import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
/**
 * Created by 42226128 on 5/6/2017.
 */
public class BaseDeDatos extends SQLiteOpenHelper{
    String sqlCreate = "CREATE TABLE Usuarios(Nombre TEXT)";
    public BaseDeDatos(Context context, String nombre, CursorFactory factory, int version) {
        super(context, nombre, factory, version);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(sqlCreate);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int VersionAnterior, int VersionNueva) {
        db.execSQL("DROP TABLE IF EXISTS Usuarios");
        db.execSQL(sqlCreate);

    }
}
