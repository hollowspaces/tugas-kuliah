/**
	Created on Windows 10 Enterprise. Using Dev C++ 5.11
	Program untuk mencetak nama dan NIM,
	banyaknya jumlah cetak data dapat disesuaikan dengan keinginan user.
**/

#include <iostream>
using namespace std;

int main(){
    char pilihan;
    int counter, n;
    string nama, nim;
    
    counter = 0; // inisialisasi awal, counter diisi nilai nol
	
	// Input nama dan nim yang akan dicetak
	cout << "=============Cetak Nama=============\n";
	cout << "Input nama: "; getline(cin, nama);
	cout << "Input NIM: "; getline(cin, nim);	
	
	// Input banyaknya nama dan nim yang akan dicetak
	cout << "Jumlah data yang akan dicetak: ";
	cin >> n;
    
    // Outer loop menggunakan do..while, untuk melakukan ulang pencetakan atau tidak
	do {
		cout<<"\n=============Hasil Cetak============\n";
		
		// Inner loop menggunakan for, untuk mencetak banyaknya nama dan nim
    	for (int i=0; i<n; i++){
    		cout << nama << "  |  " << nim << endl;
		}
		
        cout << "Apakah anda ingin mencetak ulang?\n";
        cout << "Jawab (y/t): "; cin >> pilihan;
        cout << endl;

        counter++; // increment counter
    } while(pilihan == 'y');

    cout << "\n\n----------\n";
    cout << "Anda mencetak " << n << " data sebanyak " << counter << " kali.\n";
    return 0;
}



