package com.ijazsunny37.fyphomesecuritysystem;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by apple on 19/8/17.
 */

public class DataBase_helper extends SQLiteOpenHelper {
    public static final  String DATABASE_NAME = "image_database";
    public static final  String TABLE_NAME = "image_data";
    public static final  String COLUMN_1 = "id";
    public static final  String COLUMN_2 = "name";
    public static final  String COLUMN_3 = "date";

    public DataBase_helper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table"+TABLE_NAME+"(id integer primary key autoincrement, name text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXIST"+TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
}
