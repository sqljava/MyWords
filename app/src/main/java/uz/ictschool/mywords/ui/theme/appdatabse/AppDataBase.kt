package uz.ictschool.mywords.ui.theme.appdatabse

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import uz.ictschool.mywords.ui.theme.appdatabse.dao.WordDao
import uz.ictschool.mywords.ui.theme.appdatabse.entity.Word


@Database(entities = [Word::class], version = 1)
abstract class AppLocalDatabase : RoomDatabase() {
    abstract fun getWordDao(): WordDao

    companion object {
        private var instance: AppLocalDatabase? = null
        fun getInstance(context: Context): AppLocalDatabase {
            if (instance == null) instance =
                Room.databaseBuilder(context, AppLocalDatabase::class.java, "app_local_database").allowMainThreadQueries()
                    .build()
            return instance!!
        }
    }
}