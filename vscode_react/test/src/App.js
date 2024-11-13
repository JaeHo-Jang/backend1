import Hello from "./Hello";
import './App.css';

function App() {
  const name = 'react';
  const style1 = {
    backgroundColor : 'black',
    color : 'aqua',
    fontSize : 24,   // 기본단위 px 생략
    padding : '1rem'  // 다른 단위는 문자열로 ''입력 후 코딩
  }
  return (
    <>
    {/* 이렇게 호출이 두개면 div로 감싸던지, <> </>로 감싸면 됨. */}
    /* 중괄호로 감싸지 않으면 화면에 보여요 */
      <Hello
      // 열리는 태그 내부에서는 이렇게 주석을 작성할 수 있음.
      /> 
      <div style = {style1}>{name}</div>
      <div className="lime-box"></div>
    </>
  );
}
export default App;