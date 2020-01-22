$(document).ready( function () {

    $('#btnAjax').click(function() {
        console.log('prima')
        $.ajax({
            url: '/ajax',
            method: 'get'
        })
        .done(function(corsi) {
            console.log('done!!', corsi);
            // $('#par1').html(pippo);
            $('#corsi').empty();
            corsi.forEach(c => {
                $('#corsi').append(`<li>Titolo: ${c.titolo}</li>`)
            });
            $('#tblCorsi').DataTable({
                data: corsi,
                columns: [
                    { title: 'ID', data: 'id'},
                    { title: 'Titolo', data: 'titolo'},
                    { title: 'Docente', data: 'docente'},
                    { title: 'Durata (ore)', data: 'durataOre'},
                ]
            });
        })
        .fail(function() {
            console.log('fail!!');
        })
        .always(function() {
            console.log('always!!');
        });
        console.log('dopo')
    }); 
});

