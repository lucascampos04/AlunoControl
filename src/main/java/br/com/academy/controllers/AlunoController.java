package br.com.academy.controllers;

import br.com.academy.model.Aluno;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlunoController {

    @GetMapping("/inserindoAlunos")
    public ModelAndView inserindoAluno(Aluno aluno){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("inserindoAlunos/inserindoAlunos");
        return mv;
    }

    @PostMapping("InsertAlunos")
    public ModelAndView inserirAluno(Aluno aluno){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("redirect:/Aluno/lisAlunos");
        return mv;
    }
}
