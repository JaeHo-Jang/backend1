import UserCard1 from "./UserCard1";
function UserList(){
    const users = [
        { name: "Alice", age: 30, job: "Designer", isActive: true },
        { name: "Bob", age: 22, job: "Developer", isActive: false },
        { name: "Charlie", age: 27, job: "Product Manager", isActive: true },
        { name: "Dana", job: "Analyst", isActive: false },
    ]
    return (
        <div>
            <h1>사용자목록</h1>
            {users.map((users, index) => (
                <UserCard1
                    key={index}
                    name={users.name} age={users.age} job={users.job} isActive={users.isActive}
                />
            ))}
        </div>
    );
}
export default UserList;
