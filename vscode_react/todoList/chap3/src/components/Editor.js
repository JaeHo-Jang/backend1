import { useRef,useState } from "react";
import "./Editor.css"
function Editor({onCreate}) {
const [content, setContent] = useState("");
const inputRef = useRef();	//input창 접근

const onChangeContent = (e) =>{
	setContent(e.target.value);
};
// 키보드로 입력하는 내용을 content에 업데이트

const onKeydown = (e) => {
	if(e.keyCode === 13)
		onsubmit();
};
const onsubmit = () =>{
	if(content === ""){
		inputRef.current.focus();
    // 아무것도 입력이 안되면 현재창에 포커스
		return;
	}
	console.log("추가된 할일 : ",content);
	onCreate(content);  // 부모컴포넌트에 새 할일 전달
	setContent("");
}

  return ( 
	<div className='Editor' >
	  <input 
	  ref={inputRef} 
	  value={content} 
	  onChange={onChangeContent}  
	  onKeyDown={onKeydown} 
	 placeholder='새로운 Todo...'/>
	  <button onClick={onsubmit}>추가</button>
	</div>
  )
}

export default Editor;