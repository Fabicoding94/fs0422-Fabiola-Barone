var _a;
var Todo = /** @class */ (function () {
    function Todo(selettore) {
        this.target = document.querySelector(selettore);
        this.selettore = selettore;
        var db = localStorage.getItem(selettore) || '[]';
        this.allTodos = JSON.parse(db);
        this.creaHTMLBase();
        if (this.allTodos.length > 0) {
            for (var _i = 0, _a = this.allTodos; _i < _a.length; _i++) {
                var todo = _a[_i];
                this.creaHTMLTodo(todo);
            }
        }
    }
    Todo.prototype.creaHTMLBase = function () {
        var _this = this;
        //creo gli elementi
        var input = document.createElement('input');
        var button = document.createElement('button');
        var list = document.createElement('div');
        //attivo funzionalità del button
        button.addEventListener('click', function () {
            _this.creaHTMLTodo();
            _this.salvaNuovoTodo();
        });
        //formatto gli elementi
        input.classList.add('form-control');
        button.classList.add('btn', 'btn-primary');
        button.textContent = 'Salva';
        //salvo gli elementi nelle proprietà della classe
        this.input = input;
        this.button = button;
        this.list = list;
        //mostro gli elementi
        if (this.target) {
            this.target.append(input, button, list);
        }
        else {
            throw new Error("Elemento target(".concat(this.selettore, ") non trovato"));
        }
    };
    Todo.prototype.creaHTMLTodo = function (testo) {
        if (testo === void 0) { testo = null; }
        var newTodo = document.createElement('div');
        newTodo.classList.add('alert', 'alert-success');
        newTodo.textContent = testo || this.input.value;
        this.list.append(newTodo);
    };
    Todo.prototype.salvaNuovoTodo = function () {
        this.allTodos.push(this.input.value);
        localStorage.setItem(this.selettore, JSON.stringify(this.allTodos));
        this.input.value = '';
    };
    return Todo;
}());
var todo1 = new Todo('#todo');
var todo2 = new Todo('#todo2');
(_a = document.querySelector('#btnProva')) === null || _a === void 0 ? void 0 : _a.addEventListener('click', function () {
    todo1.creaHTMLTodo('prova');
});
