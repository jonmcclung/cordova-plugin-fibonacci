var exec = require('cordova/exec');

var PLUGIN_NAME = 'FibonacciPlugin';

var fibonacci = {
    echo: function (phrase) {
        console.log('echo was successfully called!!!');
        exec(null, null, PLUGIN_NAME, 'echo', [phrase]);
    },
    getDate: function (success, failure) {
        exec(success, failure, PLUGIN_NAME, 'getDate', []);
    }
};

module.exports = fibonacci;