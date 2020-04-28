import React from 'react';
import logo from './logo.svg';
import './App.css';

import {HelloComponent} from './components/hello.js';
import {ButtonComponent} from './components/button.js';
import {LoginComponent} from './components/login.js';
import {LifeCycleComponent} from './components/lifecycle.js';
import {ProductAppComponent} from './components/productApp.js'


function App(){
  return (<ProductAppComponent/>)
}
export default App;




/*
function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}
*/

