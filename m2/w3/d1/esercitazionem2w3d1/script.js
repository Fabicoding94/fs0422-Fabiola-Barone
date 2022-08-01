let bottone = document.querySelector('#bottone');

class User{
    constructor(nome, cognome, nascita){
        this.nome = nome;
        this.cognome = cognome;
        this.nascita = nascita;
    }
    
    
    

}

bottone.addEventListener('click',function(e){
        e.preventDefault();
        let nome = document.querySelector('#nome');
        let cognome = document.querySelector('#cognome');
        let nascita = document.querySelector('#nascita');
        let utente = new User(nome.value, cognome.value, nascita.value);
        let tabella = document.querySelector('#tabella');
        let riga = document.createElement('tr');
        let colonnaNome = document.createElement('td');
        let colonnaCognome = document.createElement('td');
        let colonnaNascita = document.createElement('td');
        colonnaNome.innerHtml = utente.nome;
        colonnaCognome.innerHtml = utente.cognome;
        colonnaNascita.innerHTML = utente.nascita;
        tabella.append(riga);
        riga.append(colonnaNome, colonnaCognome, colonnaNascita);
        nome.value = '';
        cognome.value = '';
        nascita.value = '';    
} )

 
