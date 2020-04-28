var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Accounts = /** @class */ (function () {
    function Accounts(id, name, balance) {
        this.id = id;
        this.name = name;
        this._balance = balance;
    }
    Object.defineProperty(Accounts.prototype, "balance", {
        get: function () {
            return this._balance;
        },
        enumerable: true,
        configurable: true
    });
    return Accounts;
}());
var SavingsAccount = /** @class */ (function (_super) {
    __extends(SavingsAccount, _super);
    function SavingsAccount(id, name, _balance, interest) {
        var _this = _super.call(this, id, name, _balance) || this;
        _this.interest = interest;
        return _this;
    }
    Object.defineProperty(SavingsAccount.prototype, "balance", {
        get: function () {
            return this._balance;
        },
        enumerable: true,
        configurable: true
    });
    return SavingsAccount;
}(Accounts));
var CurrentAccount = /** @class */ (function (_super) {
    __extends(CurrentAccount, _super);
    function CurrentAccount(id, name, _balance, cash_credit) {
        var _this = _super.call(this, id, name, _balance) || this;
        _this.cash_credit = cash_credit;
        return _this;
    }
    Object.defineProperty(CurrentAccount.prototype, "balance", {
        get: function () {
            return this._balance;
        },
        enumerable: true,
        configurable: true
    });
    return CurrentAccount;
}(Accounts));
var obj1 = new SavingsAccount(1, "Hemant Raj", 400000, 4000);
var obj2 = new CurrentAccount(2, "Priyamvad", 2000000000, 6000);
function calculateBalance() {
    var bal1 = obj1.balance;
    var bal2 = obj2.balance;
    var result = bal1 + bal2;
    console.log(result);
}
calculateBalance();
