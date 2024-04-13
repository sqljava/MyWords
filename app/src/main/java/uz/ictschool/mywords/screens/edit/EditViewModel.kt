package uz.ictschool.mywords.screens.edit

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import uz.ictschool.mywords.localDatabse.entity.Word

class EditViewModel(context: Context, id: Int) {

    val model = EditModel(context)

    private var _wordOnEdit = MutableLiveData(model.getWordById(id))
    val wordOnEdit: LiveData<Word> = _wordOnEdit




}