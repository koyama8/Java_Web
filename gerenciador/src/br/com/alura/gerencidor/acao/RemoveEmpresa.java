package br.com.alura.gerencidor.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;

public class RemoveEmpresa implements Acao{

	public String  executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("acao Removendo empresa");

		String paramID = request.getParameter("id");
        Integer id = Integer.valueOf(paramID);
        
        System.out.println(id);
        
        Banco banco = new Banco();
        banco.removeEmpresa(id);
        
        return "redirect:entrada?acao=ListaEmpresas";
	}
}
