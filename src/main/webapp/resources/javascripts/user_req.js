var login = function(user) {
	let u_id = u.qu('#u_id');
	let password = u.qu('#password');
	if (u_id.value === "" || password.value === "") {
		alert("ID와 비밀번호를 입력바랍니다.");
	} else {
		let form = u.qu('#form');

		switch (user) {
		case 'std':
			u.axios('./user/userlogin', {
				u_id : form.u_id.value,
				password : form.password.value
			}, "post");
			break;
		case 'admin':
			u.axios('./user/userlogin', {
				u_id : form.u_id.value,
				password : form.password.value
			}, "post");
			break;
		default:
			alert('올바른 입력 바랍니다.');
			break;
		}
	}
};

var sign_up = function() {
	u.link("./signup");
};

var find_id = function() {
	u.link("./findid");
};

var find_pw = function() {
	u.link("./findpw");
};

var change_pw = function() {
	u.link("./changepw");
};