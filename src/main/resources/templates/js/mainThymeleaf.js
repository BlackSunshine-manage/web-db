//var productApi = Vue.resource('/red');
//
//
//
//Vue.component('product-row',{
//props: ['product'],
//template: '<div> ${DetailOrder.productSerialNumber} ${DetailOrder.productName} ${DetailOrder.productQuantity}'
//})
//
//Vue.component('products-list',{
//props: ['products'],
//template: '<div>'+
//'product-row v-for="product in products" :key="DetailOrder.ID" :product="product"'
//+
//'</div>',
//created: function(){
//productApi.get().then(
//result => result.json().then(
//data =>
//data.forEach(product => this.products.push(product)))
//)
//}
//})
//
//Vue.component('order-list',{
//props: ['orderDetail'],
//template: '<div><div v-for</div></div>'
//})
//var productList = new productList({
//el:"#listProduct",
//template:'<products-list :products="products" />'
//data{products:[]
//}
//})
