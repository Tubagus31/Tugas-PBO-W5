//Tubagus Aji Prasetia Iskandar [211511061]

package Kasus_1;

public class RestaurantMain {
	public static void main(String[] args) {
		Restaurant menu = new Restaurant();
		menu.tambahMenuMakanan("Bala-Bala", 1_000, 12);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Gehu", 1_000, 15);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Molen", 1_000, 10);
		
		menu.tampilMenuMakanan();
	}
}
