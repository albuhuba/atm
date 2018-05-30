function submit(){
$amount = document.getElementById('amountField').value;
fetch('http://localhost:8081/atm/?amount=' + $amount)
.then(response => response.json())
.then(function(data){
  console.log(data);
  var twenty_or_less_millimeter = data["coin_10"] + data["coin_1"];
  var twenty_plus_millimeter = data['coin_2'] + data['coin_5'] + data['coin_20'];
  var notes = data['note_50'] + data['note_100'] + data['note_200'] + data['note_500'] + data['note_1000'];
  console.log('ten millimeter: ' + twenty_or_less_millimeter);
  console.log('20+ millimeter: ' + twenty_plus_millimeter);
  console.log('notes: ' + notes);
  document.getElementById('note_count').innerHTML = notes;
  document.getElementById('coin_less_than_twenty_mm').innerHTML = twenty_or_less_millimeter;
  document.getElementById('coin_larger_than_twenty_mm').innerHTML = twenty_plus_millimeter;
})
.catch(error => console.error(error));
}