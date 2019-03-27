package exampleWithWatches;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        WatchMaker maker = new RomeWatchMaker();
        Watch handWatch = maker.createWatch();
        handWatch.showTime();
    }
}

interface Watch {
    void showTime();
}

class DigitalWatch implements Watch {
    public void showTime() {
        System.out.println(new Date());
    }
}

class RomeWatch implements Watch {

    @Override
    public void showTime() {
        System.out.println("VII-XX");
    }
}

interface WatchMaker {
    Watch createWatch();
}

class DigitalWatchMAker implements WatchMaker {
    public Watch createWatch() {
        return new DigitalWatch();
    }
}

class RomeWatchMaker implements WatchMaker {

    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}

