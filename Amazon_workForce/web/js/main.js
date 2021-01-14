$(document).on("click","#btn2",function(){

  //document.getElementById('btn2').style.width = '400px';
  document.getElementById('btn2').innerHTML="mukulsaroya@businessbargain.ca";
  document.getElementById("btn2").id = "rev1";
  //document.getElementById("btn2").style.transition = "all 0.4s";
});

$(document).on("click","#rev1",function(){

  //document.getElementById('rev1').style.width = '120px';
  document.getElementById('rev1').innerHTML="Email";
  document.getElementById("rev1").id = "btn2";
  //document.getElementById("rev1").style.transition = "all 0.4s";
});

$(document).on("click","#btn1",function(){

  //document.getElementById('btn1').style.width = '400px';
  document.getElementById('btn1').innerHTML="mukulsaroya@businessbargain.ca";
  document.getElementById("btn1").id = "rev";
  //document.getElementById("btn1").style.transition = "all 0.4s";
});

$(document).on("click","#rev",function(){

  //document.getElementById('rev').style.width = '120px';
  document.getElementById('rev').innerHTML="Email";
  document.getElementById("rev").id = "btn2";
  //document.getElementById("rev").style.transition = "all 0.4s";
});

$(document).on("click","#btn3",function(){

  //document.getElementById('btn3').style.width = '300px';
  document.getElementById('btn3').innerHTML="+1(647)527-3327";
  document.getElementById("btn3").id = "rev2";
  //document.getElementById("btn3").style.transition = "all 0.4s";
});

$(document).on("click","#rev2",function(){

  //document.getElementById('rev2').style.width = '120px';
  document.getElementById('rev2').innerHTML="Phone";
  document.getElementById("rev2").id = "btn3";
  //document.getElementById("rev2").style.transition = "all 0.4s";
});
function openForm() {
  document.getElementById("myForm").style.display = "block";
}

function closeForm() {
  document.getElementById("myForm").style.display = "none";
}
