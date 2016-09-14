var app = angular.module('app',['ngRoute','ngResource','ngSanitize']);
app.config(function($routeProvider){
    $routeProvider 
        .when('/',{ templateUrl: '/index.html'}
        );
});
