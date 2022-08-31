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
var Tasse = /** @class */ (function () {
    function Tasse(codredd, redditoAnnuoLordo) {
        this.codredd = codredd;
        this.redditoAnnuoLordo = redditoAnnuoLordo;
    }
    Tasse.prototype.getTasseInps = function () {
        var impostaInps = (this.redditoAnnuoLordo / 100 * 33);
        var InpsPagata = this.redditoAnnuoLordo - impostaInps;
        return InpsPagata;
    };
    Tasse.prototype.getTasseIrpef = function () {
        if (this.redditoAnnuoLordo <= 15000) {
            var IrpefPagata1 = this.redditoAnnuoLordo / 100 * 23;
            var IrpefPagata = IrpefPagata1;
            return IrpefPagata;
        }
        else if (this.redditoAnnuoLordo > 15000 && this.redditoAnnuoLordo <= 28000) {
            var IrpefPagata1 = this.redditoAnnuoLordo / 100 * 23;
            var IrpefPagata2 = IrpefPagata1 + ((this.redditoAnnuoLordo - 15000) / 100 * 25);
            var IrpefPagata = IrpefPagata2;
            return IrpefPagata;
        }
        else if (this.redditoAnnuoLordo > 28000 && this.redditoAnnuoLordo <= 50000) {
            var IrpefPagata1 = this.redditoAnnuoLordo / 100 * 23;
            var IrpefPagata2 = IrpefPagata1 + ((this.redditoAnnuoLordo - 15000) / 100 * 25);
            var IrpefPagata3 = IrpefPagata2 + ((this.redditoAnnuoLordo - 28000) / 100 * 35);
            var IrpefPagata = IrpefPagata3;
            return IrpefPagata;
        }
        else if (this.redditoAnnuoLordo > 50000) {
            var IrpefPagata1 = this.redditoAnnuoLordo / 100 * 23;
            var IrpefPagata2 = IrpefPagata1 + ((this.redditoAnnuoLordo - 15000) / 100 * 25);
            var IrpefPagata3 = IrpefPagata2 + ((this.redditoAnnuoLordo - 28000) / 100 * 35);
            var IrpefPagata4 = IrpefPagata3 + ((this.redditoAnnuoLordo - 50000) / 100 * 43);
            var IrpefPagata = IrpefPagata4;
            return IrpefPagata;
        }
    };
    return Tasse;
}());
var Lavoratore = /** @class */ (function (_super) {
    __extends(Lavoratore, _super);
    function Lavoratore(nome, cognome, professione, codredd, redditoAnnuoLordo) {
        var _this = _super.call(this, codredd, redditoAnnuoLordo) || this;
        _this.nome = nome;
        _this.cognome = cognome;
        _this.professione = professione;
        return _this;
    }
    Lavoratore.prototype.getUtileTasse = function () {
        var tasseInps = this.getTasseInps();
        var tasseIrpef = this.getTasseIrpef();
        return tasseInps + tasseIrpef;
    };
    Lavoratore.prototype.getRedditoAnnuoNetto = function () {
        return this.redditoAnnuoLordo - this.getUtileTasse();
    };
    return Lavoratore;
}(Tasse));
var Mario = new Lavoratore('Mario', 'Rossi', 'consulente', 1234, 10000);
console.log(Mario.getRedditoAnnuoNetto());
