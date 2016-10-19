<%-- <%@ page import="bot.hackathon.servlets.RebotService" %> --%>
<!DOCTYPE html>
<html>
<head>
<title>Welcome to Rebot</title>
</head>
<script type="text/javascript">
$(document).ready(function(){
    $("firstpage").change(function(){
        $.getJSON("", function(result){
            $.each(result, function(i, field){
                $("div").append(field + " ");
            });
        });
    });
});

$.ajax({
    type: "POST",
    url: "/RebotService",
    contentType: "application/json",
    dataType: "json",
    data: JSON.stringify({
        deptDate: $("#Date").val(),
        origin: $("#Departure").val(),
        destination: $("#arrival").val()
    }),
    success: function(response) {
        console.log(response);
    },
    error: function(response) {
        console.log(response);
    }
});
</script>
<body>
<div id="firstpage">
<iframe width="350" height="430" src="https://console.api.ai/api-client/demo/embedded/3d8c71fc-3e27-468f-a218-7c5912bff979"></iframe>
</div>
</body>
</html>

