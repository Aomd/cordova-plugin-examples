var exec = require('cordova/exec');


function Aomd() {

}
// 方法名应与服务名称的方法名对应起来
Aomd.test = function (data, success) {
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
