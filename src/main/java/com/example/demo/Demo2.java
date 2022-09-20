package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo2 {
@RequestMapping(value="/info")
	public String show(@RequestParam(value="name") String a,@RequestParam(value="pass") String b) {
	if(a.equals("saiprasath")&& b.equals("123@")) {
		return "valid user";}
	else {return "non valid user";}
	
	}
@RequestMapping(value="/info/info1")
public String show1() {
	return "Hello";

}
@RequestMapping(value="/info/info1/info2")
public int show2() {
	return 5+2;

}
@RequestMapping(value="/info/info1/info2/show/{a}/{b}/{c}")
public int show2(@PathVariable int a,@PathVariable int b,@PathVariable int c) {
	return a*b*c;

}
@GetMapping(value="/show")
public Marker show(@RequestBody Marker m) {
	return m;
}
@GetMapping(value="/show1")
public List<Marker> show(@RequestBody List<Marker> m) {
	return m;
}


}
