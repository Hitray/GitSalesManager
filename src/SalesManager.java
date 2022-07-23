public class SalesManager {
    protected long[] sales;

<<<<<<< HEAD

    public SalesManager(int[] sales) {
=======
    public SalesManager(long[] sales) {
>>>>>>> longer
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int average() {
        int sum = 0;
        for (int i : sales) {
            sum += i;
        }
        return (sum - this.max() - this.min()) / (sales.length - 2);
    }

    public int min() {
        int min = sales[0];
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }
}