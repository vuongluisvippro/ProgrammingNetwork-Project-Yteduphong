package model.bo;

import java.util.ArrayList;

import model.bean.Objectx;
import model.dao.ObjectxDAO;

@SuppressWarnings("all")
public class ObjectxBO {

	public ArrayList<Objectx> getItems(String maKH) {
		return new ObjectxDAO().getItems(maKH);
	}
}
