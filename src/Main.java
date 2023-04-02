public class Main {
    public static void main(String[] args) {

        int price = 136765; // стоимость билета, руб
        int limit = 17; // за каждые потраченные рубли на билет, руб
        int miles = 2; // количество начисленных миль
        int bonus = price * miles / limit;

        System.out.println("За покупку данного билета Вам начислено: " + bonus);

    }
}

