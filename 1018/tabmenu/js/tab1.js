const targetLink = document.querySelectorAll('.tab_menu li a');
const tabContent = document.querySelectorAll('#tabContent>div');

//targetLink 배열을 forEach로 순회
targetLink.forEach(function (link) {

    link.addEventListener('click', function (e) {
        e.preventDefault();   //링크 이동 금지
        let orgTarget = e.target.getAttribute('href');
        // 클릭한(e.target) --- this로 변경가능
        // getAttribute 는 href, src 속성값을 읽어온다.
        // alert(orgTarget);
        // alert(orgTarget);    ===  #tabs1, tabs2, tabs3

        let tabTarget = orgTarget.replace("#",'');
        //#tab1에서 #을 빈문자열로 대체 -> tabs1
        // alert(tabTarget);

        //모든 tabContent을 안보이게 설정
        tabContent.forEach(function(content){
            content.style.display = "none"
        })
        //클릭한 탭만보이게 설정
        document.getElementById(tabTarget).style.display="block";
        // document.getElementById(tabTarget).style.display = "block";
        // .getElementById(tabTarget) 
        // id 호출이기 때문에 괄호 안에 #이 있으면 오류가 생기기 때문에
        // 15줄에 #을 지우는 이유이다.


        targetLink.forEach(function(link2) {
            link2.classList.remove('active');
            e.target.classList.add('active');
        });  // forEach문 아래는 동일 기능 for문↓

        // for(let k=0; k<targetLink.length; k++){
        //     targetLink[k].classList.remove('active');
        //     e.target.classList.add('active');//클릭한 놈에 active를 
        //     //넣는다. -tab_menu a -> active클래를 주어 색상변경 
        // }

    });

});