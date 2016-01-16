package com.algaworks.cobranca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.algaworks.cobranca.model.Titulo;
import com.algaworks.cobranca.repository.Titulos;

@Controller
@RequestMapping("/titulos")
public class TituloController {
	
	@Autowired
	private Titulos titulos;
	
	@RequestMapping("/novo")
	public String novo(){
		return "CadastroTitulo";
	}
	
	@RequestMapping(method = RequestMethod.POST )
	public ModelAndView salvar(Titulo titulo){
		//TODO: Salvar no banco de dados. 
		
//		System.out.println(">>>" + titulo.getDescricao());
//		System.out.println(">>>" +titulo.getDataVencimento());
//		System.out.println(">>>" + titulo.getValor());
//		System.out.println(">>>" + titulo.getStatus());
//		
		titulos.save(titulo);
		
		ModelAndView mv = new ModelAndView("CadastroTitulo");
		mv.addObject("mensagem", "Titulo Salvo com sucesso!");
		return mv; 
	}

}
