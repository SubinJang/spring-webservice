var main = {
    init : function() {
        $('#btn-save').on('click', () => this.save() );
    },
    save : function() {
        const data = {
            title: $('#title').val(),
            author: $('#author').val(),
            content: $('#content').val()
        };

        $('#title, #author, #content').siblings('.error-message').remove(); // 하드코딩

        $.ajax({
            type: 'POST',
            url: '/posts',
            dataType: 'json',
            contentType:'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done( (response) => {
            alert('글이 등록되었습니다.');
            location.reload();
        }).fail( (response) => this.markingErrorField(response));
    },

    markingErrorField : function(response) {
        const errorFields = response.responseJSON.errors;

        if (!errorFields) {
            alert(response.response.message);
            return;
        }
        
        $.each(errorFields, (idx) => {
            const error = errorFields[idx];
            const $field = $("#" + error["field"]);

            if ($field && $field.length > 0) {
                $field.siblings('.error-message').remove();
                $field.after('<span class="error-message taxt-small text-danger">'+error.defaultMessage+'</span>');
            }
        });
    }

};

main.init();