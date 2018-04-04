package com.alexbarral.movieapp.data.repository.datasource;

import com.alexbarral.movieapp.data.entity.TvShowsEntity;

import io.reactivex.Observable;

/**
 * Created by alejandrobarral on 4/4/18.
 */

public interface DataStore {

    /**
     *
     * @param page
     * @return
     */

     Observable<TvShowsEntity> tvShowsList(int page);

}