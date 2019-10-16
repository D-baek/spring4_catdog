"use strict";
var app = app || {};  																			 // null 객체 만드드는 것
app = (()=>{																						//객체, 루틴
	const WHEN_ERR = '호출하는 JS 파일을 찾지 못했습니다.'; //상수
	let _, js, authjs;      																			//지역변수
	let run =x=>																				//서브루틴(java :로컬 메서드)
		$.getScript(x+'/resources/js/cmm/router.js',
				()=>{$.extend(new Session(x));
			onCreate();
		});
		
	let init =()=>{
		_= $.ctx();
		js = $.js();
		authjs = js+ '/cmm/auth.js';
		}
	
	let onCreate =()=>{
		init();
		$.when(																						//when.done.fail = java : if&else
				$.getScript(authjs)
		)
		.done(()=>{
				auth.onCreate()
		})
		.fail(()=>{
			alert(WHEN_ERR)
		}); 
	}
	return {run : run};																			//클로저(리턴 값을 객체로 던진다)
	
})();
