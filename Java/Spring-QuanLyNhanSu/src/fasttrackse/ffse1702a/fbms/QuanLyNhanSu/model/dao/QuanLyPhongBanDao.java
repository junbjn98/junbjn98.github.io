package fasttrackse.ffse1702a.fbms.QuanLyNhanSu.model.dao;

import java.util.List;

import fasttrackse.ffse1702a.fbms.QuanLyNhanSu.model.entity.PhongBan;

public interface QuanLyPhongBanDao {
	public void addPhongBan(PhongBan p);

	public void updatePhongBan(PhongBan p);

	public List<PhongBan> listPhongBan();

	public PhongBan getMaPhongBan(String id);

	public void removePhongBan(String id);

	public boolean checkPhongBan(String maPhongBan);

}
