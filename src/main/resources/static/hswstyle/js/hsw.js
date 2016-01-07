//Page Loaded 初始化
$(function() {
	chuizhijuzhong();
});

// 子DIV相对于父级元素，垂直居中
function chuizhijuzhong() {
	zi = $(".vertical-center");
	fu = zi.parent();
	margtop = (fu.height() - zi.height()) / 2;
	zi.css("marginTop", margtop + "px")
}