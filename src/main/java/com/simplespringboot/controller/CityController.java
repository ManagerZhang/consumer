package com.simplespringboot.controller;


import com.dubbo.model.City;
import com.dubbo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangke
 * @date 2018-01-08.
 */
@RestController
public class CityController {
	@Autowired
	private CityService cityService;
	@RequestMapping("/selectCity")
	@ResponseBody
	City city(@RequestParam String cityName){
		City city = cityService.selectCityByName(cityName);

		return city;
	}
}
