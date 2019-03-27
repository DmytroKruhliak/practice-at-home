//public class TestForMain {
//    public static void main(String[] args) {
//        WatchMaker watch1 = new HandWatchMaker();
//        watch1.createWatch();
//        WatchMaker[] watches = new WatchMaker[3];
//        WatchMaker watches1 = new DigitalWatchMAker();
//        WatchMaker watches2 = new RomeWatchMaker();
//        WatchMaker watches3 = new HandWatchMaker();
//        int j = 0;
//        for (int i = 0; i < watches.length; i++) {
//            if (i == j) {
//                watches[i] = watches1;
//                j++;
//                i++;
//            }
//            if (i == j) {
//                j++;
//                watches[i] = watches2;
//                i++;
//            }
//            watches[i] = watches3;
//
//        }
//        for (WatchMaker t :
//                watches) {
//            t.createWatch().showTime();
//        }
//    }
//}
