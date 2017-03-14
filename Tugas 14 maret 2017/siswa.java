class siswa{
Public String nama;
Public String jenkel;

siswa(){ 
nama = "sunardi; 
jenkel = "laki-laki"; 

public void PrintData()
{

System.out.println(“Nama : “+this.nama);

System.out.println(“Jenis Kelamin : “+this.jenkel);
}
}


public class Main
{
public static void main(String[] args)
{
siswa sws = new siswa();
sws.PrintData(); 
}
}