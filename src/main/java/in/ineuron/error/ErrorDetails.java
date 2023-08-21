package in.ineuron.error;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class ErrorDetails {
	private LocalDateTime ldt;
	private String errorMsg;
	private String status;
	public LocalDateTime getLdt() {
		return ldt;
	}
	public void setLdt(LocalDateTime ldt) {
		this.ldt = ldt;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public ErrorDetails(LocalDateTime ldt, String errorMsg, String status) {
		super();
		this.ldt = ldt;
		this.errorMsg = errorMsg;
		this.status = status;
	}
	public ErrorDetails() {
		super();
	}
	@Override
	public String toString() {
		return "ErrorDetails [ldt=" + ldt + ", errorMsg=" + errorMsg + ", status=" + status + "]";
	}
	
	
}
