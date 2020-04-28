import React from 'react';
import PropTypes from 'prop-types';

export class LoginComponent extends React.Component{
    constructor(props){
        super(props);
        this.state={dummy:this.props.dummy};
    }
    actionTest(){
        let user= this.refs.usernameTextArea.value;
        let pass= this.refs.passwordTextArea.value;
        if(user.length<5 || pass.length<3){
            console.log("Username must be 5 characters log and password must be 3 characters long.");
        }
        if(user===pass){
            this.setState({dummy:"Login Successful"});
        }
        else{
            this.setState({dummy:"Login unsuccessful"});
        }
        
    }
    render() { return(<div>
        <input type="text" ref="usernameTextArea" />
        <input  type="password" ref="passwordTextArea"/>
        <input type="submit" ref="submitArea" onClick={this.actionTest.bind(this)}/>
        <h1>{this.state.dummy}</h1> 
        </div>
        );
        }
}
