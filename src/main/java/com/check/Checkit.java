package com.check;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Checkit {
	@GetMapping("/getCheckit")
	public String getCheckit() {
		return "Checked";
	}

}
