app.controller('ConsumoController', function($scope, $http) {
 
	$scope.consultar = function() {
		$http.get('http://localhost:9000/consumo').success(function(data){
			$scope.valor = data;
			$scope.energia = data.corrente;
			$scope.agua = data.aguaCubicos;
		});
	};
	$scope.consultar();
});