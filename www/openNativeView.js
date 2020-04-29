var exec = require('cordova/exec');

var openNativeView = function () {
  return {
    open: function (success, fail, type, params) {
      cordova.exec(success, fail, "openNativeView", "open", [type, params]);
    }
  };
}();

module.exports = openNativeView;
