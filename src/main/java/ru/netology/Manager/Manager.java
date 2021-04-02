package ru.netology.Manager;

import ru.netology.Domain.MovieItem;

public class Manager {

    private MovieItem[] items = new MovieItem[0];
   private  int returnMovies=10;


    public Manager(int returnMovies) {

        this.returnMovies = returnMovies;
    }

    public Manager() {

    }


    public void add(MovieItem item) {
        int length = items.length + 1;
        MovieItem[] tmp = new MovieItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int LastIndex = tmp.length - 1;
        tmp[LastIndex] = item;
        items = tmp;
    }

    public MovieItem[] getAll() {
       int resultSize= Math.min(items.length, returnMovies);


        MovieItem[] result = new MovieItem[resultSize];

        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
            return result;

    }

        public void removeById(int movieId){
            int length = items.length - 1;
            MovieItem[] tmp = new MovieItem[length];
            int index = 0;
            for (MovieItem item : items) {
                if (item.getMovieId() != movieId) {
                    tmp[index] = item;
                    index++;
                }
            }
            items = tmp;
        }
    }

