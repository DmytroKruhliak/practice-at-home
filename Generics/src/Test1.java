
public class Test1 {
    public static void main(String[] args) {
        Account<String,Integer> account1;
        account1 = new Account<String,Integer>("DmytroKruhliak", 3000);

        Account2<String> account2 = new Account2<String>("OlgaKruhliak", 3000);
        String showId = account1.getId();
        System.out.println(showId);
        showId = account2.getId();
        System.out.println(showId);
        System.out.println(account2.getSum());


    }


    static class Account<T,E> {
        private T id;
        private int sum;

        public Account(T id, int sum) {
            this.id = id;
            this.sum = sum;
        }


        public T getId() {
            return this.id;
        }

        public int getSum() {
            return this.sum;
        }

        public void setSum(int sum) {
            this.sum = sum;
        }
    }
    static class Account2<T> {
        T id;
        int sum;


        public Account2(T id, int sum) {
            this.id = id;
            this.sum = sum;
        }

        public T getId() {
            return id;
        }

        public int getSum() {
            return sum;
        }
    }
}
