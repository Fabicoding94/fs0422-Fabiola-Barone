var User = /** @class */ (function () {
    function User(name, cognome) {
        this.role = 'user';
        this.name = name;
        this.cognome = cognome;
    }
    User.prototype.saluto = function () {
        console.log('Ciao, mi chiamo ${this.name}');
    };
    Object.defineProperty(User.prototype, "getName", {
        get: function () {
            return this.name;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(User.prototype, "setId", {
        set: function (id) {
            this.id = id;
        },
        enumerable: false,
        configurable: true
    });
    return User;
}());
var user1 = new User('Mario', 'Rossi');
user1.saluto();
console.log(user1.getName);
user1.setId = 5;
