$('document').ready(function(){	
	$('.table #editButton').on('click',function(event){	
		
		event.preventDefault();
		var href= $(this).attr('href');
		$.get( href, function (student, Status) {  
			$('#idedit').val(student.id);
			$('#nameedit').val(student.name);
			$('#departementedit').val(student.departement);
			$('#updateByedit').val(student.updateBy);
			$('#updateOnedit').val(student.updateOn.substr(0,10));
	    });
	    
		
		$('#editModal').modal();				
	});	
	
	
	
	$('.table #deleteButton').on('click',function(event){
		event.preventDefault();		
		var href = $(this).attr('href');
		$('#deleteModal #delRef').attr('href', href);		
		$('#deleteModal').modal();
	});
	
});