import React from 'react';

export class ButtonComponent extends React.Component{
    render(){
        return( <div>
           <a href="#" onClick={this.actionOK.bind(this)}><button>OK</button></a> 
           <a href="#" onClick={this.actionCancel.bind(this)}><button>Cancel</button></a> 
        </div>)
    }

    actionOK(){
        alert("OK clicked");
    }

    actionCancel(){
        alert("Cancel clicked");
    }
}