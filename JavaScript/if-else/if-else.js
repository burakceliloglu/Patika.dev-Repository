/* 1- prompt ile aldigin bilgiye gore asagidaki yapiyi kullanarak notun bilgisini #info'ya yazdir
 AA  90-100
 BA  85-89
 BB  80-84
 CB  75-79
 CC  70-74
 DC  65-69
 DD  60-64
 FD  50-59
 FF  0-49
 2- kullanicinin girdigi verinin istedigimiz aralikta olup  madigini kontrol et
 3- ff bilgisinde uzgun surat ikonu cikart, digerlerinde ise  lucuk olsun :)
 4- ff class bilgisi text-danger, digerlerinin ise text-primary olsun
*/

let note = prompt("Enter your note: ")
let info = document.querySelector("#info")
let textInfo;

if(note<0 || note>100){
    textInfo = "Invalid Number!"
}
else{
    info.classList.add("text-primary")
    if(note<=49)
    {
        textInfo = "FF"
        info.classList.remove("text-primary")
        info.classList.add("text-danger")
    }
    else if(note<=59){
        textInfo = "FD"
    }
    else if(note<=64){
        textInfo = "DD"
    }
    else if(note<=69){
        textInfo = "CD"
    }
    else if(note<=74){
        textInfo = "CC"
    }
    else if(note<=79){
        textInfo = "BC"
    }
    else if(note<=84){
        textInfo = "BB"
    }
    else if(note<=89){
        textInfo = "AB"
    }
    else {
        textInfo = "AA"
    }
}

info.innerHTML = `${textInfo} -> ${note}`