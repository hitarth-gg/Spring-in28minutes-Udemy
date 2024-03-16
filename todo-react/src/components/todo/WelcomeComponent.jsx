import { Link, useParams } from "react-router-dom";

export default function WelcomeComponent() {
    const params = useParams();
  
    return (
      <div className="Welcome">
        <h2>{`Welcome ${params.username}!`}</h2>
        <div>
          Your todos. <Link to="/todos">here</Link>{" "}
          {/* we are not using <a href> here because it'd reload the page, hence no Single Page App */}
        </div>
      </div>
    );
  }
