import './App.css';
import React, {useState, useEffect} from 'react';
import axios from 'axios';

// package.json defines proxy so local requests go to the backend
// to avoid cors issues. 
// Note: the proxy cannot be localhost f.x. "proxy": "http://10.11.12.149:8080",
const BASE_URL = "http://localhost:3000/";

const App = () => {
  const [repos, setRepos] = useState([]);

  useEffect(() => {
    axios.get(`${BASE_URL}/repos`).then(response => {
      console.log('Response', response.data);
      setRepos(response.data); 
    });
  }, []);

  return (
    <div className="App">
      <div className="App-body">
        <strong>Repositories:</strong>
        <ul>
          {
            repos.map((repo) =>
              <li key={repo.id}>{repo.name}</li>
            )
        }
        </ul>
      </div>
    </div>
  );
};

export default App;
