function soyAsincrona(){
    setTimeout(function (nombre, micallback)  {
        console.log('hola '+nombre);
        micallback();

    }, 1000);
    
    
}

function adios(nombre, otrocallback) {
    setTimeout(function () {
        console.log('Adios', nombre);
        otrocallback();

    },1000
        
    )
}
console.log('iniciamos el proceso...');
hola('carlos', function()  {
    adios('carlos', function () {
    
    });
console.log("terminando el proceso...");

});

//hola('carlos' , function(){});
//adios('carlos' , funtion(){});



