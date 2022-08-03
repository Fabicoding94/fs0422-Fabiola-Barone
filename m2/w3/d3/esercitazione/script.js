let generaFilm = localStorage.getItem('film') ? JSON.parse(localStorage.getItem('film')) : [];


let target = document.querySelector('#film')

        fetch('elencofilm.json')
        .then(res => res.json())
        .then(elencofilm => {console.log(elencofilm)})

        let filmJson = JSON.stringify(generaFilm);//trasformo l'oggetto in stringa json
    localStorage.setItem('film', filmJson)//salvo l'oggetto

    //svuoto i campi
    document.querySelector('#filmJason').reset()//resetto tutti i campi del form


        
let generaLibri = localStorage.getItem('libri') ? JSON.parse(localStorage.getItem('libri')) : [];


let obiettivo = document.querySelector('#libri')

        fetch('elencolibri.json')
        .then(res => res.json())
        .then(elencolibri => {console.log(elencolibri)});

        
        let libriJson = JSON.stringify(generaLibri);//trasformo l'oggetto in stringa json
    localStorage.setItem('libri', libriJson)//salvo l'oggetto

    // //svuoto i campi
    // document.querySelector('#libriJason').reset()//resetto tutti i campi del form



        
let generaUtenti = localStorage.getItem('utenti') ? JSON.parse(localStorage.getItem('utenti')) : [];


let riferimento = document.querySelector('#utenti')

        fetch('elencoutenti.json')
        .then(res => res.json())
        .then(elencoutenti => {console.log(elencoutenti)})

        let utentiJson = JSON.stringify(generaUtenti);//trasformo l'oggetto in stringa json
        localStorage.setItem('utenti', utentiJson)//salvo l'oggetto
    
        //svuoto i campi
        document.querySelector('#utentiJason').reset()//resetto tutti i campi del form