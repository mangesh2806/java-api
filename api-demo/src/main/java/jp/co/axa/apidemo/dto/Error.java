package jp.co.axa.apidemo.dto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Error {

	public Error(int status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
	private int status;
	private String message;
	
}
