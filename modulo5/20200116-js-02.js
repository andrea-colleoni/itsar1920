var persona = {
    nome: 'Andrea',
    cognome: 'Colleoni',
    // nell'oggetto posso definire altri oggetti
    indirizzo: {
        via: 'via Roma',
        civico: 1,
        cap: '00100'
    },
    // nell'oggetto posso definire una collezione
    numeriTelefonici: [
        '3456789',
        '34567890',
        '09876543'
    ],
    // nell'oggetto posso definire una funzione
    nomeCompleto: function() {
        return `${this.nome} ${this.cognome}`;
    }
};

// questo copia una funzione
var ciccio = persona.nomeCompleto;

console.log(persona);

function funz1() {
    console.log('nella funz 1');
    return 'ok';
}

function funz2(pippo) {
    console.log('nella funz 2');
    console.log('valore di pippo', pippo);
    pippo();
}