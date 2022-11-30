package com.example.upic2.ui.mecanico;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class MecanicoViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public MecanicoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");

    }

    public LiveData<String> getText() {
        return mText;
    }


}