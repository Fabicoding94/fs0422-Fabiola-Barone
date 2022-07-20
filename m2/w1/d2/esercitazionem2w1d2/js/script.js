
let buttonBudget = document.querySelector('#nuovoBudget')


buttonBudget.addEventListener('click', inizialeBudget);

function inizialeBudget() {
    let budgetIniziale = document.querySelector('#Budgetiniziale').value;
    let seeBudget = document.querySelector('span');
    seeBudget.innerHTML = budgetIniziale + '€';
}


let buttonUscite = document.querySelector('#usciteBtn')


buttonUscite.addEventListener('click', aggiornaBudget);

function aggiornaBudget() {
    let budgetIniziale = document.querySelector('#Budgetiniziale').value;
    let sottraiSpesa = document.querySelector('#uscite').value;
    let showAttualeBudget = document.querySelector('#budgetattuale');

    showAttualeBudget.innerHTML = budgetIniziale - sottraiSpesa;
}



let budgetIniziale = document.querySelector('#Budgetiniziale').value;
let buttonRandom = document.querySelector('#speseRandom')
buttonRandom.addEventListener('click', wasteBudget);


const lista = document.querySelector('#listarandom')


function wasteBudget(budgetIniziale) {
    let soldiDisponibili = budgetIniziale
    while (soldiDisponibili >= 0) {


        let listItem = document.createElement('li')
        listItem.classList.add('listItemStyle')
        let spesaRandom = Math.floor(Math.random() * budgetIniziale / 10);

        if (soldiDisponibili - spesaRandom > 0) {
            soldiDisponibili = soldiDisponibili - spesaRandom;
            if (soldiDisponibili <= budgetIniziale / 2 && soldiDisponibili > budgetIniziale / 4) {
                listItem.innerHTML = 'Hai speso più di metà Budget! Ti rimangono: ${soldiDisponibili} €';
                lista.append(listItem);
                listItem.classList.add('listItemWarning')
            } else if (soldiDisponibili <= budgetIniziale / 4) {
                listItem.innerHTML = 'Hai speso quasi tutto il Budget! Ti rimangono: ${soldiDisponibili} €';
                lista.append(listItem);
                listItem.classList.add('listItemAlert')
            } else {
                listItem.innerHTML = 'Puoi ancora spendere! Ti rimangono: ${soldiDisponibili} €';
                lista.append(listItem);

            }
        }else{
            listItem.innerHTML = 'Attenzione! Ti rimangono solo : ${soldiDisponibili} € , non puoi spendere ${spesaRandom};
            lista.append(listItem);
            listItem.classList.add('listItemAuguri')
            break;

        }


    }
}


/*

let budget = document.querySelector('#budgetStart'); //input budget
const budgetButton = document.querySelector('#budgetSet');
const lista = document.querySelector('#listaSpese');//lista UL

let manuBdg = document.querySelector('#spesaManuale');//spesa manuale
const manuBgt = document.querySelector('#manualBudget');//budget manuale
const manuBtn = document.querySelector('#spendiManuale');//bottone spesa manuale
let soldiRimasti = document.querySelector('#soldiRimasti');//soldi rimasti



// AUTOMATIC CASH BURNER
budgetButton.addEventListener('click', getBudget);

function getBudget() {

    let schei = budget.value;
    wasteBudget(schei);
}


function wasteBudget(schei) {
    let scheiRimasti = schei;
    while(scheiRimasti >= 0){

        let listItem = document.createElement('li')
        listItem.classList.add('listItemStyle')
        let spesaRandom = Math.floor(Math.random() * schei/10);

        if(scheiRimasti - spesaRandom > 0){
            scheiRimasti = scheiRimasti - spesaRandom;
            if (scheiRimasti <= schei / 2 && scheiRimasti > schei / 4) {
                listItem.innerHTML =`Hai speso piu' di meta' budget! Ti rimangono ${scheiRimasti} soldi`;
                lista.append(listItem);
                listItem.classList.add('listItemWarning')
            } else if (scheiRimasti <= schei / 4) {
                listItem.innerHTML =`Hai speso quasi tutto il budget! Ti rimangono ${scheiRimasti} soldi`;
                lista.append(listItem);
                listItem.classList.add('listItemAlert')
            } else {
                listItem.innerHTML =`Spendi spendiii! Ti rimangono ${scheiRimasti} soldi`;
                lista.append(listItem);    
            } 
        }else{
            listItem.innerHTML =`Stai inguaiato, hai ${scheiRimasti} soldi e volevi spendere ${spesaRandom} soldi`;
            lista.append(listItem);
            listItem.classList.add('listItemAuguri')
            break;
        }
    }
}


//MANUAL CASH BURNER

manuBgt.addEventListener('click', getBudgetManu);
manuBtn.addEventListener('click', spendiConsapevolmente);

function getBudgetManu() {

    soldiRimasti.innerHTML = budget.value;

}

function spendiConsapevolmente(){
    let sordi = soldiRimasti.innerHTML;
    let spesa = manuBdg.value;
    
    //logica 
    
}

*/





