"use strict";
var auth = auth || {};
auth =(()=>{
	const WHEN_ERR = '호출파일 못찾음.';
	let _, js;
	let init =()=>{
		_ =$.ctx();
		js = $.js();
	}
	let onCreate=()=>{
		init();
		$('#a_go_join').click(()=>{
			alert('회원가입 클릭!!');
		});
	}
	return{onCreate : onCreate}
})();


/** {} : json
 *   return {}; : 클로저
 *   app = (()=>{} ... : 즉시실행함수(IIFE)
 */