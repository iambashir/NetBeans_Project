var mainContentUrl = "";

function LoadMainContent(url){
	mainContentReqTime  = new Date().getTime();
		
		mainContentUrl = url;
		
		$.ajax({
	        url: url,
	        success:function( response, status, xhr ) { 
	        	if(response.indexOf("<!DOCTYPE html>") != -1){
	        		window.location = url;
	        	}
	        	else{	    
	   /* 
	 	+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	        						AUTO SCROLL STOP ON PAGE LOAD
	   	+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	    */	        				        		
	        		$('#mainContent').html(response);
	        		
	        	
//		    		$('.main-content').hide().html(response).fadeIn(500, function(){
//		    			ScrollToTop();
//		    		});
	        	}
	        	
	    	}
	    });
		//isDirty = false;

/*	if(	isDirty ){
		swal({
			title: "Discard changes?",
			text: "Are you sure to navigate away?",
			type: "warning",
			showCancelButton: true,
			confirmButtonColor: "#007AFF",
			confirmButtonText: "Yes, discard changes!",
			closeOnConfirm: true
		}, navigateAway);
	}
	else{
		navigateAway();
	}*/
	
}

function InitHandlers(){
	$("form.ajax:not(.linked)").on('submit', function (event) {
		event.preventDefault();
		var validator = window[$(this).data("validator")];

		if (validator === undefined || validator()) {
			var enctype = $(this).prop("enctype");
			
			if(!enctype || enctype == "application/x-www-form-urlencoded"){
				$.ajax({
		        	type: $(this).prop('method'),           
		            url: $(this).prop('action'),
		            data: $(this).serialize(), 
		            success: window[$(this).data("handler")]
		        });	
			}
			else{
				$.ajax({
		        	type: $(this).prop('method'),
		        	encType: enctype,
		        	contentType: false,
		        	processData: false,
		            url: $(this).prop('action'),
		            data: new FormData( $(this)[0]), 
		            dataType: 'json',
		            success: window[$(this).data("handler")]
		        });
			}

		};
		return false;
	}).addClass("linked");
}

function ShowSuccessMsg(title, msg)
{
	swal({
		title: title,
		text: msg,
		type: "success",
		confirmButtonColor: "#007AFF"
	});

}
function ShowErrorMsg(title, msg)
{
	swal({
		title: title,
		text: msg,
		type: "error",
		confirmButtonColor: "#007AFF"
	}, function(){
		  swal("Deleted!", "Your imaginary file has been deleted.", "success");
	});
}

function InitDataTable(table, sortingColumnNo){
	  var ColumnNo = ( sortingColumnNo == undefined ) ? 0 : sortingColumnNo;
    var oTable = $(table).dataTable({
      "aoColumnDefs" : [{
          "aTargets" : [0],
          "searchable": false,
          stateSave: true
      }],
      "oLanguage" : {
          "sLengthMenu" : "Show _MENU_ Rows",
          "sSearch" : "",
          "sSearchWidth" : "300px",
          "sSearchPlaceholder": "Search records ....",
          "oPaginate" : {
              "sPrevious" : "<span class='fa fa-chevron-left'></span>",
              "sNext" : "<span class='fa fa-chevron-right'></span>"
          }
      },
      "aaSorting" : [[ColumnNo, 'asc']],
      "aLengthMenu" : [[5, 10, 15, 20, -1], [5, 10, 15, 20, "All"] // change per page values here
      ],
      // set the initial value
      "iDisplayLength" : 20
  });
  
  //alert($(".paginate_button current").val());
}

function InitResizableTable(table){
	$(table).dataTable({
  	"sDom": "Rlfrtip",
  	"bSort" : false, 
  	"bFilter" : false,
  	"paging" : false,
  	"bInfo" : false
	});
}


//$('#mainContent').load('dashboard-lite.html');

function HideModal(idClass)
{
	$("." + idClass).modal("hide");
	$("." + idClass).find('.modal-body').html("");
}

function ResetInputs(selector){
	if (!selector) {
		selector = ".main-content"
	}

	$(selector).find("input[type='text']").val("");
	$(selector).find("input[type='hidden']").val("");
	$(selector).find("input[type='number']").val("0");
	$(selector).find("input[type='checkbox']").removeProp("checked");
	$(selector).find("textarea").val("");
	$(selector).find("select").val("");
	$(selector).find(".control-label span").remove();
}

var processTcode = function(data){
	if (data.outcome == 'success') {
		$("#tcode").val("");
			LoadMainContent(data.data);
	}
	else{
		LoadMainContent("pages/error");
	}
};


$("#btnSearch").on('keypress',function(e) {
    if(e.which == 13) {
       
        if($("#tcode").val() != ""){
        	 $( "#btnSearch" ).submit();
        	 
        }
    }
    
    e.preventDefault();
});

$("#editProfile").on("click", function(){
	LoadMainContent("user/edit");
})
$("#lockUser").on("click", function(){
	window.location.assign("user/lock")
})
