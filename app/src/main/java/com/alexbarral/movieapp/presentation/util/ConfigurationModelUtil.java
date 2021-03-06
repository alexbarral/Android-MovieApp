package com.alexbarral.movieapp.presentation.util;

import com.alexbarral.movieapp.presentation.model.ConfigurationModel;
import com.alexbarral.movieapp.presentation.model.TvShowModel;

/**
 * Created by alejandrobarral on 4/4/18.
 */

public class ConfigurationModelUtil {

    public static String getPosterUrl(ConfigurationModel configurationModel, TvShowModel tvShowModel){
        String imagePath;

        if (tvShowModel.getPoster_path() != null && !tvShowModel.getPoster_path().isEmpty()) {
            imagePath = tvShowModel.getPoster_path();
        } else {
            imagePath = tvShowModel.getBackdrop_path();
        }
        if (configurationModel != null && configurationModel.getBaseUrl() != null && !configurationModel.getBaseUrl().isEmpty()) {
            if (configurationModel.getPosterSizes() != null) {
                if (configurationModel.getPosterSizes().contains("w500")){
                    return configurationModel.getBaseUrl() + "w500" + imagePath;
                } else {
                    return configurationModel.getBaseUrl() + configurationModel.getPosterSizes().get(0) + imagePath;
                }
            }
        }
        return "";
    }
}
