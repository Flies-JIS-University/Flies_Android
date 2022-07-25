package org.flies.android.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import org.flies.android.room.LocalDB
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun localDB(@ApplicationContext ctx: Context) =  Room.databaseBuilder(ctx, LocalDB::class.java, "local_db").build()

    @Singleton
    @Provides
    fun settingsDao(db: LocalDB) = db.getSettingsDao()

}