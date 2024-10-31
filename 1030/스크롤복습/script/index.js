$(function () {
    var pdt = 0;
    $(window).scroll(function () {
        var sct = $(this).scrollTop();  //스크롤의 값
        $('#sTop').text(sct);

        pdt = sct * 0.0005;
        if(pdt <= 1) {
            $('#pdt_basic').css('opacity',pdt);
        }

        $('#pdt_basic').css('transform','rotate('+ sct +'deg)');


        $('nav ul li').click(function () {
            var i = $(this).index();  // 현재 네비에 클릭된 인덱스 값 (0.1.2~번방에 li를 넣음.)
            // alert(i);

            var offset_atc = $('section>article').eq(i).offset().top;
            // alert(offset_atc);  // 해당코딩 이후 li클릭시 각 article 높이 알럿 분석해라
            // $('nav ul li').removeClass('on')
            // $(this).addClass('on')
            $('html, body').stop().animate({ scrollTop: offset_atc }, 1000);

            for (var i = 0; i < 5; i++) {
                if (sct >= $('section>article').eq(i).offset().top) {
                    $('nav ul li').removeClass('on');
                    $('nav ul li').eq($(this).index()).addClass('on');
                };
            };   // 포문 안먹는다 연구해라   eq(i)를 세영이가 바꿔줌 작동함(eq($(this)))이걸로 바꿈.

        });

        $("section>article").mousewheel(function (event, d) {
            if (d > 0) {
                var prev = $(this).prev().offset().top;
                $('html, body').stop().animate({ scrollTop: prev }, 1000);
            };
            if (d < 0) {
                var next = $(this).next().offset().top;
                $('html, body').stop().animate({ scrollTop: next }, 1000);

            };

        });
    });


    $("#popup").draggable();
    // $.cookie('pop','no',{expires:1}); //쿠키 쓰는방법 : 팝에 노를 넣고 하루동안 저장해놔라
    if ($.cookie('pop') !== "no") {// 쿠키 팝에 노라는 값이 없으면
        $('#popup').show();
    }
    $('#popup area:eq(0)').click(function () {
        $.cookie('pop', 'no', { expires: 1 });
        $('#popup').fadeOut('fast');
    })


    $('#notice_wrap').draggable();

    if ($.cookie('popup') == 'none') {
        $('#notice_wrap').hide();

    }

    var chk = $('expiresChk');

    $('.closeBtn').on('click', closePop);
    function closePop() {
        if (chk.is(":checked")) {// is는 있다없다 매서드 = input창에 checked가 있으면
            $.cookie('popup', 'none', { expires: 3 });
            // chk 변수가 cheched를 가지고 있으면 popup에 none을 3일 동안 저장해라.
        }
        $('#notice_wrap').fadeOut('fast');
    }
});



