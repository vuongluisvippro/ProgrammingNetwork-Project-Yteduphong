package model.bo;

import java.util.ArrayList;

import model.bean.Vacxin;
import model.dao.VacxinDAO;

@SuppressWarnings("all")
public class VacxinBO {

	public int addVacxin(Vacxin vacxin){
		return new VacxinDAO().addVacxin(vacxin);
	}
	public Vacxin getVacxin(String maVacxin) {
		return new VacxinDAO().getVacxin(maVacxin);
	}
	public ArrayList<Vacxin> getListVX() {
		return new VacxinDAO().getListVX();
	}
	public int editVacxin(Vacxin vacxin) {
		return new VacxinDAO().editVacxin(vacxin);
	}	
}
