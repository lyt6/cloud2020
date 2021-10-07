<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Insert title here</title>
</head>

<script src="${ctx}/static/jquery/dist/jquery.js"></script>
<script src="${ctx}/static/bootstrap/dist/js/bootstrap.js"></script>
<link rel="stylesheet" type="text/css" href="${ctx}/static/bootstrap/dist/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="${ctx}/static/bootstrap/dist/css/bootstrap-theme.css">

<body>

<div>
    <h1>personConfig = ${personConfig}</h1>
</div>

<div class="container-fluid">
    <table id="tableId" class="table table-condensed" style="width: 1212px;">
        <thead>
        <tr>
            <th>日期</th>

        </tr>
        </thead>
    </table>
</div>

<script type="text/javascript">
    $(function () {
        //loadTable();
    });

    function loadTable() {
        $.ajax({
            type: "post",
            url: '${ctx}/houseFunds',
            contentType: 'application/json;charset=utf-8',
            success: function (data) {
                console.log(data);
                var tBody = '';
                for (var index in data) {
                    var row = data[index];
                    tBody += '<tr>\n' +
                        '<td >' + row.createTime + '</td>\n' +
                        '</tr>';
                }
                $("#tableId").append(tBody);
            }
        });
    }
</script>
</body>

</html>