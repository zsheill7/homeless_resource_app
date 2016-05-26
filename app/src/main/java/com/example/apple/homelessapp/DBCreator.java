package com.example.apple.homelessapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by apple on 5/3/16.
 */
public class DBCreator{

    public static final String TABLE_BUILDINGS = "shelters";

    public static void onCreate(SQLiteDatabase db) {
        String CREATE_BUILDING_TABLE = "CREATE TABLE IF NOT EXISTS " + TABLE_BUILDINGS + "("
                + DBHandler.KEY_ID + " INTEGER PRIMARY KEY," + DBHandler.KEY_TYPE + " TEXT," + DBHandler.KEY_NAME + " TEXT," + DBHandler.KEY_OPEN + " TEXT,"
                + DBHandler.KEY_SH_ADDR + " TEXT," + DBHandler.KEY_PHONE + " TEXT," + DBHandler.KEY_EMAIL + " TEXT,"
                + DBHandler.KEY_SCHEDULE + " TEXT," + DBHandler.KEY_DESCRIP + " TEXT," + DBHandler.KEY_INSTRUC + " TEXT," + DBHandler.KEY_WEB + ")";
        db.execSQL(CREATE_BUILDING_TABLE);
    }



    /*public static void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_SHELTERS);
        // Creating tables again
        onCreate(db);
    }*/
}
