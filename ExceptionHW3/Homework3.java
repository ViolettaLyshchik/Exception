package ExceptionHW3;

import ExceptionHW3.src.Presenter.Presenter;
import ExceptionHW3.src.View.ConsoleView;
import ExceptionHW3.src.View.View;

public class Homework3 {
    public static void main(String[] args) {
        Presenter<View> prog = new Presenter<View>(new ConsoleView());
        prog.start();
    }
}
