package ex01.sample02.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data@Getter@Setter
@AllArgsConstructor
@Builder

public class AddCalc {
	private int num1;
	private int num2;
	private int add_result;
	
	public int result() {
		return num1+num2;
	}

}