package facade_singleton;

import facade_singleton.classes.HomeTheaterFacade;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {

        HomeTheaterFacade.getInstance().watchMovie();
        HomeTheaterFacade.getInstance().endMovie();

    }
}
