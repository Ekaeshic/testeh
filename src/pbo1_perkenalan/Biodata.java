package pbo1_perkenalan;

import java.util.Arrays;
import java.util.Scanner;


public class Biodata {
	String nama;
	String npm;
	String nohp;
	String ttl;
	String kota;
	int tinggi;
	int berat;
	String hobi;
	
	public Biodata() {
		nama="Rifki Riza Alfiansyah";
		npm="19081010105";
		nohp="089687732941";
		ttl="Pasuruan, 12 Agustus 2001";
		kota="Pasuruan";
		tinggi=167;
		berat=52;
		hobi="Menggambar";
	}
	
	public void showBiodata() {
		System.out.println("Nama saya "+this.nama);
		System.out.println("NPM saya "+this.npm);
		System.out.println("Nomor HP saya yaitu "+this.nohp);
		System.out.println("Tempat tanggal lahir saya adalah di "+this.ttl);
		System.out.println("Saat ini saya tinggal di Kota "+this.kota);
		System.out.println("Saya mempunyai tinggi "+this.tinggi+" cm");
		System.out.println("Berat badan saya yaitu "+this.berat+" kg");
		System.out.println("Hobi saya yaitu "+this.hobi);
	}
	
}