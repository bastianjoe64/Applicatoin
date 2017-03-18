/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$("#register").click(function () {
alert("Hi");
    var email=$("#email").val();
    var password=$("#password").val();
    $.ajax({
        type:'POST',
        url:'NewServlet',
        data:{
            email:email,
            password:password,
            action:"register"
        },
        success:function(data){
            alert(data,"reisterd");
        },
        failure:function(data){
            alert(data);
        }
    });
});



   
