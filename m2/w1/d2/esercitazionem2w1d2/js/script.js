
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






