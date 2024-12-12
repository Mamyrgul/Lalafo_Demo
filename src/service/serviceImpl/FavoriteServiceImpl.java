package service.serviceImpl;

import dao.FavoriteDao;
import dao.daoImpl.FavoriteDaoImpl;
import models.Favorite;
import service.FavoriteService;

import java.util.List;

public class FavoriteServiceImpl implements FavoriteService {
    public final FavoriteDao favoriteDao = new FavoriteDaoImpl();

    @Override
    public void addFavorite(Favorite favorite) {
        favoriteDao.addFavorite(favorite);
    }

    @Override
    public Favorite getFavorite(Long id) {
        return favoriteDao.getFavorite(id);
    }

    @Override
    public void removeFavorite(Long id) {
    favoriteDao.removeFavorite(id);
    }

    @Override
    public List<Favorite> listFavorites() {
        return favoriteDao.listFavorites();
    }
}
