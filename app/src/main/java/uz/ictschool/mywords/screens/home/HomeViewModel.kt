package uz.ictschool.mywords.screens.home

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import uz.ictschool.mywords.localDatabse.entity.Word

class HomeViewModel(context: Context) {
    val model = HomeModel(context)

    private var _allWords = MutableLiveData(model.getAllWords())
    val allWords: LiveData<MutableList<Word>> = _allWords

    fun updateData(){
        _allWords.value = model.getAllWords()
    }
}