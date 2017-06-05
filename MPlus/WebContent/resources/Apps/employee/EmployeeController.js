app.controller('employeeController', function($scope, $http) {
 
 
 $scope.findEmployee = function(){
	var p =  {
		 params: $scope
	};
	 
	 $http.get("findEmployee",p)
	 .then(function(response) {
	     $scope.employeeList = response.data;
	 });
 };
});