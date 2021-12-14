package com.karis.adalabs_pixabayapi.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.karis.adalabs_pixabayapi.data.network.responses.HitsItem
import com.karis.adalabs_pixabayapi.paging.RemoteKeysDao

@Database(entities = [HitsItem::class], version = 0, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract val imagesDao : ImagesDao
    abstract val remoteKeysDao: RemoteKeysDao

}