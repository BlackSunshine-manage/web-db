var productApi = Vue.resource('/red');

Vue.component('product-row',{
props: ['product'],
template: '<div> {{DetailOrder.productSerialNumber}} {{DetailOrder.productName}} {{DetailOrder.productQuantity}}'
created: function(){
productApi.get().thenresult => result.json().then(
data =>
data.forEach(product => this.products.push(product)))
})

var app = new Vue({
el:'#ap',
data:{
product-row
}})