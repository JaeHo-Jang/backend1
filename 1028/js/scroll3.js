$(function () {
    $(window).scroll(function () {
        var sct = $(this).scrollTop();
        //마우스 세로 스크롤의 값(양)을 구해서 sct에 저장

        $('.s_top').text(sct);
        //구해진 스크롤값을 실시간으로 s_top 반영


        if (sct >= 450 && sct <= 1200) {
            $('.left1').addClass('on');
        } else {
            $('.left1').removeClass('on');
        }

        if (sct >= 1000 && sct <= 1600) {
            $('.right1').addClass('on');
        } else {
            $('.right1').removeClass('on');
        }

        if (sct >= 2700 && sct <= 3200) {
            $('.s4_cover').addClass('active');
        } else {
            $('.s4_cover').removeClass('active');
        }
    });
});