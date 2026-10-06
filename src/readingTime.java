public class readingTime{
    public static int calculateReadingTime(int pages) {
        int readingTime = pages * 2;

        if (pages > 500) {
            readingTime = readingTime + readingTime / 10;
        }

        return readingTime;
    }

    public static void main(String[] args) {
        System.out.println("100 pages -> " + calculateReadingTime(100) + " min");
        System.out.println("500 pages -> " + calculateReadingTime(500) + " min");
        System.out.println("800 pages -> " + calculateReadingTime(800) + " min");
    }
}