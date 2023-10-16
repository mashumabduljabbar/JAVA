class Menu {
    String name;
    int price;
    String category;

    public Menu(String name, int price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
}

public class Main {
    static Menu[] menus = {
        new Menu("Nasi Goreng", 15000, "makanan"),
        new Menu("Mie Goreng", 12000, "makanan"),
        new Menu("Sate Ayam", 20000, "makanan"),
        new Menu("Ayam Goreng", 18000, "makanan"),
        new Menu("Es Teh", 5000, "minuman"),
        new Menu("Es Jeruk", 6000, "minuman"),
        new Menu("Jus Alpukat", 12000, "minuman"),
        new Menu("Kopi", 8000, "minuman")
    };

    static double tax = 0.1;
    static int serviceCharge = 20000;

    public static void displayMenu() {
        System.out.println("Daftar Menu Makanan:");
        for (Menu menu : menus) {
            if (menu.category.equals("makanan")) {
                System.out.println(menu.name + " - " + menu.price);
            }
        }

        System.out.println("\nDaftar Menu Minuman:");
        for (Menu menu : menus) {
            if (menu.category.equals("minuman")) {
                System.out.println(menu.name + " - " + menu.price);
            }
        }
    }

    public static double calculateTotal(int[] quantities) {
        double total = 0;
        for (int i = 0; i < quantities.length; i++) {
            total += menus[i].price * quantities[i];
        }
        double totalWithTax = total * (1 + tax);
        if (total > 100000) {
            totalWithTax *= 0.9;
        }
        if (total > 50000) {
            for (int i = 0; i < quantities.length; i++) {
                if (menus[i].category.equals("minuman")) {
                    quantities[i] *= 2;
                }
            }
        }
        return totalWithTax;
    }

    public static void printBill(int[] quantities, double total) {
        System.out.println("Struk Pembayaran:");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] != 0) {
                System.out.println(menus[i].name + " - " + menus[i].price + " - " + quantities[i] + " - " + menus[i].price * quantities[i]);
            }
        }
        System.out.println("Total Biaya: " + total);
        System.out.println("Pajak (10%): " + (total - total / (1 + tax)));
        System.out.println("Biaya Pelayanan: " + serviceCharge);
    }

    public static void main(String[] args) {
        displayMenu();
        int[] quantities = {0, 0, 0, 0, 0, 0, 0, 0}; // indexes represent the menu items
        quantities[0] = 2; // for example, 2 portions of the first item
        double total = calculateTotal(quantities);
        printBill(quantities, total);
    }
}
