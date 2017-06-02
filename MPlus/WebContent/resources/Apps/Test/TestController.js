angular.module('App').controller('TestController', ['$rootScope', '$scope', '$http', '$state', function ($rootScope,$scope, $http, $state) {
    var self = this;
    console.log(111);
    GetSession();
    function GetSession() {
//    	console.log(111);
        $http.get('Test/test')
        .then(function (response) {
        	console.log(response.data);
//        	$scope.Test = response.data.USER_ID;
//            $rootScope.UserName = response.data.USER_NAME;
//            $rootScope.GroupID = response.data.GROUP_ID;
//            $rootScope.Language = response.data.Language;
//            $rootScope.UserPicPath = response.data.PIC_PATH;
//            $rootScope.GCModel = response.data.GCModel;
//            console.log($rootScope.GCModel);
        })
        .catch(function (response) {
        });
    }
}]);


