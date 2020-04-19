package LatihanOOP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		byte pilih, hapus, ubah;
		String nama, alamat, job, nik;
		List<Map<String, String>> karyawan = new ArrayList<Map<String,String>>();
		
		do{
			System.out.println();
			System.out.println("=========Employee Database=======");
			System.out.println("1. Input Data Karyawan");
			System.out.println("2. Hapus Data Karyawan");
			System.out.println("3. Ubah Data karyawan");
			System.out.println("4. Tampilkan Data Karyawan");
			System.out.println("5. selesai");
			System.out.println("=================================");
			
			System.out.print("pilih : "); 
			pilih = input.nextByte();	
			
			
			switch (pilih){

//Input data karyawan=================================================================
			case 1:
				Map<String, String> data_karyawan = new HashMap<String, String>();
				System.out.println();
				System.out.println("Tambahkan data karyawan : ");
				System.out.print("Nama : ");
					nama = input.next();
				System.out.print("NIK : ");
					nik = input.next();
				System.out.print("Alamat : ");
					alamat = input.next();
				System.out.print("Job :");
					job = input.next();
				
				data_karyawan.put("Nama", nama);
				data_karyawan.put("NIK", nik);
				data_karyawan.put("Alamat", alamat);
				data_karyawan.put("Job", job);
				karyawan.add(data_karyawan);
				
				break;
				
//Hapus data karyawan===================================================================
			case 2:
				if(karyawan.size()==0){
					System.out.println("Data Karyawan tidak tersedia");
					System.out.println("silakan input data karyawan");
				}else if (karyawan.size() ==1 ){
					karyawan.remove(0);
					System.out.println("Data karyawan telah terhapus");
				}else {
					System.out.println("pilih data karyawan yang akan dihapus");
					System.out.print("karyawan ke-"); hapus = input.nextByte();
					karyawan.remove(hapus -1 );
					System.out.println("data karyawan ke-" + hapus+" telah terhapus");
					
				} break;

//Ubah data karyawan======================================================================
			case 3:
				Map<String, String> data_baru  = new HashMap<String, String>();
				if (karyawan.size() == 0){
					System.out.println("data karyawan tidak tersedia");
					System.out.println("silakan input data karyawan");
				}
				else {
					System.out.println("pilih data karyawan yang akan diubah");
					System.out.print("karyawan ke-"); ubah =input.nextByte();
					System.out.println();
					System.out.print("Nama   : ");
						nama = input.next();
					System.out.print("NIK    : ");
						nik = input.next();
					System.out.print("Alamat : ");
						alamat = input.next();
					System.out.print("Job    :");
						job = input.next();
					
					data_baru.put("Nama", nama);
					data_baru.put("NIK", nik);
					data_baru.put("Alamat", alamat);
					data_baru.put("Job", job);
					karyawan.set(ubah-1, data_baru);
					
					System.out.println("data karyawan ke-" + ubah + "berhasil di ubah");					
				}
				break;
				
//tampilkan data karyawan===============================================================					
			case 4:
				for(int i = 0; i< karyawan.size(); i++){
					System.out.println();
					System.out.println("Karyawan Ke-"+(i+1));
					System.out.println("Nama   : "+karyawan.get(i).get("Nama"));
					System.out.println("NIK    : "+karyawan.get(i).get("NIK"));
					System.out.println("Alamat : "+karyawan.get(i).get("Alamat"));
					System.out.println("JOB    : "+karyawan.get(i).get("Job"));
				
				}break;
				
			case 5:
				input.close();
				System.out.println("Terima kasih telah menggunakan program ini");
			
			}
		

		}while (pilih ==5 || pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 );
		System.out.println("input tidak tersedia silakan ulangi program");
	}

}

