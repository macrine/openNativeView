var exec = require('cordova/exec');

var openNativeView = function () {
  return {
    open: function (success, fail, androidClass, iosClass, params2, params3, params4, params5) {
      cordova.exec(success, fail, "openNativeView", "open", [androidClass, iosClass, params2, params3, params4, params5]);
    }
  };
}();

module.exports = openNativeView;
