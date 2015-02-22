$('#edit').on('show.bs.modal', function(e) {

    //get data-id attribute of the clicked element
    var eventId = $(e.relatedTarget).data('event-id');

    window.alert(eventId.value);
    //populate the textbox
    $(e.currentTarget).find('input[name="eid"]').val(eventId);
});