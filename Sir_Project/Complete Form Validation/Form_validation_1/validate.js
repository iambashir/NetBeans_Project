const form = document.getElementById('form');
const username = document.getElementById('username');
const email = document.getElementById('email');
const password = document.getElementById('password');
const password2 = document.getElementById('password2');

form.addEventListener('submit', e => {
    e.preventDefault();

    checkInputs();
});

function checkInputs() {
    // trim to remove the whitespaces
    const usernameValue = username.value.trim();
    const emailValue = email.value.trim();
    const passwordValue = password.value.trim();
    const password2Value = password2.value.trim();


            //Name Validation
    if (usernameValue === '' || usernameValue.length < 2 || usernameValue.length >16) {
        setErrorFor(username, 'Enter valid name');
    } else {
        setSuccessFor(username);
    }

            //Email Validation
    if (emailValue === '') {
        setErrorFor(email, 'Enter valid email address');
    } else if (!isEmail(emailValue)) {
        setErrorFor(email, 'Not a valid email address');
    } else {
        setSuccessFor(email);
    }


             //Password Validation
    if (passwordValue === '') {
        setErrorFor(password, 'Password should be 8-16 Character');
    } else {
        setSuccessFor(password);
    }

            //Re-Password Validation
    if (password2Value === '') {
        setErrorFor(password2, 'Password Should be match');
    } else if (passwordValue !== password2Value) {
        setErrorFor(password2, 'Passwords does not match');
    } else {
        setSuccessFor(password2);
    }
}


function setErrorFor(input, message) {
    const formControl = input.parentElement;
    const small = formControl.querySelector('small');
    formControl.className = 'form-control error';
    small.innerText = message;
}

function setSuccessFor(input) {
    const formControl = input.parentElement;
    formControl.className = 'form-control success';
}

function isEmail(email) {
    return /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/.test(email);
}
