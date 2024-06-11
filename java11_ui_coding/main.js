    $(document).ready(function(){
        var intv = setInterval(function () { next_ani(); }, 4000);
	var imgWidth = parseInt($("#vs").width()) * -1;
	function next_ani() {
		$(".img_box").animate({"margin-left" : imgWidth }, 1000, function() {
			$(".img_box li").eq(0).appendTo($(".img_box"));
			$(".img_box").css("margin-left", "0px");
		});
	};
	function prev_ani() {
		$(".img_box li").eq(3).prependTo($(".img_box"));
		$(".img_box").css("margin-left", imgWidth);
		$(".img_box").animate({"margin-left" : "0px" }, 4000);	
	};
	$(".btn_box .right").click(function() {
		clearInterval(intv);
		next_ani();
		intv = setInterval(function () { next_ani(); }, 4000);	
	});
	$(".btn_box .left").click(function() {
		clearInterval(intv);
		prev_ani();
		intv = setInterval(function () { next_ani(); }, 3000);	
	});
	$(".close").click(function() {
		$(".popbox").fadeOut(800);
	});
	$(".pop").click(function() {
		$(".popbox").fadeIn(800);
	});
    });