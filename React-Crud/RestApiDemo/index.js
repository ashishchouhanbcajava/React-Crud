const AddEmployee = () => {
    alert(
        "hello"
    )
    const data = {
        email: document.getElementsByName("email")[0].value,
        password: document.getElementsByName("password")[0].value,
        name: document.getElementsByName("name")[0].value,
        designation: document.getElementsByName("designation")[0].value,
        department: document.getElementsByName("department")[0].value,
        profilePic: "" // Placeholder for the image
    };

    const fileInput = document.getElementsByName("profilePicture")[0];
    console.log(fileInput);

    if (fileInput.length > 0) {
        const file = fileInput[0];
        const reader = new FileReader();

        reader.onloadend = () => {
            data.profilePic = reader.result.split(",")[1]; // Get the Base64 string without the prefix
            console.log(data.profilePic);

            fetch('http://localhost:8081/api/Add', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(data)
            })
                .then(response => response.json())
                .then(responseData => {
                    console.log(responseData);
                })
                .catch(error => {
                    console.error('Error:', error);
                });
        };

        reader.readAsDataURL(file);
    } else {
        fetch('http://localhost:8081/api/Add', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(data)
        })
            .then(response => response.json())
            .then(responseData => {
                document.getElementById('employeeForm').reset();

                // console.log(responseData);
            })
            .catch(error => {
                console.error('Error:', error);
            });
    }
};


document.getElementById('employeeForm').addEventListener('submit', function (event) {
    event.preventDefault(); // Prevent the default form submission
    AddEmployee(); // Call the AddEmployee function
});



















