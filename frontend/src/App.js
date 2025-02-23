import './App.css';
import Quote from './component/Quote';

function App() {

  const containerStyle = {
    display: 'flex',
    justifyContent: 'center',
    height: '100vh', 
    alignItems: 'center'
  };

  return (
   <div style={containerStyle}><Quote/></div>
  );
}

export default App;
