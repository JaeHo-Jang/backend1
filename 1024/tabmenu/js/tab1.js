// const targetLink = document.querySelectorAll('.tab_menu li a');
// const tabContent = document.querySelectorAll('#tabContent>div');

// //targetLink 배열을 forEach로 순회
// targetLink.forEach(function (link) {

//     link.addEventListener('click', function (e) {
//         e.preventDefault();   //링크 이동 금지
//         let orgTarget = e.target.getAttribute('href');

//         let tabTarget = orgTarget.replace("#",'');

//         tabContent.forEach(function(content){
//             content.style.display = "none"
//         })

//         document.getElementById(tabTarget).style.display="block";

//         targetLink.forEach(function(link2) {
//             link2.classList.remove('active');
//             e.target.classList.add('active');
//         });

//     });

// });

// ============ 위 js코딩을 jquery로 아래처럼 코딩 ============ //

$(function () {
    $(".tab_menu a").click(function () {
        //         let orgTarget = e.target.getAttribute('href'); 밑에 jquery문
        let orgTarget = $(this).attr('href');
        
        $('#tabContent > div').hide();

        $(orgTarget).show();  //id선택자로 인식

        $(".tab_menu a").removeClass('active');
        $(this).addClass('active');
        return false;  // 옆과 동일 ==>  e.preventDefault();   //링크 이동 금지
    })
})