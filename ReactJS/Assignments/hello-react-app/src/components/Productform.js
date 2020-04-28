import React from 'react';

const initialState={
    name:"",
    quantity:"",
    price:"",
    nameError:"",
    quantityError:"",
    priceError:"",
    
};

export class ProductFormComponent extends React.Component{
    state=initialState;

    sendData=()=>{
        this.props.parentCallback(this.state)
    }

    validate=()=>{
        let nameError="";
        let quantityError="";
        let priceError="";

        if(this.state.name.length<3 || !this.state.name.match(/^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$/)){
            nameError="Name must contain atleast 3 alphabet characters."
        }

        if(this.state.quantity ==='' || !this.state.quantity.match(/^[0-9]*$/)){
            quantityError="Quantity must be numeric value."
        }

        if(this.state.price==='' || !this.state.price.match(/^[0-9]*$/)){
            priceError="Price must be a numeric value."
        }

        if(nameError || quantityError || priceError){
            this.setState({nameError,quantityError,priceError});
            return false;     
        }
        return true;
    };


    handleSubmit = event => {
        event.preventDefault();
        const isValid = this.validate();
        if (isValid) {
           // console.log(this.state);
            this.sendData();
        this.setState(initialState);
        }
      };
    
    handleChange = event => {
        const isCheckbox = event.target.type === "checkbox";
        this.setState({
          [event.target.name]: isCheckbox
            ? event.target.checked
            : event.target.value
        });
    };

    render(){
        return (
        <form onSubmit={this.handleSubmit}>
            <h1>Product Application</h1>
        <div>
            <label>Name : </label>
            <input 
                type="text" 
                name="name" 
                placeholder="Enter Name"
                value={this.state.name}
                onChange={this.handleChange}>
            </input>
            <div style={{ fontSize: 12, color: "red" }}>
                {this.state.nameError}
            </div>
        </div>
        <div>
            <label>Quantity : </label>
            <input 
                type="text" 
                name="quantity" 
                placeholder="Enter Quantity"
                value={this.state.quantity}
                title="abfgj"
                onChange={this.handleChange}/>
            <div style={{ fontSize: 12, color: "red" }}>
                {this.state.quantityError}
            </div>
        </div>
        <div>
            <label>Price : </label>
            <input 
                type="text" 
                name="price" 
                placeholder="Enter Price"
                value={this.state.price}
                onChange={this.handleChange}/>
            <div style={{ fontSize: 12, color: "red" }}>
                {this.state.priceError}
            </div>
        </div><br></br>
        <button type="submit">ADD PRODUCT</button>
        </form>
        );
    }
}
