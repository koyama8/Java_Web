package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;
import br.com.alura.gerencidor.acao.Acao;
import br.com.alura.gerencidor.acao.AlteraEmpresa;
import br.com.alura.gerencidor.acao.ListaEmpresas;
import br.com.alura.gerencidor.acao.MostraEmpresa;
import br.com.alura.gerencidor.acao.NovaEmpresa;
import br.com.alura.gerencidor.acao.NovaEmpresaForm;
import br.com.alura.gerencidor.acao.RemoveEmpresa;


//@WebServlet(urlPatterns="/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramAcao = request.getParameter("acao");
         
//		HttpSession sessao = request.getSession();
//		boolean usuarioNaoEstaLogado = (sessao.getAttribute("usuarioLogado") == null);
//		boolean ehUmaAcaoProtegida = !(paramAcao.equals("Login") || paramAcao.contentEquals("LoginForm"));
//		
//		if(ehUmaAcaoProtegida && usuarioNaoEstaLogado) {
//	
//			response.sendRedirect("entrada?acao=LoginForm");
//			return;
//		}
		
		
		
		 
		//paramAcao.executa(req,res);
	
		/**
		
		String nome = null;
		
		if(paramAcao.equals("ListaEmpresas")) {
			ListaEmpresas acao = new ListaEmpresas();
			nome = acao.executa(request,response);			
		} else if(paramAcao.contentEquals("RemoveEmpresa")) {
			RemoveEmpresa acao = new RemoveEmpresa();
			nome= acao.executa(request,response);
			
		} else if(paramAcao.equals("MostraEmpresa")) {
			
			MostraEmpresa acao = new MostraEmpresa();
			nome = acao.executa(request, response);
		}else if(paramAcao.equals("AlteraEmpresa")) {
			
			AlteraEmpresa acao = new AlteraEmpresa();
			nome = acao.executa(request, response);
		}else if(paramAcao.equals("NovaEmpresa")) {			
			NovaEmpresa acao = new NovaEmpresa();
			nome = acao.executa(request, response);
		}else if(paramAcao.equals("NovaEmpresaForm")) {			
			NovaEmpresaForm acao = new NovaEmpresaForm();
			nome = acao.executa(request, response);
		}
		
		 * 
		 */
		
	
	}

}
