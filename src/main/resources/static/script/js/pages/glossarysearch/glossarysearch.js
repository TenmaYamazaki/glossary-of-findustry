window.onload = function() {
  const addform = document.getElementsByClassName('addform');
  const addswitch = document.getElementById('customSwitch1');
  
  addswitch.onchange = function(){
    console.log(addform);
    if(addswitch) {
      addform[0].classList.toggle('hidden');
    }
  };
};