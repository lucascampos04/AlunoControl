package br.com.academy.controllers;

import br.com.academy.model.Aluno;
import br.com.academy.dao.AlunoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlunoController {

    @Autowired
    private  AlunoDao alunorepositorio;

    @GetMapping("/inserindoAlunos")
    public ModelAndView inserindoAluno(Aluno aluno){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("inserindoAlunos/inserindoAlunos");
        return mv;
    }

    @PostMapping("InsertAlunos")
    public ModelAndView inserirAluno(Aluno aluno){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("redirect:/alunosadicionados");
        alunorepositorio.save(aluno);
        return mv;
    }

    @GetMapping("/alunosadicionados")
    public ModelAndView ListAlunos(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("ListAlunos/listAluno");
        mv.addObject("alunosList", alunorepositorio.findAll());
        return mv;
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") Integer id){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("alterarAluno/alterar");
        Aluno aluno = alunorepositorio.getOne(String.valueOf(id));
        mv.addObject("aluno", aluno);
        return mv;
    }

    @PostMapping("/alterar")
    public ModelAndView alterar(Aluno aluno){
        ModelAndView mv = new ModelAndView();
        alunorepositorio.save(aluno);
        mv.setViewName("redirect:/alunosadicionados");
        return mv;
    }

    @GetMapping("/excluir/{id}")
    public String excluirAluno(@PathVariable("id") Integer id){
        alunorepositorio.deleteById(String.valueOf(id));
        return "redirect:/alunosadicionados";
    }














}
