$(document).ready(function (){
	$("#select_btn").click(function(){
		$.ajax({
			type:"GET",
			url:"hello",
			dataType:"json",
			success:function(data){
				var html = '';
				 $.each(data, function(commentIndex, comment){
                     html += '<div class="comment"><h6>' + comment['username']
                               + ':</h6><p class="para"' + comment['content']
                               + '</p></div>';
               });
               $('#resText').html(html);
			}
		})	
	})
})