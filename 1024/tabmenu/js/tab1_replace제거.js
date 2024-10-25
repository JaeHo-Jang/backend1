const targetLink = document.querySelectorAll('.tab_menu a');   //탭버튼
const tabContent = document.querySelectorAll('#tabContent>div'); // 탭내용

//targetLink 배열을 forEach로 순회

targetLink.forEach(function (link) {

    link.addEventListener('click', function (e) {
        e.preventDefault(); //링크금지
        let orgTarget = e.target.getAttribute('href');
        // this.getAttribute('href');
        //클릭(e.taget) - this로 변경 가능
        //getAttribute 는 href, src 속성값을 읽어옴
        //alert(orgTarget); #tab1 ,#tabs2, #tabs3
        
        
        // let tabTarget = orgTarget.replace("#", "");  // 제거안한 tab1과 비교해라


        //#tab1 에서 #을 빈문자열로 대체 -> tab1 
        //alert(tabTarget);

        //모든 tabContent을 안보이게 설정
        tabContent.forEach(function (content) {
            content.style.display = "none";
        });
        //클릭한 탭만보이게 설정
        document.querySelector(orgTarget).style.display = "block";
        // document.getElementById(tabTarget).style.display = "block";
        // .getElementById(tabTarget) 
        // id 호출이기 때문에 괄호 안에 #이 있으면 오류가 생기기 때문에
        // 15줄에 #을 지우는 이유이다.
        
        targetLink.forEach(function (link2) {
            link2.classList.remove('active');
            e.target.classList.add('active');
        });

    });

});