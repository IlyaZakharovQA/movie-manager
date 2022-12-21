package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void shoulAddFilm() {
        String film6 = "Film 6";
        FilmManager manager = new FilmManager();
        manager.addFilm(film6);

        String[] expected = {"Film 6"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAll() {
        String film1 = "Film 1";
        String film2 = "Film 2";
        String film3 = "Film 3";
        String film4 = "Film 4";
        String film5 = "Film 5";
        String film6 = "Film 6";
        String film7 = "Film 7";
        String film8 = "Film 8";
        String film9 = "Film 9";
        String film10 = "Film 10";
        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7", "Film 8", "Film 9", "Film 10"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast5() {
        String film1 = "Film 1";
        String film2 = "Film 2";
        String film3 = "Film 3";
        String film4 = "Film 4";
        String film5 = "Film 5";
        String film6 = "Film 6";
        String film7 = "Film 7";
        String film8 = "Film 8";
        String film9 = "Film 9";
        String film10 = "Film 10";
        FilmManager manager = new FilmManager(5);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);

        String[] expected = {"Film 10", "Film 9", "Film 8", "Film 7", "Film 6"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast10() {
        String film1 = "Film 1";
        String film2 = "Film 2";
        String film3 = "Film 3";
        String film4 = "Film 4";
        String film5 = "Film 5";
        String film6 = "Film 6";
        String film7 = "Film 7";
        String film8 = "Film 8";
        String film9 = "Film 9";
        String film10 = "Film 10";
        FilmManager manager = new FilmManager(10);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);

        String[] expected = {"Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast4() {
        String film1 = "Film 1";
        String film2 = "Film 2";
        String film3 = "Film 3";
        String film4 = "Film 4";
        FilmManager manager = new FilmManager(5);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);


        String[] expected = {"Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
