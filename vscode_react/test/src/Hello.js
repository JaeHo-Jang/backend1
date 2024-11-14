import react from "react";

function Hello({ color, name, isSpecial }) {
    return (
        <div style={{ color }}>
            {/* {isSpecial ? <b>*</b> : null}       => 이걸 아래처럼 줄일 수 있음 */  }
            {isSpecial && <b>*</b>}
            안녕하세요 {name}
        </div>
    );
}
Hello.defaultProps = {
    name: '이름없음'
}
export default Hello;