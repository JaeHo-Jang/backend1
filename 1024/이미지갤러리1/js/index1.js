$(function () {
    $("#wrap ul li a").click(function () {
        //         let orgTarget = e.target.getAttribute('href'); 밑에 jquery문
        var img_url = $(this).attr('href');
        $('#window img').attr('src', img_url)
        $("#wrap ul li a").removeClass('active');
        $(this).addClass('active');
        return false;  // 옆과 동일 ==>  e.preventDefault();   //링크 이동 금지
    })
})