<%@ page pageEncoding="UTF-8" %>
<html>
<head>
    <title>客户管理 - 创建客户</title>
</head>
<body>

<h1>创建客户界面</h1>

<%-- TODO --%>
<form id="customer_form">

    <table>
        <tr>
            <td>客户名称：</td>
            <td>
                <input type="text" name="name" value="${customer.name}">
            </td>
        </tr>
        <tr>
            <td>联系人：</td>
            <td>
                <input type="text" name="contact" value="${customer.contact}">
            </td>
        </tr>
        <tr>
            <td>电话号码：</td>
            <td>
                <input type="text" name="telephone" value="${customer.telephone}">
            </td>
        </tr>
        <tr>
            <td>邮箱地址：</td>
            <td>
                <input type="text" name="email" value="${customer.email}">
            </td>
        </tr>
    </table>
    <button type="submit">保存</button>
</form>

<script src="${BASE}/asset/lib/jquery/jquery.min.js"></script>
<script src="${BASE}/asset/lib/jquery-form/jquery.form.min.js"></script>
<script>
    $(function() {
        $('#customer_form').ajaxForm({
            type: 'post',
            url: '${BASE}/customer_create',
            success: function(data) {
                if (data) {
                    location.href = '${BASE}/customer';
                }
            }
        });
    });
</script>
</body>
</html>