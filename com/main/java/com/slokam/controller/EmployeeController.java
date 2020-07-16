/*package com.slokam.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.slokam.constants.CommonConstants;
import com.slokam.exceprionhandling.CANullpointerException;
//import com.slokam.dao.EmployeeDao;
import com.slokam.model.Employee;
import com.slokam.service.EmployeeService;
//import com.slokam.service.EmployeeService;

@RestController
@RequestMapping("test")
public class EmployeeController {

	@Autowired
	private EmployeeService empservice;

	@RequestMapping(value = "/test")
	public Employee test() {
		Employee employee = null;
		try {

			employee.getName();
			int a = 10;
			int b = 0;
			int c = a / b;

			System.out.println("ArithmeticException");

		} catch (NullPointerException ne) {

			CANullpointerException caNullpointerException = new CANullpointerException(CommonConstants.ERROR_IN_INPUT);
			caNullpointerException.printStackTrace();

		} catch (ArithmeticException e) {

			CANullpointerException caNullpointerException = new CANullpointerException(CommonConstants.ERROR_IN_DATA);
			caNullpointerException.printStackTrace();

		}
		return employee;

	}

	@RequestMapping(value = "/emplist", method = RequestMethod.GET)
	public List<Employee> getall() {

		List<Employee> list = empservice.getAll();
		return list;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/empsave")
	public Employee save(Employee employee) {

		Employee emp = empservice.save(employee);

		return emp;

	}

	@RequestMapping(method = RequestMethod.PUT, value = "/empupdate")
	public Employee update(Employee employee) {

		Employee emp = empservice.update(employee);

		return emp;

	}

	@RequestMapping(method = RequestMethod.GET, value = "getdata/{id}")
	public Employee getStudentById(@PathVariable("id") Integer id) {

		Employee emp = empservice.getStudentById(id);

		return emp;
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/empdelete")
	public void delete(@RequestBody Employee employee) {

		empservice.delete(employee);

	}

	@RequestMapping(method = RequestMethod.GET, value = "/getall")
	public List<Employee> getAll(HttpSession session) {

		List<Employee> all = empservice.getAll();

		session.setAttribute("page", 1);

		List<Employee> subList = all.subList(0, 3);

		System.out.println("all data" + subList);

		return subList;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/nextpage")
	public void nextPage(HttpSession session) {
		List<Employee> all = empservice.getAll();

		List<Employee> subList = all.subList(0, 3);

		session.setAttribute("page", 1);

		Integer page = (Integer) session.getAttribute("page");// first page

		page++;
		int start = (page - 1) * 3;
		int end = page * 3;

		ModelAndView mv = new ModelAndView();

		ModelAndView addObject = mv.addObject("subList", subList);

		System.out.println("addObject::" + addObject);

		List<Employee> students = (List<Employee>) session.getAttribute("addObject");

		List<Employee> subList2 = students.subList(start, end);

		System.out.println("subList2::" + subList2);
		// return null;

	}

	@RequestMapping(method = RequestMethod.GET, value = "/nextpages")
	public Page<Employee> list(Pageable pagable) {
		
		Page<Employee> listAllByPage = empservice.listAllByPage(pagable);
		return listAllByPage;

	}

}
*/