//Tubagus Aji Prasetia Iskandar [211511061]

package Kasus_2;

import Kasus_2.Restaurant;

public class RestaurantMain {
	public static void main(String[] args) {
		Restaurant menu = new Restaurant();
		menu.tambahMenuMakanan("Batagor ", 5_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Roti Bakar", 12_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Indomie+Telor", 10_000, 30);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Kwetiaw ", 12_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Nasi Goreng", 12_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Teh Manis", 4_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Air MIneral", 3_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Jus Alpukat", 4_000, 20); 
        Restaurant.nextId();
        menu.tambahMenuMakanan("Teh Botol", 5_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Kopi    ", 1_000, 20);
		
		menu.tampilMenuMakanan();
	}
}
