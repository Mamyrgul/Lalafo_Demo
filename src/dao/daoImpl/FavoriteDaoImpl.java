package dao.daoImpl;

import dao.FavoriteDao;
import dataBase.DataBase;
import models.Favorite;

import java.util.List;

public class FavoriteDaoImpl implements FavoriteDao {
    @Override
    public void addFavorite(Favorite favorite) {
        DataBase.favorites.add(favorite);
        System.out.println(favorite);
    }

    @Override
    public Favorite getFavorite(Long id) {
        return DataBase.favorites.stream()
                .filter(favorite -> favorite.getId().equals(id))
                .findFirst()
                .orElse(null);
    }


    @Override
    public void removeFavorite(Long id) {
        boolean  delete = DataBase.favorites.removeIf(favorite -> favorite.getId().equals(id));
        System.out.println(delete?"Successfully deleted":"Try again");
    }

    @Override
    public List<Favorite> listFavorites() {
        return DataBase.favorites;
    }
}
