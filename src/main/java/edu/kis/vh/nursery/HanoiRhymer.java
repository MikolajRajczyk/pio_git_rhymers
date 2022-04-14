package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

    int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

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
