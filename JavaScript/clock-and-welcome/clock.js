let name = prompt("Enter your name:")

let myNameDOM = document.querySelector("span#myName")
let myClockDOM = document.querySelector("div#myClock")

myNameDOM.innerHTML = name

function showTime(){
    let dateTime = new Date()
    const weekday = ["Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"]
    let h = dateTime.getHours()
    let m = dateTime.getMinutes()
    let s = dateTime.getSeconds()
    let day = weekday[dateTime.getUTCDay()-1]
    myClockDOM.innerHTML = `${h} : ${m} : ${s} ${day}`
}

showTime()