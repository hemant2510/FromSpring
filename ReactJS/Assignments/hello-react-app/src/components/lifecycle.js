import React from 'react';

export class LifeCycleComponent extends React.Component{
    render(){
        return(<h1>Test</h1>
        )
    }
    constructor(){
        super();
        console.log("Inside constructor");
    }
    componentDidMount(){
        console.log("Inside componentDidMount");
    }
    componentWillMount(){
        console.log("Inside componentWillMount");
    }
    componentWillUnmount(){
        console.log("Inside componentWillUnmount");
    }
} 