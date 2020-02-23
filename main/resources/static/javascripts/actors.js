$(document).ready(function(){
	pageLoad();
});

function pageLoad(){
	$('.pagination').click(function() {
		var page = $(this).attr('id');
		$.get("/actor/firstPage", 
		{desiredPage: page});
		pagination(page);
	});
};



function pagination(selected){
	var pages = $('.pagination');
	for(var i=0; i < 6; i++){
		console.log(selected);
		var pageNumber = parseInt(i) + parseInt(selected);
		pages[i].id = pageNumber;
		$('#' + pageNumber + '').html(pageNumber);
	}
};

