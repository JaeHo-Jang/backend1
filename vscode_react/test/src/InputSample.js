import { useState } from "react";



function InputSample() {

    const [text, setText] = useState("");
    // useState 훅을 사용하여 texxt라는 상태를 관리합니다.
    // text의 초기값은 빈 문자열 ("")

    const onChange = (e) => {   // 입력필드에 값이 변경될 때 호출(글자를 쓰거나 변경)
        setText(e.target.value);
        // 이벤트 객체 e를 통해 입력 필드의 현재값을 가져와 text 상태를 업데이트
    }
    const onReset = () => {
        setText("");
        // setTxt("")를 통해 ext 상태를 빈 문자열로 설정하여 입력필드 초기화
    }

    return (
        <div>
            <input onChange={onChange} value={text} />
            <button onClick={onReset}>초기화</button>
            <div>
                <b>값 :{text} </b>
            </div>
        </div>
    );
}
export default InputSample;