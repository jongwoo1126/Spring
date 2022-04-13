/**
 * 
 */
 $(function(){
				
	$('.user_list').click(function(){
		$.ajax({
			url: '/user',
			type: 'GET',
			dataType: 'json',
			success: function(data){
				console.log(data)
			}
		});
	});
	
	$('.user_register').click(function(){
		
		let jsonData = {
				"uid": "rest1",
				"pass": "1234",
				"name": "홍길동",
				"hp": "010-1234-1111",
				"age": 34
		};
		
		$.ajax({
			url: '/user',
			type: 'POST',
			data: jsonData,
			dataType: 'json',
			success: function(data){
				console.log(data)
			}
		});
	});
	
	$('.user_modify').click(function(){
		
		let jsonData = {
				"name": "홍길동",
				"hp": "010-1234-1111",
				"age": 43
		};
		
		$.ajax({
			url: '/user/rest1',
			type: 'PUT',
			data: jsonData,
			dataType: 'json',
			success: function(data){
				console.log(data)
			}
		});
	});
	
	$('.user_delete').click(function(){
		$.ajax({
			url: '/user/rest1',
			type: 'DELETE',
			dataType: 'json',
			success: function(data){
				console.log(data)
			}
		});
	});
});