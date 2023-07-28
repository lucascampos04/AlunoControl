function GerarMatricula(){
    let txt = "ACA";
    let aleatorio = Math.floor(Math.random() * 2000);
    document.getElementById('matricula').value = (txt + aleatorio);
}