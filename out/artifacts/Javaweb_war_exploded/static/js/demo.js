function $(id) {
    return document.getElementById(id)
}

const ACCOUNT_PATTON = /^\d{6,10}$/;
const PASSWORD_PATTON = /^\w{3,20}$/;

function user_input() {
    const account = $("account").value;
    const password = $("password").value;

    if (account === "") {
        alert("账号不能为空！");
        return false;
    } else if (!ACCOUNT_PATTON.test(account)) {
        alert("账号由6-10位纯数字组成");
        return false;
    } else if (password === "") {
        alert("密码不能为空！");
        return false;
    } else if (!PASSWORD_PATTON.test(password)) {
        alert("密码仅由英文字符，数字，下划线组成，且8-30位");
        return false;
    }

    return true;
}

function register_input() {
    if (!user_input()) {
        return false;
    } else if ($("password").value != $("password2").value) {
        alert("两次输入密码不一致")
        return false;
    }

    return true;
}