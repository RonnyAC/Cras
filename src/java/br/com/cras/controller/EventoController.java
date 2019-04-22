/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cras.controller;

import br.com.cras.dao.EventoDAO;
import br.com.cras.dominio.Evento;
import java.sql.SQLException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Ronnie
 */

@Controller //anotação do spring controller

public class EventoController {

@RequestMapping("/acaoCadastrar") //anotação para mapear o método
   

public String iniciando(Model model, Evento evento) {
        EventoDAO dao = new EventoDAO();

        try {

            dao.adiciona(evento);
            model.addAttribute("retorno", evento.getNomeCoordenador());
        } catch (SQLException e) {
            System.out.println(e);

        }catch (Error e) {
            System.out.println(e);

        }
       return "mensagem";
    }

    @RequestMapping("/cadastroevento")
    public String cadastroEvento() {

        return "cadastroevento";
    }

    @RequestMapping("/acaoexibirevento")
    public String listaEventos(Model model) {

        EventoDAO dao = new EventoDAO();

        try {
            model.addAttribute("listaEvento", dao.busca());

        } catch (Exception e) {
            System.out.println(e);
        }

        return "exibirevento";
    }
    
    
     @RequestMapping("/index")
    public String index(Model model) {


        return "index";
    }
}
