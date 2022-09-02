"use strict";
exports.__esModule = true;
exports.User = void 0;
var Address_1 = require("./Address");
var User = /** @class */ (function () {
    function User(name, lastname) {
        this.name = name;
        this.lastname = lastname;
    }
    Object.defineProperty(User.prototype, "setAddress", {
        set: function (address) {
            this.address = address;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(User.prototype, "setBillingAddress", {
        set: function (address) {
            this.billingAddress = address;
        },
        enumerable: false,
        configurable: true
    });
    return User;
}());
exports.User = User;
var user = new User('mario', 'rossi');
/////////////////////////////////////
var address = new Address_1.Address('via roma 1', 'roma', 'italia', 65455);
user.setAddress = address;
/*Terminal -> Git Bush -> "cd mdelli"; -> "tsc --init"

*/
