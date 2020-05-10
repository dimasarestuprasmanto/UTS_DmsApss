package com.dimasarp.aws.dmsapps.ui.home;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Dimas Arestu Prasmanto");
    }

    public LiveData<String> getText() {
        return mText;
    }
}