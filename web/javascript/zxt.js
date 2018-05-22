console.log('zxt111');

var ajax1 = document.getElementById("ajax1");
var ajax2 = document.getElementById("ajax2");
var ajax3 = document.getElementById("ajax3");
var ajax4 = document.getElementById("ajax4");

var form_get = document.getElementById("form_get");
var submit_get = document.getElementById("submit_get");
var form_post = document.getElementById("form_post");
var submit_post = document.getElementById("submit_post");



ajax1.addEventListener('click', () => {
    fetch('ajax1/zxt')
        .then(res => {
            console.log(res);
            return res.json();
        })
        .then(json => {
            console.log(json);
        })
});

ajax2.addEventListener('click',()=>{
    fetch('ajax1',{
        method:'POST',
        headers: {
            'content-type': "application/x-www-form-urlencoded; charset=UTF-8"
        },
        body: 'name=zxt&age=11'
    })
        .then(res => {
            console.log(res);
            return res.json();
        })
        .then(json => {
            console.log(json);
        })
});

var data = {
    name: 'zxt',
    age: 11
};

ajax3.addEventListener('click',()=>{
    fetch('ajax2?name=zzzz&age=11',{
        method:'GET',
        headers: {
            'content-type': 'application/json'
        }
    })
        .then(res => {
            console.log(res);
            return res.json();
        })
        .then(json => {
            console.log(json);
        })
});

ajax4.addEventListener('click',()=>{
    fetch('ajax2',{
        method:'POST',
        headers: {
            'content-type': 'application/json'
        },
        body: JSON.stringify(data)
    })
        .then(res => {
            console.log(res);
            return res.json();
        })
        .then(json => {
            console.log(json);
        })
});


submit_get.addEventListener('click',()=>{
    form_get.submit();
});

submit_post.addEventListener('click',()=>{
    form_post.submit();
});
