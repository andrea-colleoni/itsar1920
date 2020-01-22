/* accedere al DOM 
window.document;
document;
this.document;
*/

console.log(document);
$('#btn').click(function() {
    $('#par1').text($('#txtTesto').val());
});

$('#occhio').click(function() {
    $('#pwd').attr('type', 'text')
    setTimeout(function() {
        $('#pwd').attr('type', 'password')
    }, 2000);
});