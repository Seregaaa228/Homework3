public class DistanceMeter {
    public static void main(String[] args) {
        DistanceMeter distanceMeter = new DistanceMeter(2, 6, 1, 6);
        InnerDistance.getDistance(distanceMeter);
    }

    int x1;
    int x2;
    int y1;
    int y2;

    public DistanceMeter(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;

        System.out.println("Ваши точки");
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        System.out.println("y1 = " + y1);
        System.out.println("y2 = " + y2);
    }

    public static class InnerDistance {
        private static void getDistance(DistanceMeter distanceMeter) {
            double sqrt = Math.sqrt((distanceMeter.y2 - distanceMeter.y1) * (distanceMeter.y2 - distanceMeter.y1) + (distanceMeter.x2 - distanceMeter.x1) * (distanceMeter.x2 - distanceMeter.x1));
            System.out.println("Расстояние между точкамим = " + sqrt);
        }
    }

}

