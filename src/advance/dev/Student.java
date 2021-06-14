package advance.dev;

public class Student implements Cloneable {
	 String name;
	 int tuoi;
	 String diaChi;
	 String soDienThoai;
	 float diemTrungBinh;
	public Student(String name, int tuoi, String diaChi, String soDienThoai, float diemTrungBinh) {
		super();
		this.name = name;
		this.tuoi = tuoi;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
		this.diemTrungBinh = diemTrungBinh;
	}
	 
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}