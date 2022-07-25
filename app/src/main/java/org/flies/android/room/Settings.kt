package org.flies.android.room

import androidx.room.Dao
import androidx.room.Database
import androidx.room.Entity
import androidx.room.RoomDatabase

@Entity
data class Settings(val id: Int)

@Dao
interface SettingsDAO {

}

@Database(
    entities = [Settings::class],
    version = 20
) abstract class LocalDB: RoomDatabase() {
    abstract fun getSettingsDao(): SettingsDAO
}



