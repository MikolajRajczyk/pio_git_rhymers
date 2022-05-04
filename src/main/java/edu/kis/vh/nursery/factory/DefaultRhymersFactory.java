package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

/**
 *  Klasa DefaultRhymersFactory implementująca interfejs Rhymers Factory
 *  zawiera gettery tworzące i zwracające nowe obiekty
 *  klasy DefaultCountingOutRhymer oraz klas z niej dziedziczących - FIFORhymer oraz HanoiRhymer
 */
public class DefaultRhymersFactory implements RhymersFactory {

    /**
     * Metoda zwraca obiekt klasy DefaultCountingOutRhymer. Nie przyjmuje żadnych parametrów
     * @return Obiekt klasy DefaultCountingOutRhymer
     */
    @Override
    public DefaultCountingOutRhymer getStandardRhymer() {
        return new DefaultCountingOutRhymer();
    }

    /**
     * Metoda zwraca obiekt klasy DefaultCountingOutRhymer. Nie przyjmuje żadnych parametrów
     * @return Obiekt klasy DefaultCountingOutRhymer
     */
    @Override
    public DefaultCountingOutRhymer getFalseRhymer() {
        return new DefaultCountingOutRhymer();
    }

    /**
     * Metoda zwraca obiekt klasy FIFORhymer. Nie przyjmuje żadnych parametrów
     * @return Obiekt klasy FIFORhymer
     */
    @Override
    public DefaultCountingOutRhymer getFIFORhymer() {
        return new FIFORhymer();
    }

    /**
     * Metoda zwraca obiekt klasy HanoiRhymer. Nie przyjmuje żadnych parametrów
     * @return Obiekt klasy HanoiRhymer
     */
    @Override
    public DefaultCountingOutRhymer getHanoiRhymer() {
        return new HanoiRhymer();
    }
}
