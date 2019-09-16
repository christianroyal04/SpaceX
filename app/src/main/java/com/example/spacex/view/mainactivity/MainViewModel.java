package com.example.spacex.view.mainactivity;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.spacex.model.Launch;
import com.example.spacex.repository.SpaceXRepo;

import java.util.List;

public class MainViewModel extends AndroidViewModel {
    private SpaceXRepo repository;

    public MainViewModel(@NonNull Application application) {
        super(application);
        repository = SpaceXRepo.getInstance();
    }

    void loadLaunchData() {
        repository.loadLaunchHistory();
    }

    void loadNext() {
        repository.loadNext();
    }

    LiveData<List<Launch>> getLaunchListLiveData() {
        return repository.getLaunchResponseLive();
    }
}
