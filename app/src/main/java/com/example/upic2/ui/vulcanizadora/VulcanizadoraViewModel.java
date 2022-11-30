package com.example.upic2.ui.vulcanizadora;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class VulcanizadoraViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public VulcanizadoraViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}