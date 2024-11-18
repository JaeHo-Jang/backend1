import Hello from "./Hello";
import './App.css';

function App() {
    const name = "react"
    const style = {
        backgroundColor : 'black',
        color : 'aqua',
        fontSize :24,
        padding : '1rem'

    }

    return(
        <div>
            {/* 주석은 화면에 보이지 않아요 */}
            <Hello />
            <div style={style}>{name}</div>
            <div className="gray-box"></div>
        </div>
    );
}
export default App;