package ru.netology.Manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.Domain.MovieItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ManagerTest {
    private Manager manager = new Manager();

    private MovieItem first = new MovieItem(1, "first", "Cartoon");
    private MovieItem second = new MovieItem(2, "second", "Detective");
    private MovieItem third = new MovieItem(3, "third", "Thriller ");
    private MovieItem fourth = new MovieItem(4, "fourth", "Action");
    private MovieItem fifth = new MovieItem(5, "fifth", "Drama");
    private MovieItem sixth = new MovieItem(6, "sixth", "Romance");
    private MovieItem seventh = new MovieItem(7, "seventh", "Comedy");
    private MovieItem eighth = new MovieItem(8, "eighth", "Fantasy");
    private MovieItem ninth = new MovieItem(9, "ninth", "Adventure");
    private MovieItem tenth = new MovieItem(10, "tenth", "Horror");
    private MovieItem eleventh = new MovieItem(11, "eleventh", "Historical");
    MovieItem[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};


    @BeforeEach
    public void SetUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
    }

    @Test
    public void shouldShowsNothing() {
        Manager manager = new Manager(0);
        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[0];
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowsIfOneMovie() {
        Manager manager = new Manager();
        manager.add(first);
        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{first};
        assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldShowsIfTenMovies() {
        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowIfThreeMovies(){
        Manager manager = new Manager(3);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        MovieItem[] actual=manager.getAll();
        MovieItem[]expected= new MovieItem[]{eleventh,tenth,ninth};
        assertArrayEquals(expected,actual);
    }

    @Test
    public void shouldShowsIfMoreTen() {
        Manager manager = new Manager();
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);

        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotRemoveIfNotExists() {
        int idToRemove = 5;

        manager.removeById(idToRemove);

        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{tenth, ninth, eighth, seventh, sixth, fourth, third,second, first};

        assertArrayEquals(expected, actual);
    }

}

