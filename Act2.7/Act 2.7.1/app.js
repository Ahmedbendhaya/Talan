let counter =1;
setInterval(() => {
document.querySelector('h1').innerText = "Jour";



counter++;
if(counter >5)
{document.querySelector('h1').innerText = "Nuit";
document.querySelector('h1').style.color = "white";
document.body.style.backgroundColor= "black";



}
}, 1000);