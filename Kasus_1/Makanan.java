//Tubagus Aji Prasetia Iskandar [211511061]

package Kasus_1;

public class Makanan {
	private String[] nama_makanan;
	private double[] harga_makanan;
	private int[] stok;
	
	public Makanan() {
		this.nama_makanan = new String[10];
		this.harga_makanan = new double[10];
		this.stok = new int [10];
	}
	
	public String getNama_Makanan(int id) {
		return nama_makanan[id];
	}
	
	public void setNama_Makanan(String nama_makanan, int id) {
		this.nama_makanan[id] = nama_makanan;
	}
	
	public double getHarga_Makanan(int id) {
		return harga_makanan[id];
	}
	
	public void setHarga_Makanan(double harga_makanan, int id) {
		this.harga_makanan[id]= harga_makanan;
	}
	
	public int getStok(int id) {
		return stok[id];
	}
	
	public void setStok(int stok, int id) {
		this.stok[id] = stok;
	}
}
