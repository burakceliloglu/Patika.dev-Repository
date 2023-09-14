function hello(){
    console.log("Hello World.")
}

hello()

let id = document.querySelector("#functions")
id.addEventListener("click",domClick)

function domClick(){
    alert("CLICKED.")
    this.style.color == "red" ? this.style.color = "black" : this.style.color = "red"
}

// COUNTER
let counter = 0
let counterDom = document.querySelector('#counter')
let increaseDom = document.querySelector('#increase')
let decreaseDom = document.querySelector('#decrease')

increaseDom.addEventListener('click',clickEvent)
decreaseDom.addEventListener('click',clickEvent)

function clickEvent(){
    console.log(this.id)
    this.id == "increase" ? counter +=1 : counter -=1
    counterDom.innerHTML = counter
}

