$(() => {
    $.ajax({
        url: '/parts/header.html',
        method: 'get'
    })
    .done((html) => {
        $('header').html(html);
        if (localStorage.getItem('user')) {
            $('#mnuLogin').hide();
            $('#mnuLogout').show();
            $('#mnuLogout').click(() => {
                localStorage.removeItem('user');
                location.href = '/';
            });
        } else {
            $('#mnuLogin').show();
            $('#mnuLogout').hide();
        }
    });
});