package com.alexbarral.movieapp.presentation.view;

import com.alexbarral.movieapp.presentation.model.ConfigurationModel;
import com.alexbarral.movieapp.presentation.model.TvShowModel;

import java.util.Collection;

/**
 * Created by alejandrobarral on 3/4/18.
 */

public interface DetailView extends BaseView {

    /**
     * Swhows an especific tvshow
     *
     * @param tvShow tvshow to show
     */
    void viewTvShow(ConfigurationModel configuration, TvShowModel tvShow);

    void renderSimilarTvShows(ConfigurationModel configurationModel, Collection<TvShowModel> tvShowModels);
}

