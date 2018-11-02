package fasttrackse.ffse1702a.fbms.QuanLyNhanSu.service;

import java.util.List;

import fasttrackse.ffse1702a.fbms.QuanLyNhanSu.model.entity.ChucDanh;

public interface QuanLyChucDanhService {
	public List<ChucDanh> listChucDanh();

	public void addChucDanh(ChucDanh p);

	public void updateChucDanh(ChucDanh p);

	public ChucDanh getChucDanhByMa(String maChucDanh);
	
	public void removeChucDanh(String maChucDanh);
	
	public boolean checkChucDanh(String maChucDanh) ;
}
