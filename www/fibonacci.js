var exec = require('cordova/exec');

var PLUGIN_NAME = 'FibonacciPlugin';

var fibonacci = {
    echo: function (phrase, cb) {
        console.log('echo was successfully called!!!');
        exec(cb, null, PLUGIN_NAME, 'echo', [phrase]);
    },
    getDate: function (cb) {
        exec(cb, null, PLUGIN_NAME, 'getDate', []);
    }
};

module.exports = fibonacci;