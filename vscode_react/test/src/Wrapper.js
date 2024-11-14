function Wrapper ({children}) {
    const style = {
        border: '2px solid black',
        padding : '16px',
    }

    return (
        <div style={style}>
            {children}
        </div>
    )
}
export default Wrapper;
// 난 내보낼 기본값이 Wrapper 다