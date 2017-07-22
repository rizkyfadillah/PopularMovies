package com.rizkyfadillah.popularmoviesstage1.di;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.rizkyfadillah.popularmoviesstage1.db.MovieDbHelper;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author Rizky Fadillah on 18/07/2017.
 */
@Module
public class DbModule {

    @Provides
    @Singleton
    public MovieDbHelper provideMovieDbHelper(Context context) {
        return new MovieDbHelper(context);
    }

    @Provides
    @Singleton
    public SQLiteDatabase provideSQLiteDatabase(MovieDbHelper movieDbHelper) {
        return movieDbHelper.getWritableDatabase();
    }

}