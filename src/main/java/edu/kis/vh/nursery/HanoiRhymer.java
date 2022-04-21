package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {
    // Poczatkowa wartosc pusta nie ma podstawy  byc zmieniana w przyszlosci
    // wiec wyprowadzanie stalej nie ma sensu
    int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
		//Wiersze znajdujace sie powyzej (if-else) byly niepoprawnie sformatowane.
    }
}
//Alt + right/left arrow <=> zmiana aktualnie otwartej karty w IDE w odpowiednio
//prawo lub w lewo.
