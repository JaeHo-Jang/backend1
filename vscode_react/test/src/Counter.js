import { useState } from "react";

function Counter () {
    const [number, setNumber] = useState(0);

    const onIncrease = () => {
        setNumber(number + 1);
    }
    
    const onDecrease = () => {
        setNumber(number - 1);
    }
    // 함수형 외워서 써야됨 중요함
    // 위에 유즈스테이트도 했음 아주 아주 중요함.

    return(
        <div>
            <h1>{number}</h1>
            <button onClick={onIncrease}>+1</button>
            <button onClick={onDecrease}>-1</button>
        </div>
    );
}
export default Counter;