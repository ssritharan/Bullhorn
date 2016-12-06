 function verifyPassword() {
   var password = $('#password').val();
     if (password.length > 15)
       {
           alert('That password is too long.');
        }
 }