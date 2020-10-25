import './App.css';
import React, {useState, useEffect} from 'react';
import axios from 'axios';

const App = () => {
  const [repos, setRepos] = useState([]);

  useEffect(() => {
    axios.get(`api/repos`).then(response => {
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
