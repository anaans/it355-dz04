package com.metropolitan.it355.controller;

import com.metropolitan.it355.dao.KnjigaDao;
import com.metropolitan.it355.model.Knjiga;
import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class KnjigaController {
@Autowired 
private MessageSource messageSource;
@Autowired 
private KnjigaDao knjigaDao;
// GET method 
@RequestMapping(value = "/knjiga", method = RequestMethod.GET) 
public ModelAndView knjiga() {
System.out.println("Calling MessageSource");
System.out.println(messageSource.getMessage("naziv", null, new Locale("sr-Latn-RS"))); 
System.out.println("Calling knjigaDao");
knjigaDao.addKnjiga(); 
knjigaDao.addKnjigaAround("Illegal argument"); 
try { 
knjigaDao.addKnjigaThrowException(); 
} catch (Exception e) { 
e.printStackTrace(); 
}
return new ModelAndView("knjiga", "command", new Knjiga());
}
// POST method 
@RequestMapping(value = "/addKnjiga", method = RequestMethod.POST) 
public String addKnjiga(@ModelAttribute Knjiga knjiga, ModelMap model) { 
model.addAttribute("naziv", knjiga.getNaziv()); 
model.addAttribute("pisac", knjiga.getPisac()); 
model.addAttribute("godina", knjiga.getGodina()); 

return "viewKnjiga"; }
}
