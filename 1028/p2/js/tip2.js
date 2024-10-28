$(function () {
    $(window).scroll(function () {
        var sct = $(this).scrollTop();
        //마우스 세로 스크롤의 값(양)을 구해서 sct에 저장

        $('.title').text(sct);
        //구해진 스크롤값을 실시간으로 s_top 반영


        if (sct >= 100 && sct <= 450) {
            $('.area1').addClass('on');
        } else {
            $('.area1').removeClass('on');
        }

        if (sct >= 600 && sct <= 1200) {
            $('.area2').addClass('on');
        } else {
            $('.area2').removeClass('on');
        }

        if (sct >= 1300 && sct <= 1900) {
            $('.area3').addClass('on');
        } else {
            $('.area3').removeClass('on');
        }

        if (sct >= 2000 && sct <= 2600) {
            $('.area4').addClass('on');
        } else {
            $('.area4').removeClass('on');
        }

        if (sct >= 2700 && sct <= 3300) {
            $('.area5').addClass('on');
        } else {
            $('.area5').removeClass('on');
        }
    });
});