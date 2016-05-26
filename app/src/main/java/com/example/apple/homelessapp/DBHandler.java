package com.example.apple.homelessapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.SQLException;
import android.content.ContentValues;
import android.database.Cursor;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by apple on 4/25/16.
 */
public class DBHandler {
    public static final int DATABASE_VERSION = 15;

    public static final String DATABASE_NAME = "BuildingInfo";
    // Contacts table name
    // shelters Table Columns names

    private static final String TABLE_BUILDINGS = "shelters";
    // shelters Table Columns names
    public static final String KEY_ID = "id";
    public static final String KEY_TYPE = "type";
    public static final String KEY_OPEN = "open";
    public static final String KEY_NAME = "name";
    public static final String KEY_SH_ADDR = "address";
    public static final String KEY_PHONE = "phone";
    public static final String KEY_EMAIL = "email";
    public static final String KEY_SCHEDULE = "schedule";
    public static final String KEY_DESCRIP = "description";
    public static final String KEY_WEB = "website";
    public static final String KEY_INSTRUC = "instructions";


    private DatabaseHelper mDbHelper;
    public SQLiteDatabase mDb;

    private final Context mCtx;



    private static class DatabaseHelper extends SQLiteOpenHelper {
        DatabaseHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }


        @Override
        public void onCreate(SQLiteDatabase db) {


        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        }
    }

    public DBHandler(Context ctx) {
        this.mCtx = ctx;
    }

    public DBHandler open() throws SQLException {
        this.mDbHelper = new DatabaseHelper(this.mCtx);
        this.mDb = this.mDbHelper.getWritableDatabase();
        return this;
    }

    /**
     * close return type: void
     */


    public void addBuilding(Building building) {
        //SQLiteDatabase db = this.mDb;
        ContentValues values = new ContentValues();
        values.put(KEY_ID, building.getId());
        values.put(KEY_TYPE, building.getType());
        values.put(KEY_OPEN, building.getOpen());
        values.put(KEY_NAME, building.getName()); // building Name
        values.put(KEY_SH_ADDR, building.getAddress()); // building Address
        values.put(KEY_PHONE, building.getPhone());
        values.put(KEY_EMAIL, building.getEmail());
        values.put(KEY_SCHEDULE, building.getSchedule());
        values.put(KEY_DESCRIP, building.getDescription());
        values.put(KEY_WEB, building.getWebsite());
        values.put(KEY_INSTRUC, building.getInstructions());



// Inserting Row
        this.mDb.insert(TABLE_BUILDINGS, null, values);
        //mdb.close(); // Closing database connection
    }



    public void close() {
        this.mDbHelper.close();
    }
    // Getting one building
    public Building getBuilding(int id) {
        SQLiteDatabase db = this.mDb;
        Cursor cursor = db.query(TABLE_BUILDINGS, new String[] { KEY_ID, KEY_TYPE,
                        KEY_OPEN, KEY_NAME, KEY_SH_ADDR, KEY_PHONE, KEY_EMAIL, KEY_SCHEDULE,
                        KEY_DESCRIP, KEY_WEB, KEY_INSTRUC}, KEY_ID + "=?",
                new String[] { String.valueOf(id) }, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();
        Building contact = new Building(Integer.parseInt(cursor.getString(0)), cursor.getInt(1),
                (cursor.getInt(2) == 1), cursor.getString(3), cursor.getString(4),
                cursor.getString(5), cursor.getString(6), cursor.getString(7),
                cursor.getString(8), cursor.getString(9), cursor.getString(10));
// return building
        return contact;
    }

    // Getting All buildings
    public List<Building> getAllBuildings() {
        List<Building> buildingList = new ArrayList<Building>();
// Select All Query
        String selectQuery = "SELECT * FROM " + TABLE_BUILDINGS;
        SQLiteDatabase db = this.mDb;
        Cursor cursor = db.rawQuery(selectQuery, null);
// looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Building building = new Building();
                building.setId(Integer.parseInt(cursor.getString(0)));
                building.setType(cursor.getInt(1));
                building.setOpen((cursor.getInt(2) == 1));
                building.setName(cursor.getString(3));
                building.setAddress(cursor.getString(4));
                building.setPhone(cursor.getString(5));
                building.setEmail(cursor.getString(6));
                building.setSchedule(cursor.getString(7));
                building.setDescription(cursor.getString(8));
                building.setWebsite(cursor.getString(9));
                building.setInstructions(cursor.getString(10));

// Adding contact to list
                buildingList.add(building);
            } while (cursor.moveToNext());
        }
// return contact list
        return buildingList;
    }

    // Getting shelters Count
    public int getBuildingsCount() {
        String countQuery = "SELECT * FROM " + TABLE_BUILDINGS;
        SQLiteDatabase db = this.mDb;
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();
// return count
        return cursor.getCount();
    }

    // Updating a shelter
    public int updateShop(Building shelter) {
        SQLiteDatabase db = this.mDb;
        ContentValues values = new ContentValues();
        values.put(KEY_NAME, shelter.getName());
        values.put(KEY_SH_ADDR, shelter.getAddress());
        values.put(KEY_PHONE, shelter.getPhone());
// updating row
        return db.update(TABLE_BUILDINGS, values, KEY_ID + " = ?",
                new String[]{String.valueOf(shelter.getId())});
    }

    // Deleting a shelter
    public void deleteShop(Building building) {
        SQLiteDatabase db = this.mDb;
        db.delete(TABLE_BUILDINGS, KEY_ID + " = ?",
                new String[] { String.valueOf(building.getId()) });
        db.close();
    }


}

