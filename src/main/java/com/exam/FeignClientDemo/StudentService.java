package com.exam.FeignClientDemo;


import com.sun.swing.internal.plaf.metal.resources.metal_zh_HK;
import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author - GreenLearner(https://www.youtube.com/channel/UCaH2MTg94hrJZTolW01a3ZA)
 */

@FeignClient(name = "${service.name}", url = "${service.base.url}")
public interface StudentService {
	
	@GetMapping("/load")
	public List<Student> getAllStudents();
}