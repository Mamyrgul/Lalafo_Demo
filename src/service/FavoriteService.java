package service;

import models.Favorite;

import java.util.List;

public interface FavoriteService {
    void addFavorite(Favorite favorite);
    Favorite getFavorite(Long id);
    void removeFavorite(Long id);
    List<Favorite> listFavorites();
}
