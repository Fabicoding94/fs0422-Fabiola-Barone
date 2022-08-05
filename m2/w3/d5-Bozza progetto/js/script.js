import { User } from "export"

fetch('users.json')
    .then(res => res.json())
    .then(users => {

        for (let user of users) {




            let user = new User(username, firstName, lastName, gender, profileURL, email)

            console.log(user)




        }

    })





