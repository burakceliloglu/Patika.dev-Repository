// display cross
var myNodelist = document.getElementsByTagName("li")

for (i = 0; i < myNodelist.length; i++) {
    var span = document.createElement("span")
    var cross = document.createTextNode("\u00D7")
     
    span.className = "close"
    span.appendChild(cross)
    myNodelist[i].appendChild(span)
}

// delete tasks
let close = document.getElementsByClassName("close")

    for(i=0; i<close.length; i++){
        close[i].onclick = function () {
            let div = this.parentElement;
            div.style.display = "none"        
        }
    }


// add class(checked)
var listItems = document.querySelectorAll("ul li")
    listItems.forEach(function(li) {
    li.addEventListener('click', function() {
        this.classList.toggle('checked')
    });
});

//add new task or tasks
let alertDOM = document.querySelector('#alert')
const ALERT = `<div class="alert alert-warning alert-dismissible fade show" role="alert">
<strong>HATALI GİRİŞ!</strong> Bir şeyler yazman gerek.
<button type="button" class="close" data-dismiss="alert" aria-label="Close">
  <span aria-hidden="true">&times;</span>
</button>
</div>`
newElement= () =>{
    let ul = document.querySelector("#list")
    let li = document.createElement("li")
	
    let inputText=document.querySelector("#task").value
    var node = document.createTextNode(inputText)
	li.appendChild(node)
    if(inputText){
        ul.appendChild(li)
        document.querySelector("#task").value=""
    }else{
        alertDOM.innerHTML = ALERT
    }
}