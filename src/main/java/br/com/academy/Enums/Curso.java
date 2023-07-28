package br.com.academy.Enums;

public enum Curso {
    ADMINISTRACAO("Administração"),
    INFORMATICA("Informática"),
    CONTABILIDADE("Contabilidade"),
    PROGRAMACAO("Programação"),
    ENFERMAGEM("Enfermagem"),
    MARKETING("Marketing"),
    DESIGN("Design"),
    PSICOLOGIA("Psicologia"),
    ARQUITETURA("Arquitetura"),
    ENGENHARIA_CIVIL("Engenharia Civil"),
    DIREITO("Direito"),
    COMUNICACAO_SOCIAL("Comunicação Social"),
    GASTRONOMIA("Gastronomia"),
    FISIOTERAPIA("Fisioterapia"),
    MEDICINA("Medicina"),
    ODONTOLOGIA("Odontologia"),
    VETERINARIA("Medicina Veterinária"),
    PEDAGOGIA("Pedagogia"),
    FARMACIA("Farmácia"),
    BIOLOGIA("Biologia"),
    FISICA("Física"),
    MATEMATICA("Matemática"),
    QUIMICA("Química"),
    HISTORIA("História"),
    GEOGRAFIA("Geografia"),
    FILOSOFIA("Filosofia"),
    SOCIOLOGIA("Sociologia"),
    LETRAS("Letras"),
    CIENCIAS_COMPUTACAO("Ciências da Computação"),
    ENGENHARIA_ELETRICA("Engenharia Elétrica"),
    ENGENHARIA_MECANICA("Engenharia Mecânica"),
    ENGENHARIA_QUIMICA("Engenharia Química"),
    CIENCIAS_AMBIENTAIS("Ciências Ambientais"),
    NUTRICAO("Nutrição"),
    ADMINISTRACAO_PUBLICA("Administração Pública"),
    ECONOMIA("Economia"),
    CIENCIAS_CONTABEIS("Ciências Contábeis"),
    ENGENHARIA_AGRONOMICA("Engenharia Agronômica"),
    EDUCACAO_FISICA("Educação Física"),
    CIENCIAS_SOCIAIS("Ciências Sociais"),
    SERVICO_SOCIAL("Serviço Social"),
    ENGENHARIA_AMBIENTAL("Engenharia Ambiental"),
    JORNALISMO("Jornalismo"),
    PUBLICIDADE_PROPAGANDA("Publicidade e Propaganda"),
    DESIGN_GRAFICO("Design Gráfico"),
    CIENCIAS_ECONOMICAS("Ciências Econômicas"),
    ARTES_CENICAS("Artes Cênicas");

    private String curso;

    private Curso(String curso) {
        this.curso = curso;
    }
}
