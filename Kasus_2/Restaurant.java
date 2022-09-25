//Tubagus Aji Prasetia Iskandar [211511061]

package Kasus_2;

public class Restaurant {
	private Makanan MenuMakanan;
	private static byte idMenu=0;
			
	public Restaurant() {
		MenuMakanan = new Makanan();
	}
	
	public void tambahMenuMakanan(String nama, double harga, int stok) {
		MenuMakanan.setNama_Makanan(nama, idMenu);
		MenuMakanan.setHarga_Makanan(harga, idMenu);
		MenuMakanan.setStok(stok, idMenu);
	}
	
	public void tampilMenuMakanan() {
        System.out.println("                DAFTAR MENU MAKANAN");
        System.out.println("-----------------------------------------------------");
		for(byte i = 0; i<=idMenu; i++) {
			if(!isOutOfStock(i)) {
				System.out.printf("%d. %-15s ", i+1,MenuMakanan.getNama_Makanan(i));
				System.out.printf("\t[" + MenuMakanan.getStok(i) + "]");
				System.out.println("\t\tRp." + MenuMakanan.getHarga_Makanan(i));
			}
		}
	}
	
	public boolean isOutOfStock(int id) {
		if(MenuMakanan.getStok(id) == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void nextId() {
		idMenu++;
	}
}
