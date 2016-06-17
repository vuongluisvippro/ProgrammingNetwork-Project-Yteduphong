package utils;

/**
 * Định nghĩa một đối tượng mang theo các lỗi và thiết lập các lỗi đó
 * @author vuongluis
 *
 */
@SuppressWarnings("all")
public class MessageBudle {

	/**
	 * Create field catch error
	 * @param parameter
	 */
	// About name
	public boolean validateName(String ten) {
		boolean result = false;
		if(ten.matches("\\|\\.|\\[|\\{|\\(|\\*|\\+|\\?|\\^|\\$|\\|\\&")){
			result = true;
		}
		return result;
	}
	public boolean validateSoMui(String soMui){
		boolean result = false;
		if(Integer.parseInt(soMui)<0){
			result = true;
		}
		return result;
	}
	public boolean validateGiaVacxin(String giaVacxin){
		boolean result = false;
		if(Integer.parseInt(giaVacxin) < 0 || Integer.parseInt(giaVacxin) > 1000000000){
			result = true;
		}
		return result;
	}
}
