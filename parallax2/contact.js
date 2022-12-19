const name =document.getElementById('name');
const email =document.getElementById('email');
const phone =document.getElementById('phone');
const message =document.getElementById('message');
const submit =document.getElementByClassName('form-contact')[0];

submit.addEventListener('submit',(e)=>{
	e.preventDefault();
	console.log("clicked");
	Email.send({
    SecureToken : "606d64ef-7f9c-4d9b-90eb-c99c26718149",
    To : 'sakshipimpale33@gmail.com',
    From : "sakshipimpale33@gmail.com",
    Subject : " subject",
    Body : "body"
}).then(
  message => alert(message)
);
});