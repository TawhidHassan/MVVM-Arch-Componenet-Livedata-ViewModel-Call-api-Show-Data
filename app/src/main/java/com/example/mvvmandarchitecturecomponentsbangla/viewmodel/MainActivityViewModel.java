package com.example.mvvmandarchitecturecomponentsbangla.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.NonNull;

import com.example.mvvmandarchitecturecomponentsbangla.model.User;
import com.example.mvvmandarchitecturecomponentsbangla.model.UserRepository;

public class MainActivityViewModel extends AndroidViewModel {

    UserRepository userRepository;


    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        userRepository=new UserRepository(application);
    }

    public LiveData<User[]> getAllUserData()
    {
        return userRepository.getUserData();
    }

}
