/**
 * Created by yzy on 2017/4/26.
 */
$(function () {

})
function validateInputMsg() {
    var name = $("#name").val();
    var email = $("#email").val();
    var phone = $("#phone").val();
    var msg = $("#msg").val();
    if (name.length <= 0 || name.length > 10) {
        // Demo.Util.errorNoty("请输入正确的名字");
        alert("请输入正确的名字");
        return false;
    }
    if (email.length > 0) {
        var reg = /^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/;
        if (!reg.test(email)) {
            alert("请输入正确的邮箱");
            return false;
        }
    }
    if (phone.length > 0) {
        var reg = /^(86)*0*13\d{9}$/;
        if (!reg.test(phone)) {
            alert("请输入正确的手机号");
            return false;
        }
    }
    if (msg.length <= 0) {
        alert("您的建议是小y的动力");
        return false;
    }
    if (msg.length > 200) {
        alert("留言限定两百个字符哦");
        return false;
    }
    return true;
}

function submitMsg() {
    if (!validateInputMsg()) {
        return;
    }
    var name = $("#name").val();
    var email = $("#email").val();
    var phone = $("#phone").val();
    var msg = $("#msg").val();
    var params = {
        name: name,
        email: email,
        phone: phone,
        msg: msg
    }
    // jQuery.ajax({
    //     url: "/board/saveMsg.do",
    //     type: "post",
    //     dataType: "json",
    //     data: params,
    //     success: function (result) {
    //
    //         // if(result.code == 1){
    //         //     alert("谢谢您的留言,请多指教!")
    //         // }
    //     }
    // });
    jQuery.ajax({
        url: "/board/saveMsg.do",
        type: "post",
        dataType: "json",
        data: params,
        success: function (result) {
            if (result.code == 1) {
                console.log("成功");
                alert("感谢您的留言！");
            } else {

            }
        }
    });

}
