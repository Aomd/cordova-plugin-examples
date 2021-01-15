var exec = require('cordova/exec');


function Aomd() {

}

Aomd.run = function (data, success) {
  exec(
    success,
    function (errorMessage) {
      console.log(errorMessage)
    },
    'AomdForCordova',
    "test",
    [data]);
}

module.exports = Aomd;
