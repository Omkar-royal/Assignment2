const form = document.getElementById('surveyForm');

form.addEventListener('submit', function (e) {
    e.preventDefault();

    // Get form values
    const firstName = form.firstName.value;
    const lastName = form.lastName.value;
    const dob = form.dob.value;
    const country = form.country.value;
    const gender = Array.from(form.gender).filter(cb => cb.checked).map(cb => cb.value).join(', ');
    const profession = form.profession.value;
    const email = form.email.value;
    const mobile = form.mobile.value;

    // Display the values in a popup
    const popupMessage = `
        First Name: ${firstName}
        Last Name: ${lastName}
        Date of Birth: ${dob}
        Country: ${country}
        Gender: ${gender}
        Profession: ${profession}
        Email: ${email}
        Mobile Number: ${mobile}
    `;

    alert(popupMessage);

    // Reset the form
    form.reset();
});