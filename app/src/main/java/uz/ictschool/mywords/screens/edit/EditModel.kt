package uz.ictschool.mywords.screens.edit

import android.content.Context
import uz.ictschool.mywords.localDatabse.AppDataBase
import uz.ictschool.mywords.localDatabse.entity.Word

class EditModel(context: Context) {
    val db = AppDataBase.getInstance(context)
    val wordDao = db.getWordDao()

    fun addWord(word: Word){
        wordDao.addWord(word)
    }
    fun editWord(word: Word){
        wordDao.updateWord(word)
    }
    fun deleteWord(word: Word){
        wordDao.deleteWord(word)
    }
    fun getWordById(id: Int):Word{
        return wordDao.getWordById(id)
    }
}