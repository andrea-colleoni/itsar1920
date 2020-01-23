$(() => {
    if (localStorage.getItem('user')) {
        var utente = JSON.parse(localStorage.getItem('user'));
        $('#nomeUtente').text(`${utente.nome} ${utente.cognome}`);
    } else {
        location.href = './login.html';
    }
});