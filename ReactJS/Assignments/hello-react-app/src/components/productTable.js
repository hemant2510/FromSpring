import React from 'react';

export class ProductTableComponent extends React.Component{
    render(){
        return(
        <div>
            <table border="2px">
                <tr>
                    <th><b>ID</b></th>
                    <th><b>Name</b></th>
                    <th><b>Quantity</b></th>
                    <th><b>Price</b></th>
                    <th><b>Actions</b></th>
                </tr>
                <tbody>
                    {this.props.contents}
                </tbody>
            </table>
        </div>
        );
    }
}