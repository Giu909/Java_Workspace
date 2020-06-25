const numeri = [1,2,3,4,5,6,7,8,9,10];
const filtered = numeri.filter(function (numeri) {
    return numeri % 2 === 0;
});
console.log(filtered);