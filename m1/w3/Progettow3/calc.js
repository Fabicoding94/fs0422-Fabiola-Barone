

        let calcolo = "2 + 2";
        console.log(calcolo)
        console.log( eval(calcolo) )

        /*
        ottenere totale da un input contenente operazioni matematiche
        */
        function calcola() {
            let display = document.getElementById("display");
            let totale = eval(display.value)
            display.value = totale
        }

        function aggiungiSimbolo(bottone){
            let display = document.getElementById("display");
            let simbolo = bottone.getAttribute('data-simbolo');

            console.log(bottone.innerHTML)
            console.log(bottone.getAttribute('data-simbolo'))

            display.value += bottone.getAttribute('data-simbolo')
        
        }

        function isSymbol(carattere){
            const simboli = ['*','/','+','-'];

            if(simboli.includes(carattere)){
                return true;
            }
            return false;

        }

        function reset() {
            let display = document.getElementById("display");
            let totale = null
            display.value = totale
        }

        function back() {
            display.value = display.value.slice(0, -1)
        }



       


      
        console.log(isSymbol('*'))
        console.log(isSymbol(6))
 

  