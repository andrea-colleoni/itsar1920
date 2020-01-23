$(() => {
    $('#btnLogin').click(() => {
        $.ajax({
            url: '/login',
            method: 'post',
            data: { 
                username: $('#inputUsername').val(), 
                password: $('#inputPassword').val()
            }
        })
        .done((utente) => {
            if (utente) {
                localStorage.setItem('user', JSON.stringify(utente));
                location.href = './home.html';
            } else {
                localStorage.removeItem('user');
            }
        })
    });
});