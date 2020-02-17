angular.module('demo',[])
.controller('Hello',function($scope,$http){
    $http.get('localhost:8080/rest/greeting').
        then(function(response){
            $scope.greeting = response.data;
        });
});