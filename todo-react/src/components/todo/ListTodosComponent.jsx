export default function ListTodosComponent() {
    const today = new Date();
    const targetDate = new Date(
      today.getFullYear() + 12,
      today.getMonth(),
      today.getDay()
    );
    const todos = [
      { id: 1, description: "Learn React", done: false, targetDate: targetDate },
      { id: 2, description: "padhle bhai", done: false, targetDate: targetDate },
      { id: 3, description: "Visit India", done: false, targetDate: targetDate },
    ];
    return (
      <div className="ListTodosComponent">
        <h1>Things you want to do!</h1>
        <div>
          <table className="table" border={"1px"} cellPadding={"10px"}>
            <thead>
              <tr>
                <td>id</td>
                <td>description</td>
                <td>is Done ?</td>
                <td>target date</td>
              </tr>
            </thead>
            <tbody>
              {todos.map((todo) => (
                <tr key={todo.id}>
                  <td>{todo.id}</td>
                  <td>{todo.description}</td>
                  <td>{todo.done.toString()}</td>
                  <td>{todo.targetDate.toDateString()}</td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>
      </div>
    );
  }
