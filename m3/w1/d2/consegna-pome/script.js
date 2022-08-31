var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var deposit = 10000;
var addInterest = deposit / 100 * 10;
var SonAccount = /** @class */ (function () {
    function SonAccount(name, surname, accountBalance) {
        this.name = name;
        this.surname = surname;
        this.balanceInit = accountBalance;
    }
    SonAccount.prototype.oneDeposit = function () {
        var newBalanceInit = this.balanceInit + deposit;
        console.log(newBalanceInit);
    };
    SonAccount.prototype.oneWhitDraw = function () {
        var newBalanceInit = this.balanceInit + deposit;
        var whitdraw = 5000;
        var SecondBalanceInit = newBalanceInit - whitdraw;
        console.log(SecondBalanceInit);
    };
    return SonAccount;
}());
var son = new SonAccount('Edoardo', 'Trovarelli', 0);
son.oneDeposit();
son.oneWhitDraw();
var MotherAccount = /** @class */ (function (_super) {
    __extends(MotherAccount, _super);
    function MotherAccount(name, surname, accountBalance, addInterest) {
        var _this = _super.call(this, name, surname, accountBalance) || this;
        _this.addInterest = addInterest;
        return _this;
    }
    MotherAccount.prototype.oneMotherDeposit = function () {
        var newMotherBalanceInit = this.balanceInit + deposit - this.addInterest;
        console.log(newMotherBalanceInit);
    };
    MotherAccount.prototype.oneMotherWhitDraw = function () {
        var newBalanceInit = this.balanceInit + deposit;
        var whitdraw = 5000;
        var SecondMotherBalanceInit = newBalanceInit - whitdraw - this.addInterest;
        console.log(SecondMotherBalanceInit);
    };
    return MotherAccount;
}(SonAccount));
var mother = new MotherAccount('Maria', 'Rossi', 0, addInterest);
mother.oneMotherDeposit();
mother.oneMotherWhitDraw();
