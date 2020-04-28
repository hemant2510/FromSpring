import React from 'react';
import {ProductFormComponent} from './Productform.js'
import {ProductTableComponent} from './productTable.js'

export class ProductAppComponent extends React.Component{
    
    state={
        name:"",
        quantity:"",
        price:"",
        mota:[]
    }
    
    callbackFunction=(mota)=>{
        this.setState({name:mota.name,
            quantity:mota.quantity,
            price:mota.price
        })
    }
    
    render(){
        console.log(this.state)
        return(
            <div>
                <ProductFormComponent parentCallback={this.callbackFunction.bind(this)}/><br></br><br></br>
                <p>{this.state.name}</p>
                <ProductTableComponent/>
            </div>
        );
    }

}



//
return <tr>
    <td>{this.state.name}</td>
</tr>