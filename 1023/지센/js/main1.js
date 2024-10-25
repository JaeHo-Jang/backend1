$(function() {

    $(window).resize(function(){
        var w =$(this).width();
        // 현재 넓이를 w에 저장
        console.log(w);
        if(w < 850) {

        } else {
            if($('.mobile_nav').hasClass('active')==ture){
                $('.mobile_nav').removeClass('active');
                $('.transparency').removeClass('active');
                $('.mobile_nav .sub').css('display', 'none');
            }
        }
    })


    $('.nav > ul').mouseenter(function () {
        $(this).addClass('over');
    });

    $('.nav > ul').mouseleave(function () {
        $(this).removeClass('over');
    });

/* .nav>ul.over {
    /*jquery로 할거라 클래스 세팅*/
    // height: 185px;
// }  



    $('.mobile_tab').click(function(){
        $('.mobile_nav').addClass('active');
        $('.transparency').addClass('active');
        return false;
    });

    $('.close').click(function(){
        $('.mobile_nav').removeClass('active');
        $('.transparency').removeClass('active');
        $('.mobile_nav .sub').css('display', 'none');  //열려 있는 상태로 x 후 다시 들어가면 열려있는걸 닫는 코딩
        return false;
    });



    $('.mobile_nav ul li ul').hide();
    $('.mobile_nav ul li a').click(function(){
        var abc = $(this).next('.sub').css('display');

        if(abc === "none"){
            $('.sub').slideUp();
            $(this).next('.sub').slideDown();
        } else {
            $(this).next('.sub').slideUp();
        }
        return false;
    });

});



